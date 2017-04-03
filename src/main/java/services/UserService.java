package services;

import models.User;

import java.util.List;

/**
 * Created by ibm on 2017-03-30.
 */
public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User create(User user);
    User edit(User user);
    void deleteById(Long id);
}
