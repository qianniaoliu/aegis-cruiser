package com.cruiser.aegis.web.controller;

import com.cruiser.aegis.domain.model.User;
import com.cruiser.aegis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: qianniao
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/get/{id}")
    @ResponseBody
    public User get(@PathVariable Integer id){
        return userService.queryUserById(id);
    }
}
