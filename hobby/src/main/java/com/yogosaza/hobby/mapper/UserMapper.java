package com.yogosaza.hobby.mapper;

import com.yogosaza.hobby.domain.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface UserMapper {

  // 회원 가입
  public int insertUser(UserDomain domain) throws SQLException;

  // 회원 아이디 중복 확인
  public boolean existsByLoginId(String loginId) throws SQLException;

  // 회원 상세 조회
  public UserDomain selectUser(String loginId) throws SQLException;


}
