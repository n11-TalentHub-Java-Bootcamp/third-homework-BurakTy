package com.buraktuysuz.thirdhomework.service.entityService;

import com.buraktuysuz.thirdhomework.dao.ProductCommentDao;
import com.buraktuysuz.thirdhomework.dao.UserDao;
import com.buraktuysuz.thirdhomework.entity.ProductComment;
import com.buraktuysuz.thirdhomework.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCommentEntityService {

    @Autowired
    ProductCommentDao productCommentDao;

    public List<ProductComment> findAllComment(){
        return productCommentDao.findAll();
    }

    public ProductComment findCommentById(String Id){
        Optional<ProductComment> optional = productCommentDao.findById(Id);

        ProductComment productComment = null;
        if (optional.isPresent()){
            productComment = optional.get();
        }
        return productComment;
    }

    public boolean checkProductComment(String id){
        var comment = findCommentById(id);
        return comment!=null?false:true;
    }

    public ProductComment save(ProductComment productComment){
        return productCommentDao.save(productComment);
    }

    public void  deleteById(String id){
        if(!checkProductComment(id)){
            productCommentDao.deleteById(id);
            return;
        }
        throw new  NotFoundException("Comment Not Found");
    }
}
