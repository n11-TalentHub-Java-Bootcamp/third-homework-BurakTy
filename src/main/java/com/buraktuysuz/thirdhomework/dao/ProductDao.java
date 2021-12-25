package com.buraktuysuz.thirdhomework.dao;

import com.buraktuysuz.thirdhomework.entity.Product;
import com.buraktuysuz.thirdhomework.entity.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDao extends MongoRepository<Product,String> {
    
}
