package com.example.OneCityPerDay.entity;

import jakarta.persistence.*;

@Entity
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private String captionFr;
    private String captionEn;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getCaptionFr() { return captionFr; }
    public void setCaptionFr(String captionFr) { this.captionFr = captionFr; }

    public String getCaptionEn() { return captionEn; }
    public void setCaptionEn(String captionEn) { this.captionEn = captionEn; }
}
