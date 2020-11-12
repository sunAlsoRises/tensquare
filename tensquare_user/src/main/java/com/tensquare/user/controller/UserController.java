package com.tensquare.user.controller;

import com.tensquare.entity.Result;
import com.tensquare.entity.StatusCode;
import com.tensquare.user.pojo.User;
import com.tensquare.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public Result selectById(@PathVariable String id){
        User user = userService.findById(id);
        return new Result(true , StatusCode.OK,"查询成功",user);
    }
}
