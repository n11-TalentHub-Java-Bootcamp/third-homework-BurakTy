package com.buraktuysuz.thirdhomework.dao;

import com.buraktuysuz.thirdhomework.entity.ProductComment;
import com.buraktuysuz.thirdhomework.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductCommentDao extends MongoRepository<ProductComment,String> {

}
