package com.qyubix.controller;

import com.qyubix.dao.UserDao;
import com.qyubix.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDao user;

    @RequestMapping("/user")
    public Page<User> getAllProduct(Pageable page){
        return user.findAll(page);
    }

    //POST METHOD=======================================================================================================
    //PUT METHOD========================================================================================================
    //DELETE METHOD=====================================================================================================
}
