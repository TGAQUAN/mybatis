package com.mybatis.service;

import com.mybatis.entity.Users;
import com.mybatis.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsersService {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    Users getUserInfo(int id);

}
