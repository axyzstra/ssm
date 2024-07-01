package com.service.impl;

import com.annotation.InvokeLog;
import com.common.PageResult;
import com.dao.UserDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.User;
import com.service.UserService;
import com.common.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @InvokeLog
    public User findById(Integer id) {
        User user = userDao.findById(id);
        return user;
    }

    @Override
    @InvokeLog
    public List<User> findAll() {

        List<User> list = userDao.findAll();
        return list;
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public PageResult findByPage(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> all = userDao.findAll();
        PageInfo pageInfo = new PageInfo(all);
        PageResult pageResult = new PageResult(pageInfo.getPageNum(), pageInfo.getPageSize(), (int) pageInfo.getTotal(), all);
        return pageResult;
    }

    @Override
    @Transactional
    public void test() {
        userDao.delete(10);
        System.out.println(1 / 0);
        userDao.delete(11);
    }
}
