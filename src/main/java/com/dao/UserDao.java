package com.dao;


import com.pojo.User;

import java.util.List;

public interface UserDao {

    User findById(Integer id);

    List<User> findAll();

    int insert(User user);

    int update(User user);

    int delete(Integer id);


}
