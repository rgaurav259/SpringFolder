package com.example.reddit.redditclonebackend.repository;

import com.example.reddit.redditclonebackend.Model.Post;
import com.example.reddit.redditclonebackend.Model.Subreddit;
import com.example.reddit.redditclonebackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
