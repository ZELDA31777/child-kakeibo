package com.kakeibo.child_kakeibo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    
    private int amount;
    
    // LocalDateTime으로 해야할지, LocalDate로 해야할지 고민중.
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Builder
    public AccountEntry(String description, int amount, Member member) {
        this.description = description;
        this.amount = amount;
        this.member = member;
        this.date = LocalDate.now();
    }

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;
}
