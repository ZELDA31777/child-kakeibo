package com.kakeibo.child_kakeibo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kakeibo.child_kakeibo.entity.AccountEntry;
import com.kakeibo.child_kakeibo.repository.AccountEntryRepository;

@RestController
@RequestMapping("/api/entries")
public class AccountEntryController {
    
    private final AccountEntryRepository accountEntryRepository;

    public AccountEntryController(AccountEntryRepository accountEntryRepository) {
        this.accountEntryRepository = accountEntryRepository;
    }

    @GetMapping
    public List<AccountEntry> findAll() {
        return accountEntryRepository.findAll();
    }

    public AccountEntry create(@RequestBody AccountEntry entry) {
        return accountEntryRepository.save(entry);
    }
}
