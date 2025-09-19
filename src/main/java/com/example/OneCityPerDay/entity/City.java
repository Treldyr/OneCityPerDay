package com.example.OneCityPerDay.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cityNameFr;
    private String cityNameEn;
    private String countryNameFr;
    private String countryNameEn;
    private LocalDate date;

    @ElementCollection
    @CollectionTable(name = "city_description_fr", joinColumns = @JoinColumn(name = "city_id"))
    @Column(name = "description_fr", length = 1000)
    private List<String> descriptionFr;

    @ElementCollection
    @CollectionTable(name = "city_description_en", joinColumns = @JoinColumn(name = "city_id"))
    @Column(name = "description_fr", length = 1000)
    private List<String> descriptionEn;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Curiosity> curiosities;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Photo> photos;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCityNameFr() { return cityNameFr; }
    public void setCityNameFr(String cityNameFr) { this.cityNameFr = cityNameFr; }

    public String getCityNameEn() { return cityNameEn; }
    public void setCityNameEn(String cityNameEn) { this.cityNameEn = cityNameEn; }

    public String getCountryNameFr() { return countryNameFr; }
    public void setCountryNameFr(String countryNameFr) { this.countryNameFr = countryNameFr; }

    public String getCountryNameEn() { return countryNameEn; }
    public void setCountryNameEn(String countryNameEn) { this.countryNameEn = countryNameEn; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public List<String> getDescriptionFr() { return descriptionFr; }
    public void setDescriptionFr(List<String> descriptionFr) { this.descriptionFr = descriptionFr; }

    public List<String> getDescriptionEn() { return descriptionEn; }
    public void setDescriptionEn(List<String> descriptionEn) { this.descriptionEn = descriptionEn; }

    public List<Curiosity> getCuriosities() { return curiosities; }
    public void setCuriosities(List<Curiosity> curiosities) { this.curiosities = curiosities; }

    public List<Photo> getPhotos() { return photos; }
    public void setPhotos(List<Photo> photos) { this.photos = photos; }
}
