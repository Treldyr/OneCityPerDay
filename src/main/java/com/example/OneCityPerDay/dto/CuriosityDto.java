package com.example.OneCityPerDay.dto;

public class CuriosityDto {
    private String titleFr;
    private String titleEn;
    private String detailFr;
    private String detailEn;
    private String urlPhoto;
    private String attributionPhotoFr;
    private String attributionPhotoEn;

    public String getTitleFr() {
        return titleFr;
    }

    public void setTitleFr(String titleFr) {
        this.titleFr = titleFr;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getDetailFr() {
        return detailFr;
    }

    public void setDetailFr(String detailFr) {
        this.detailFr = detailFr;
    }

    public String getDetailEn() {
        return detailEn;
    }

    public void setDetailEn(String detailEn) {
        this.detailEn = detailEn;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getAttributionPhotoFr() {return attributionPhotoFr;}

    public void setAttributionPhotoFr(String attributionPhotoFr) {this.attributionPhotoFr = attributionPhotoFr;}

    public String getAttributionPhotoEn() {return attributionPhotoEn;}

    public void setAttributionPhotoEn(String attributionPhotoEn) {this.attributionPhotoEn = attributionPhotoEn;}
}
