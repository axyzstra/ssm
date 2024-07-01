package com.controller;

import com.common.PageResult;
import com.github.pagehelper.PageInfo;
import com.pojo.User;
import com.service.UserService;
import com.common.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findById/{id}")
    ResponseResult findById(@PathVariable Integer id) {
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseResult("500", "没有该用户");
        }
        return new ResponseResult("200", "单个用户查询成功", user);
    }

    @GetMapping("/findAll")
    ResponseResult findAll() {
        List<User> all = userService.findAll();
        if (all == null) {
            return new ResponseResult("500", "用户为空");
        }
        return new ResponseResult("200", "所有用户获取成功", all);
    }

    @PostMapping("/new")
    ResponseResult insert(@RequestBody User user) {
        int n = userService.insert(user);
        if (n > 0) {
            return new ResponseResult("200", "用户插入成功");
        }
        return new ResponseResult("500", "用户插入失败");
    }

    @PutMapping("/update")
    ResponseResult update(@RequestBody User user) {
        int n = userService.update(user);
        if (n > 0) {
            return new ResponseResult("200", "用户修改成功");
        }
        return new ResponseResult("500", "无该用户，修改失败");
    }

    @DeleteMapping("/delete/{id}")
    ResponseResult delete(@PathVariable Integer id) {
        int n = userService.delete(id);
        if (n > 0) {
            return new ResponseResult("200", "用户删除成功");
        }
        return new ResponseResult("500", "无该用户，删除失败");
    }

    @GetMapping("/user/{pageSize}/{pageNum}")
    public ResponseResult findByPage(@PathVariable Integer pageSize, @PathVariable Integer pageNum) {
//        System.out.println(1 / 0);
        PageResult page = userService.findByPage(pageSize, pageNum);
        return new ResponseResult("200", "分页查询成功", page);
    }

    @GetMapping("/test")
    public ResponseResult test() {
        userService.test();
        return new ResponseResult("200", "test 测试");
    }


}
