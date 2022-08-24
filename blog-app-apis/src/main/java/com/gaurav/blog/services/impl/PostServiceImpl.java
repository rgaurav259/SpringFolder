package com.gaurav.blog.services.impl;

import com.gaurav.blog.entities.Category;
import com.gaurav.blog.entities.Post;
import com.gaurav.blog.entities.User;
import com.gaurav.blog.exceptions.ResourceNotFoundException;
import com.gaurav.blog.payloads.PostDto;
import com.gaurav.blog.repositories.CategoryRepository;
import com.gaurav.blog.repositories.PostRepo;
import com.gaurav.blog.repositories.UserRepo;
import com.gaurav.blog.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Post updatePost(PostDto postDto, Integer postId) {
        return null;
    }

    @Override
    public void deletePost(Integer postId) {

    }

    @Override
    public List<Post> getAllPost() {
        return null;
    }

    @Override
    public Post getPostById(Integer postId) {
        return null;
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
    public List<Post> searchPosts(String keyword) {
        return null;
    }
}
