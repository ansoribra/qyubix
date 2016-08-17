package com.qyubix.controller;

import com.qyubix.dao.ProductDao;
import com.qyubix.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductDao product;

    @RequestMapping("/product")
    public Page<Product> getAllProduct(Pageable page){
        return product.findAll(page);
    }
}
