package com.cruiser.aegis.service.impl;

import com.cruiser.aegis.domain.model.User;
import com.cruiser.aegis.repository.mapper.UserMapper;
import com.cruiser.aegis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author: qianniao
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Integer id) {
        return userMapper.selectByPrimaryKey(1);
    }
}
