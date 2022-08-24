package com.gaurav.blog.repositories;

import com.gaurav.blog.entities.Category;
import com.gaurav.blog.entities.Post;
import com.gaurav.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {

    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);

    @Query("select p from Post p where p.title like:key")
    List<Post> searchByTitleContaining(@Param("key") String title);

    //alternate above query
    //implementation method we have to explicitly method searchByTitleContaining("%"keyword+"%")
}
