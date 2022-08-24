package com.gaurav.blog.services.impl;

import com.gaurav.blog.entities.Category;
import com.gaurav.blog.entities.Post;
import com.gaurav.blog.entities.User;
import com.gaurav.blog.exceptions.ResourceNotFoundException;
import com.gaurav.blog.payloads.PostDto;
import com.gaurav.blog.payloads.PostResponse;
import com.gaurav.blog.repositories.CategoryRepository;
import com.gaurav.blog.repositories.PostRepo;
import com.gaurav.blog.repositories.UserRepo;
import com.gaurav.blog.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId) {

        User user = this.userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User","UserId",userId));
        Category category= this.categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("category", "category", categoryId));

        Post post = this.modelMapper.map(postDto,Post.class);
        post.setImageName("default.png");
        post.setAddedDate(new Date());
        post.setUser(user);
        post.setCategory(category);
        Post save = this.postRepo.save(post);
        return this.modelMapper.map(save,PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto postDto, Integer postId) {
        Post post=   this.postRepo.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException
                        ("post","postId",postId));

        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setImageName(postDto.getImageName());

        Post save = this.postRepo.save(post);
        return this.modelMapper.map(save,PostDto.class);

    }

    @Override
    public void deletePost(Integer postId) {

     Post post=   this.postRepo.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException
                        ("post","postId",postId));

     this.postRepo.delete(post);


    }

    @Override
    public PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir) {
        //using paagination and sorting
        Sort sort=null;
        if (sortDir.equalsIgnoreCase("asc")){
           sort= Sort.by(sortBy).ascending();
        }else {
            sort=Sort.by(sortBy).descending();
        }

        //we can directly return seperate object of postResponse classes object

        Pageable p = PageRequest.of(pageNumber,pageSize, sort);

        Page<Post> pagepost = this.postRepo.findAll(p);
        List<Post> allPosts =  pagepost.getContent();

        List<PostDto> collectedpostDto = allPosts
              .stream()
              .map((post)-> this.modelMapper.map(post,PostDto.class))
              .collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();

        postResponse.setContent(collectedpostDto);
        postResponse.setPageNumber(pagepost.getNumber());
        postResponse.setPageSize(pagepost.getSize());
        postResponse.setTotalElements(pagepost.getTotalElements());

        postResponse.setTotalPages(pagepost.getTotalPages());
        postResponse.setLastPage(pagepost.isLast());


      return postResponse;




        //without pagination and sorting

//      List<Post> allPosts =  this.postRepo.findAll();
//      List<PostDto> collectedAllPostDto = allPosts
//              .stream()
//              .map((post)-> this.modelMapper.map(post,PostDto.class))
//              .collect(Collectors.toList());
//      return collectedAllPostDto;


    }

    @Override
    public PostDto getPostById(Integer postId) {
      Post post =  this.postRepo.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException
                        ("postid","postId",postId));

      //convert post to postDTO
      return this.modelMapper.map(post,PostDto.class);
    }

    @Override
    public List<PostDto> getPostsByCategory(Integer categoryId) {

        Category category =categoryRepository.findById(categoryId)
                .orElseThrow(()-> new  ResourceNotFoundException("category","category",categoryId));

        List<Post> posts= this.postRepo.findByCategory(category);

        List<PostDto> collectPostDto = posts.stream().map((post) -> this.modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());

        return collectPostDto;
    }

    @Override
    public List<PostDto> getPostsByUser(Integer userId) {

        User user = userRepo.findById(userId)
                .orElseThrow(()-> new ResourceNotFoundException("user","userId",userId));
        List<Post> postList=this.postRepo.findByUser(user);

        List<PostDto> postDtoList = postList.stream().map((post) -> this.modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());
        return postDtoList;
    }

    @Override
    public List<PostDto> searchPosts(String keyword) {
        List<Post> titleContaining = this.postRepo.findByTitleContaining(keyword);

     List<PostDto> postDtos =   titleContaining.stream().map((post)-> this.modelMapper.map(post,PostDto.class)).collect(Collectors.toList());

        return postDtos;
    }



}
