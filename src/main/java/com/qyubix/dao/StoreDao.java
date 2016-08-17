package com.qyubix.dao;

import com.qyubix.entity.Store;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StoreDao extends PagingAndSortingRepository<Store,String> {
}
