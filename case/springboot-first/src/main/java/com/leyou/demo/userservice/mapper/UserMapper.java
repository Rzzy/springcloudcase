package com.leyou.demo.userservice.mapper;

import com.leyou.demo.userservice.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{

}
