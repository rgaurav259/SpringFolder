package com.example.reddit.redditclonebackend.repository;
import com.example.reddit.redditclonebackend.Model.Comment;
import com.example.reddit.redditclonebackend.Model.Post;
import com.example.reddit.redditclonebackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
