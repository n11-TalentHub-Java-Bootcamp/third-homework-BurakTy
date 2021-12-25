package com.buraktuysuz.thirdhomework.dao;

import com.buraktuysuz.thirdhomework.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends MongoRepository<CategoryDao,String> {
    
}
