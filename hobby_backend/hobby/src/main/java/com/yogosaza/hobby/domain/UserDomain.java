package com.yogosaza.hobby.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDomain {

  private Integer id;
  private String loginId;
  private String password;
  private String name;
  private String email;
  private String phone;
  private LocalDateTime createdAt;

}
