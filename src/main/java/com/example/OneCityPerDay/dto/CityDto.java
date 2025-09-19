package com.example.OneCityPerDay.dto;

import java.time.LocalDate;
import java.util.List;

public class CityDto {
    private Long  id;
    private String cityNameFr;
    private String cityNameEn;
    private String countryNameFr;
    private String countryNameEn;
    private LocalDate date;
    private List<String> descriptionFr;
    private List<String> descriptionEn;
    private List<CuriosityDto> curiosities;
    private List<PhotoDto> photos;

    public String getCityNameFr() {
        return cityNameFr;
    }

    public void setCityNameFr(String cityNameFr) {
        this.cityNameFr = cityNameFr;
    }

    public String getCityNameEn() {
        return cityNameEn;
    }

    public void setCityNameEn(String cityNameEn) {
        this.cityNameEn = cityNameEn;
    }

    public String getCountryNameFr() {
        return countryNameFr;
    }

    public void setCountryNameFr(String countryNameFr) {
        this.countryNameFr = countryNameFr;
    }

    public String getCountryNameEn() {
        return countryNameEn;
    }

    public void setCountryNameEn(String countryNameEn) {
        this.countryNameEn = countryNameEn;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<String> getDescriptionFr() {
        return descriptionFr;
    }

    public void setDescriptionFr(List<String> descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    public List<String> getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(List<String> descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public List<CuriosityDto> getCuriosities() {
        return curiosities;
    }

    public void setCuriosities(List<CuriosityDto> curiosities) {
        this.curiosities = curiosities;
    }

    public List<PhotoDto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotoDto> photos) {
        this.photos = photos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}