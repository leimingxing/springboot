package com.soaci.springboot.controller;


import com.github.pagehelper.PageHelper;
import com.soaci.springboot.entity.PageBean;
import com.soaci.springboot.entity.PageModel;
import com.soaci.springboot.entity.ResponseResult;
import com.soaci.springboot.entity.User;
import com.soaci.springboot.service.UserService;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userServiceImpl;

    @RequestMapping(value = "/regiter",method = RequestMethod.POST)
    public String regiter(HttpServletRequest request){

        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            User user=new User();
            user.setUsername(username);
            user.setPassword(password);

            userServiceImpl.insertUser(user);
            return userServiceImpl.insertUser(user)+"";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @RequestMapping("/findAllUser")
    public List<User>  findAllUser(){
        return userServiceImpl.selectAllUser();
    }
    @RequestMapping("/findAllUserJson")
    public ResponseResult<PageBean>  findAllUserJson(PageModel pageModel){

        ResponseResult<PageBean> responseResult;
        try {
            PageHelper.startPage(pageModel.getPageNum(),pageModel.getPageSize());
            PageHelper.orderBy("id asc");
            List<User> users = userServiceImpl.selectAllUser();
            PageBean<User> userPageBean = new PageBean<>(users);
            responseResult= new ResponseResult<PageBean>("success",200,userPageBean);

        } catch (Exception e) {
            e.printStackTrace();
            responseResult= new ResponseResult<PageBean>("failure",501,null);
        }

        return responseResult;
    }

}
