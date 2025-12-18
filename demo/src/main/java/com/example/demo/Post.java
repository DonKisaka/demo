package com.example.demo;

public record Post (
        Integer userId,
        Integer id,
        String title,
        String body
) {}
