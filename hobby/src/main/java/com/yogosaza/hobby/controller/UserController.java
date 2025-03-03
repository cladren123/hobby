package com.yogosaza.hobby.controller;


import com.yogosaza.hobby.dto.UserRequestDto;
import com.yogosaza.hobby.dto.UserResponseDto;
import com.yogosaza.hobby.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    // 회원 가입 
    @PostMapping("")
    public ResponseEntity<?> insertUser(@RequestBody UserRequestDto dto) throws SQLException {
        int result = userService.insertUser(dto);
        String ment = "";
        if (result == 0) {
            ment = "이미 존재하는 회원입니다.";
        } else if (result == 1) {
            ment = "회원 가입이 성공했습니다.";
        }
        return ResponseEntity.ok(ment);
    }
    
    // 회원 조회
    @GetMapping("/{loginId}")
    public ResponseEntity<?> getUser(@PathVariable String loginId) throws SQLException {
        UserResponseDto result = userService.selectUser(loginId);
        return ResponseEntity.ok(result);
    }


}
