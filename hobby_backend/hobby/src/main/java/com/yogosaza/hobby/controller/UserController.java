package com.yogosaza.hobby.controller;


import com.yogosaza.hobby.dto.UserLoginDto;
import com.yogosaza.hobby.dto.UserRequestDto;
import com.yogosaza.hobby.dto.UserResponseDto;
import com.yogosaza.hobby.service.UserService;
import com.yogosaza.hobby.util.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    // 회원 가입 
    @PostMapping("")
    public ResponseEntity<?> insertUser(@RequestBody UserRequestDto dto) throws SQLException {
        int result = userService.insertUser(dto);
        String message = "";
        if (result == 0) {
            message = Message.USER_DUPLICATE;
        } else if (result == 1) {
            message = Message.USER_INSERT_SUCCESS;
        }
        return ResponseEntity.ok(message);
    }

    // 회원 로그인
    @PostMapping("/login")
    public ResponseEntity<?> userLogin(@RequestBody UserLoginDto dto) throws Exception {
        UserResponseDto result = userService.loginUser(dto);
        return ResponseEntity.ok(result);
    }

    // 회원 조회
    @GetMapping("/{loginId}")
    public ResponseEntity<?> getUser(@PathVariable String loginId) throws SQLException {

        UserResponseDto result = userService.selectUser(loginId);
        return ResponseEntity.ok(result);
    }


}
