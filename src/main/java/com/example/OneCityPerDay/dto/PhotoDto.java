package com.example.OneCityPerDay.dto;

public class PhotoDto {
    private String url;
    private String captionFr;
    private String captionEn;
    private String attributionFr;
    private String attributionEn;

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

    public String getAttributionFr() {return attributionFr;}

    public void setAttributionFr(String attributionFr) {this.attributionFr = attributionFr;}

    public String getAttributionEn() {return attributionEn;}

    public void setAttributionEn(String attributionEn) {this.attributionEn = attributionEn;}
}
