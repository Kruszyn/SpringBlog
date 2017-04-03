package services;

import models.Post;

import java.util.List;

/**
 * Created by ibm on 2017-03-25.
 */
public interface PostService {
    List<Post> findAll();
    Post findById(Long id);
    List<Post> findLatest5();
    void add(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
