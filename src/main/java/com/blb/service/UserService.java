package com.blb.service;

import com.blb.mapper.UserMapper;
import com.blb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Mr.Xue
 * @Description:
 * @Date: Created in 16:36 2019/12/25
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long i) {
        return userMapper.selectByPrimaryKey(i);
    }

    @Transactional
    public int deleteUserById(Long i) {
        return userMapper.deleteByPrimaryKey(i);
    }

    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }
}
