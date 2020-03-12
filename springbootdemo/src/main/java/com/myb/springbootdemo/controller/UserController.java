package com.myb.springbootdemo.controller;

import com.myb.springbootdemo.model.User;
import com.myb.springbootdemo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping //GET  restful风格
    public List<User> all(){
        return  this.userDao.findAll();
    }

    /**
     * 保存用户
     * @param user
     * @return
     */
    @PostMapping  //POST
    public Object  save(@RequestBody User user){
        this.userDao.save(user);
        return true;
    }

    /**
     * 根据ID删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public  Object delete(@PathVariable("id") Long id){
        this.userDao.deleteById(id);
        return true;
    }

}
