package com.example.playground.database.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.playground.database.entity.AccountEntity;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    void findAllShouldReturnAllEntities() {
        List<AccountEntity> accountEntities = accountRepository.findAll();
        assertThat(accountEntities).hasSize(2);
        assertThat(accountEntities.get(0).getName()).isEqualTo("n1");
    }
}