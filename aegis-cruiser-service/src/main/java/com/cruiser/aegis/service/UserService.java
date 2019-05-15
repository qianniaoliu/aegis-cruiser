package com.cruiser.aegis.service;

import com.cruiser.aegis.domain.model.User;


/**
 * @author: qianniao
 */
public interface UserService {

    /**
     * 通过主键id查询用户
     * @return {@link User}
     */
    User queryUserById(Integer id);
}
