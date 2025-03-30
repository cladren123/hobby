package com.yogosaza.hobby.dto;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
  private String loginId;
  private String name;
  private String email;
  private String phone;
}
