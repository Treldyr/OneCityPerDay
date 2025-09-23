package com.example.OneCityPerDay.dto;

import java.time.LocalDate;

public class CityDateDto {
    private Long id;
    private LocalDate date;

    public CityDateDto(Long id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }
}

