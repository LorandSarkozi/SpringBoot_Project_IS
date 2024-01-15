package com.example.is_project2.dto;


import lombok.Builder;
import java.util.List;
import java.time.LocalDate;
@Builder
public record BookDto(
        String author,
        String title,
        int quantity,
        double price
                     ) {}
