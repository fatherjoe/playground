package com.example.playground.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDto {
    Long id;
    String name;
}
