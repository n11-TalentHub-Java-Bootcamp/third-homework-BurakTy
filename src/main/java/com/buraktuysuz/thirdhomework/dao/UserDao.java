package com.buraktuysuz.thirdhomework.dao;

import com.buraktuysuz.thirdhomework.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends MongoRepository<User,String> {
    @Query("{'username':?0}")
    List<User> findUserByUsername(String name);
}
