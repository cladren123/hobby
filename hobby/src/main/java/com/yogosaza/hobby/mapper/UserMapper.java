package com.yogosaza.hobby.mapper;

import com.yogosaza.hobby.dto.UserRegisterDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;

@Mapper
public interface UserMapper {

  public int registerUser(UserRegisterDto dto) throws SQLException;


}
