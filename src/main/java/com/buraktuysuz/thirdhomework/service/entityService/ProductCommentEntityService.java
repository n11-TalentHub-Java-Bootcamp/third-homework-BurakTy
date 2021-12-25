package com.buraktuysuz.thirdhomework.service.entityService;

import com.buraktuysuz.thirdhomework.dao.ProductCommentDao;
import com.buraktuysuz.thirdhomework.dao.UserDao;
import com.buraktuysuz.thirdhomework.entity.ProductComment;
import com.buraktuysuz.thirdhomework.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCommentEntityService {

    @Autowired
    ProductCommentDao productCommentDao;

    public List<ProductComment> findAllUser(){
        return productCommentDao.findAll();
    }

    public ProductComment finUserById(String Id){
        Optional<ProductComment> optional = productCommentDao.findById(Id);

        ProductComment productComment = null;
        if (optional.isPresent()){
            productComment = optional.get();
        }
        return productComment;
    }

    public ProductComment save(ProductComment productComment){
        return productCommentDao.save(productComment);
    }
}
