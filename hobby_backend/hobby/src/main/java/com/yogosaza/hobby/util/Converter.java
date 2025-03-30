package com.yogosaza.hobby.util;

import com.yogosaza.hobby.domain.UserDomain;
import com.yogosaza.hobby.dto.UserRequestDto;
import com.yogosaza.hobby.dto.UserResponseDto;


public class Converter {

  public static UserDomain userRequsetDtoToUserDomain(UserRequestDto dto) {
    return UserDomain.builder()
            .loginId(dto.getLoginId())
            .password(dto.getPassword())
            .name(dto.getName())
            .email(dto.getEmail())
            .phone(dto.getPhone())
            .build();
  }

  public static UserResponseDto userDomainToUserResponse(UserDomain domain) {
    return UserResponseDto.builder()
            .loginId(domain.getLoginId())
            .name(domain.getName())
            .email(domain.getEmail())
            .phone(domain.getPhone())
            .build();
  }


}
