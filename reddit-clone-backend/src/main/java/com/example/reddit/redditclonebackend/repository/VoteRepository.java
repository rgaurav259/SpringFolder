package com.example.reddit.redditclonebackend.repository;

import com.example.reddit.redditclonebackend.Model.Post;
import com.example.reddit.redditclonebackend.Model.User;
import com.example.reddit.redditclonebackend.Model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
