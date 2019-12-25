package com.blb.controller;

import com.blb.pojo.User;
import com.blb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Mr.Xue
 * @Description:
 * @Date: Created in 16:06 2019/12/25
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("word")
    public @ResponseBody String sayHello(){
        System.out.println("success");
        return "success";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User  queryUserById(@PathVariable("id") Long i){
        User user=userService.queryUserById(i);
        return user;
    }

    @GetMapping("/del/{id}")
    @ResponseBody
    public String  deleteUserById(@PathVariable("id") Long i){
        int row=userService.deleteUserById(i);
        if(row>0) return "success";
        return "error";
    }

    @GetMapping("list")
    public String queryAllUser(Model model){
        List<User> list=userService.queryAllUser();
        model.addAttribute("users",list);
        return "item";
    }

}
