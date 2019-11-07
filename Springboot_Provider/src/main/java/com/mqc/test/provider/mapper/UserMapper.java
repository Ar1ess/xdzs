package com.mqc.test.provider.mapper;

import model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Ar1es
 * @date : 2019/7/30
 * @since : Java 8
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT  user_id as userId, user_name as userName, phone as phone, password as password FROM t_user")
    List<User> getAll();
}
