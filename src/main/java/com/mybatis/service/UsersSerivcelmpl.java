package com.mybatis.service;

import com.mybatis.entity.Users;
import com.mybatis.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersSerivcelmpl implements UsersService {
     @Autowired
     private UsersMapper usersMapper;

    @Override
    public Users getUserInfo(int id) {
        Users userInfo = usersMapper.getUserInfo(id);
        return userInfo;
    }


}
