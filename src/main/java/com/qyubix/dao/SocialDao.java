package com.qyubix.dao;

import com.qyubix.entity.Social;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SocialDao extends PagingAndSortingRepository<Social,String> {
}
