package com.example.OneCityPerDay.entity;

import jakarta.persistence.*;

@Entity
public class Curiosity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titleFr;
    private String titleEn;

    @Column(length = 2000)
    private String detailFr;

    @Column(length = 2000)
    private String detailEn;

    private String urlPhoto;

    private String attributionPhoto;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public City getCity() { return city; }
    public void setCity(City city) { this.city = city; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitleFr() { return titleFr; }
    public void setTitleFr(String titleFr) { this.titleFr = titleFr; }

    public String getTitleEn() { return titleEn; }
    public void setTitleEn(String titleEn) { this.titleEn = titleEn; }

    public String getDetailFr() { return detailFr; }
    public void setDetailFr(String detailFr) { this.detailFr = detailFr; }

    public String getDetailEn() { return detailEn; }
    public void setDetailEn(String detailEn) { this.detailEn = detailEn; }

    public String getUrlPhoto() { return urlPhoto; }
    public void setUrlPhoto(String urlPhoto) { this.urlPhoto = urlPhoto; }

    public String getAttributionPhoto() {return attributionPhoto;}
    public void setAttributionPhoto(String attributionPhoto) {this.attributionPhoto = attributionPhoto;}
}
