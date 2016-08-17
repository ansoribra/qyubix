package com.qyubix.dao;

import com.qyubix.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User,String> {
}
