package com.mybatis.mapper;

import com.mybatis.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UsersMapper {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    Users getUserInfo(int id);

}
