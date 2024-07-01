package com.service;

import com.common.PageResult;
import com.common.ResponseResult;
import com.github.pagehelper.PageInfo;
import com.pojo.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    List<User> findAll();

    int insert(User user);

    int update(User user);

    int delete(Integer id);

    PageResult findByPage(Integer pageSize, Integer pageNum);

    void test();
}
