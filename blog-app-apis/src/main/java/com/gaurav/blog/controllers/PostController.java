package com.gaurav.blog.controllers;


import com.gaurav.blog.entities.Post;
import com.gaurav.blog.payloads.PostDto;
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

}
