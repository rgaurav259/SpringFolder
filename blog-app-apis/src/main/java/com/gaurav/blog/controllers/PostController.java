package com.gaurav.blog.controllers;


import com.gaurav.blog.config.AppConstants;

import com.gaurav.blog.payloads.ApiResponse;
import com.gaurav.blog.payloads.PostDto;
import com.gaurav.blog.payloads.PostResponse;
import com.gaurav.blog.services.FileService;
import com.gaurav.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    
    @Autowired
    private PostService postService;
    @Autowired
    private FileService fileService;

    @Value("${project.image}")
    private String path;

    @PostMapping("/user/{userId}/category/{categoryId}/posts/")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto,
                                                @PathVariable Integer userId,
                                                @PathVariable Integer categoryId){

        PostDto createdPost = this.postService.createPost(postDto, userId, categoryId);

        return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
    }


    //getBy user
    @GetMapping("/user/{userId}/posts")
    public ResponseEntity<List<PostDto>> getPostByuser(@PathVariable("userId") Integer userId){
        List<PostDto> postsByUser = this.postService.getPostsByUser(userId);
        return new ResponseEntity<>(postsByUser,HttpStatus.OK);
    }


    //get by category

    @GetMapping("/category/{categoryId}/posts")
    public ResponseEntity<List<PostDto>> getPostByCategory(@PathVariable("categoryId") Integer categoryId){
        List<PostDto> postsByUser = this.postService.getPostsByCategory(categoryId);
        return new ResponseEntity<>(postsByUser,HttpStatus.OK);
    }

    //getALL pOSTS

    @GetMapping("/allposts")
    public ResponseEntity<PostResponse> getAllPosts(@RequestParam(value = "pageNumber",defaultValue = AppConstants.PAGE_NUMBER,required = false)
                                                        @PathVariable Integer pageNumber,
                                                    @RequestParam(value = "pageSize",defaultValue = AppConstants.PAGE_SIZE,required = false)
                                                         @PathVariable Integer pageSize,
                                                    @RequestParam(value = "sortBy",defaultValue = AppConstants.SORT_BY,required = false)
                                                         @PathVariable String sortBy,
                                                    @RequestParam(value = "sortDir",defaultValue = AppConstants.SORT_DIR,required = false)
                                                         @PathVariable String sortDir){

        PostResponse allPost = this.postService.getAllPost(pageNumber, pageSize, sortBy, sortDir);
        return new ResponseEntity<>(allPost, HttpStatus.OK);
    }

    //getPost By ID
    @GetMapping("post/{postId}")
    public ResponseEntity<PostDto> getPostById(@PathVariable("postId") Integer postId){
        PostDto postById = this.postService.getPostById(postId);
        return new ResponseEntity<>(postById,HttpStatus.OK);
    }

    //update post
    @PutMapping("/updatepost/{postId}")
    public ResponseEntity<PostDto> updatePost(@RequestBody  PostDto postDto, @PathVariable("postId") Integer postId){
        PostDto updatedPost = this.postService.updatePost(postDto, postId);
        return new ResponseEntity<>(updatedPost,HttpStatus.OK);
    }

    //delete post
    @DeleteMapping("/deletePostByID/{postId}")
    public ApiResponse deletePost(@PathVariable("postId") Integer postId){
        this.postService.deletePost(postId);
        return new ApiResponse("deleted....",true);

    }


    //search by title
    @GetMapping("/posts/search/{keywords}")
    public ResponseEntity<List<PostDto>> searchPostByTitle(
            @PathVariable("keywords") String keywords){
        List<PostDto> searchPosts = this.postService.searchPosts(keywords);
        return new ResponseEntity<>(searchPosts,HttpStatus.OK);
    }


    //post image upload

    @PostMapping("/image/upload/{postId}")
    public ResponseEntity<PostDto> uploadPostImage(@RequestParam("image") MultipartFile image, @PathVariable Integer postId) throws IOException {


        PostDto postDto = this.postService.getPostById(postId);

        String fileName = this.fileService.uploadImage(path,image);
        postDto.setImageName(fileName);
        PostDto updatedpost=this.postService.updatePost(postDto,postId);
        return new ResponseEntity<>(updatedpost,HttpStatus.OK);

    }

    //serving images over database method to serve files
    @GetMapping(value = "/post/image/{imageName}",produces = MediaType.IMAGE_JPEG_VALUE)
    public void downloadImage(@PathVariable("imageName") String imageName, HttpServletResponse response)throws IOException{
        InputStream resource = this.fileService.getResource(path,imageName);
        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(resource,response.getOutputStream());

    }


}
