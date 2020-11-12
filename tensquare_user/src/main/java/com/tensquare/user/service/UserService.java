package com.tensquare.user.service;

import com.tensquare.user.dao.UserDao;
import com.tensquare.user.pojo.User;
import com.tensquare.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
/*
    @Autowired
    private IdWorker idWorker;*/



    public User findById(String articleId) {
        return userDao.selectById(articleId);
    }


}
