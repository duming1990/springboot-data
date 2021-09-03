package com.duming.mapper;

import com.duming.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示这是一个mybatis的mapper类
@Mapper
@Repository
public interface UserMapper {
     List<User> getUserList();
}
