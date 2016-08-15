package com.qyubix.dao;

import com.qyubix.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product,String> {
}
