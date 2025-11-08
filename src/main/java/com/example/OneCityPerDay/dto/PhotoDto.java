package com.example.OneCityPerDay.dto;

public class PhotoDto {
    private String url;
    private String captionFr;
    private String captionEn;
    private String attribution;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCaptionFr() {
        return captionFr;
    }

    public void setCaptionFr(String captionFr) {
        this.captionFr = captionFr;
    }

    public String getCaptionEn() {
        return captionEn;
    }

    public void setCaptionEn(String captionEn) {
        this.captionEn = captionEn;
    }

    public String getAttribution() {return attribution;}

    public void setAttribution(String attribution) {this.attribution = attribution;}
}
