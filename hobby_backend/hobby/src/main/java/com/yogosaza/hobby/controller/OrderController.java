package com.yogosaza.hobby.controller;

import com.yogosaza.hobby.dto.OrderRegisterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

  @PostMapping("")
  public ResponseEntity<?> registerOrder(@RequestBody OrderRegisterDto dto) {
    return ResponseEntity.ok("ok");
  }

}
