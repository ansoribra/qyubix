package com.qyubix.controller;

import com.qyubix.dao.SocialDao;
import com.qyubix.entity.Social;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialController {

    @Autowired
    private SocialDao social;

    @RequestMapping("/social")
    public Page<Social> getAllProduct(Pageable page){
        return social.findAll(page);
    }
}
