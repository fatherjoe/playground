package com.example.playground.web.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
@AutoConfigureMockMvc
public class AccountControllerMvcTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    @WithMockUser
    void getAccountShouldReturnValue() throws Exception {
        mockMvc.perform(
                get("/accounts/4711"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
