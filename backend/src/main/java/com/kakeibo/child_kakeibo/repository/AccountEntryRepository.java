package com.kakeibo.child_kakeibo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakeibo.child_kakeibo.entity.AccountEntry;

public interface AccountEntryRepository extends JpaRepository<AccountEntry, Long> {
    
}
