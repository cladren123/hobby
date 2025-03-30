package com.yogosaza.hobby.service;

import com.yogosaza.hobby.domain.UserDomain;
import com.yogosaza.hobby.dto.UserLoginDto;
import com.yogosaza.hobby.dto.UserRequestDto;
import com.yogosaza.hobby.dto.UserResponseDto;
import com.yogosaza.hobby.mapper.UserMapper;
import com.yogosaza.hobby.util.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserMapper userMapper;

  // 회원 가입
  public int insertUser(UserRequestDto dto) throws SQLException {
    if (existsByLoginId(dto)) {
      return 0;
    }
    else {
      UserDomain userDomain = Converter.userRequsetDtoToUserDomain(dto);
      return userMapper.insertUser(userDomain);
    }
  }

  // 회원 아이디 중복 확인
  public boolean existsByLoginId(UserRequestDto dto) throws SQLException {
    return userMapper.existsByLoginId(dto.getLoginId());
  }

  // 회원 로그인
  public UserResponseDto loginUser(UserLoginDto dto) throws Exception {
    UserDomain responseUserDomain = userMapper.loginUser(dto);
    if (responseUserDomain == null) {
      throw new RuntimeException("로그인 실패했습니다.");
    }
    return Converter.userDomainToUserResponse(responseUserDomain);
  }
  
  // 회원 상세 조회
  public UserResponseDto selectUser(String loginId) throws SQLException {
    UserDomain responseUserDomain = userMapper.selectUser(loginId);
    return Converter.userDomainToUserResponse(responseUserDomain);
  }






}
