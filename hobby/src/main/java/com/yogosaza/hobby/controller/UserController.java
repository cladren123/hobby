package com.yogosaza.hobby.controller;


import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {


    @GetMapping("")
    public ResponseEntity<?> getUser(@RequestParam Integer uuid) {
        return ResponseEntity.ok("ok");
    }



}
