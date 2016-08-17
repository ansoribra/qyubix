package com.qyubix.controller;

import com.qyubix.dao.StoreDao;
import com.qyubix.entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @Autowired
    private StoreDao store;

    @RequestMapping("/store")
    public Page<Store> getAllProduct(Pageable page){
        return store.findAll(page);
    }
}
