package com.yogosaza.hobby.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
  private String loginId;
  private String password;
  private String name;
  private String email;
  private String phone;
}
