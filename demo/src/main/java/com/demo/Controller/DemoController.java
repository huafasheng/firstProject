package com.demo.Controller;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    private UserMapper userMapper;
    /**
     *	查询所有用户信息
     */
    @GetMapping("/queryList")
    public List<User> hello()	{
        List<User>	users = userMapper.queryList();
        return	users;
    }
}
