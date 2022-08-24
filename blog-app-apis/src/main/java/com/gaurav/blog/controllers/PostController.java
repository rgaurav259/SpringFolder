package com.gaurav.blog.controllers;


import com.gaurav.blog.config.AppConstants;
import com.gaurav.blog.entities.Post;
import com.gaurav.blog.payloads.ApiResponse;
import com.gaurav.blog.payloads.PostDto;
import com.gaurav.blog.payloads.PostResponse;
import com.gaurav.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    
    @Autowired
    private PostService postService;

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

}
