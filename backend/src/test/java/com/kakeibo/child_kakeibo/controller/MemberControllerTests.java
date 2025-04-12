package com.kakeibo.child_kakeibo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.kakeibo.child_kakeibo.entity.Member;
import com.kakeibo.child_kakeibo.repository.MemberRepository;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class MemberControllerTests {
    
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void setup() {
        memberRepository.deleteAll();
    }

    @Test
    
    void testCreateMember() throws Exception {
        Member member = new Member();
        member.setUsername("john");
        member.setEmail("john@example.com");

        mockMvc.perform(post("/api/members")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(member)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username", is("john")))
                .andExpect(jsonPath("$.email", is("john@example.com")));
    }

    @Test
    void testGetAllMembers() throws Exception {
        mockMvc.perform(get("/api/members"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON));

    }
}
