package com.duming.controller;

import com.duming.entity.User;
import com.duming.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/userList")
    public String userList(){
        System.out.println("======jdbcTemplate.queryForList(sql)=========");
        User user = new User();

        String sql="select * from user";
        return jdbcTemplate.queryForList(sql).toString();
    }

    @Autowired
    UserMapper userMapper;
    @RequestMapping("/userList2")
    public String userList2(){
        System.out.println("======userMapper.getUserList()=========");
        return userMapper.getUserList().toString();
    }

}
