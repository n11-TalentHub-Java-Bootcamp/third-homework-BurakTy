package com.buraktuysuz.thirdhomework.controller;

import com.buraktuysuz.thirdhomework.converter.ProductCommentConverter;
import com.buraktuysuz.thirdhomework.converter.UserConverter;
import com.buraktuysuz.thirdhomework.dto.ProductCommentDto;
import com.buraktuysuz.thirdhomework.dto.UserRegisterDto;
import com.buraktuysuz.thirdhomework.entity.ProductComment;
import com.buraktuysuz.thirdhomework.entity.User;
import com.buraktuysuz.thirdhomework.service.entityService.ProductCommentEntityService;
import com.buraktuysuz.thirdhomework.service.entityService.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/comments")
public class ProductCommentController {

    @Autowired
    ProductCommentEntityService productCommentEntityService;

    @GetMapping("/")
    public List<ProductComment> findAllUser(){
        return productCommentEntityService.findAllComment();
    }

   
    @GetMapping("/{id}")
    public ProductComment findCommentById(@PathVariable String id){
        return productCommentEntityService.findCommentById(id);
    }


    @PostMapping("/")
    public ProductComment saveComment(@RequestBody ProductCommentDto productCommentDto){
        ProductComment comment=  ProductCommentConverter.INSTANCE.ConvertProductCommentDtoToProductComment(productCommentDto);
        return productCommentEntityService.save(comment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id){
        try {
            productCommentEntityService.deleteById(id);
            return new ResponseEntity<>("Delete Successful", OK);
        }catch (RuntimeException e){
            return new ResponseEntity<>(e.getMessage(),NOT_FOUND);
        }

    }
}
