package com.buraktuysuz.thirdhomework.service.entityService;

import com.buraktuysuz.thirdhomework.dao.UserDao;
import com.buraktuysuz.thirdhomework.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserEntityService {

    @Autowired
    UserDao userDao;

    public List<User> findAllUser(){
        return userDao.findAll();
    }

    public User finUserById(String Id){
        Optional<User> optional = userDao.findById(Id);

        User user = null;
        if (optional.isPresent()){
            user = optional.get();
        }
        return user;
    }
    public User findUserByUsername(String username){
        var user=userDao.findUserByUsername(username);
        return user;
    }
    public boolean checkUsername(String username){
        var user=userDao.findUserByUsername(username);
        return user!=null?false:true;
    }
    public boolean checkUserById(String id){
        var user=finUserById(id);
        return user!=null?false:true;
    }

    public User save(User user){
        return userDao.save(user);
    }
    public void deleteById(String id){
         userDao.deleteById(id);
    }
    public void delete(User user){
         userDao.delete(user);
    }
}
