package com.buraktuysuz.thirdhomework.service.entityService;

import com.buraktuysuz.thirdhomework.dao.ProductDao;
import com.buraktuysuz.thirdhomework.dao.UserDao;
import com.buraktuysuz.thirdhomework.entity.Product;
import com.buraktuysuz.thirdhomework.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductEntityService {

    @Autowired
    ProductDao productDao;

    public List<Product> findAllUser(){
        return productDao.findAll();
    }

    public Product finUserById(String Id){
        Optional<Product> optional = productDao.findById(Id);

        Product product = null;
        if (optional.isPresent()){
            product = optional.get();
        }
        return product;
    }

    public Product save(Product product){
        return productDao.save(product);
    }
}
