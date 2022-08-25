package com.gaurav.blog.services.impl;

import com.gaurav.blog.entities.Comment;
import com.gaurav.blog.entities.Post;
import com.gaurav.blog.exceptions.ResourceNotFoundException;
import com.gaurav.blog.payloads.CommentDto;
import com.gaurav.blog.repositories.CommentRepo;
import com.gaurav.blog.repositories.PostRepo;
import com.gaurav.blog.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;
    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post = this.postRepo.findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("post","postId",postId));


        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savecomment = this.commentRepo.save(comment);


        return this.modelMapper.map(savecomment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment comment = this.commentRepo.findById(commentId)
                .orElseThrow(() -> new ResourceNotFoundException("comment", "commentId", commentId));

        this.commentRepo.delete(comment);
    }
}
