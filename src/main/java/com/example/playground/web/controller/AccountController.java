package com.example.playground.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.playground.web.dto.AccountDto;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{id}")
    public AccountDto getAccount(@PathVariable Long id) {
        return AccountDto.builder().id(4711L).name("n4711").build();
    }
}
