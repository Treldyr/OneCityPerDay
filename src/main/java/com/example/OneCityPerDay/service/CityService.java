package com.example.OneCityPerDay.service;

import com.example.OneCityPerDay.dto.CityDto;
import com.example.OneCityPerDay.dto.CuriosityDto;
import com.example.OneCityPerDay.dto.PhotoDto;
import com.example.OneCityPerDay.entity.City;
import com.example.OneCityPerDay.entity.Curiosity;
import com.example.OneCityPerDay.entity.Photo;
import com.example.OneCityPerDay.repository.CityRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public void clearCities() {
        cityRepository.deleteAll();
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    // Conversion Entity -> DTO
    public CityDto toDto(City city) {
        CityDto dto = new CityDto();
        dto.setId(city.getId());
        dto.setCityNameFr(city.getCityNameFr());
        dto.setCityNameEn(city.getCityNameEn());
        dto.setCountryNameFr(city.getCountryNameFr());
        dto.setCountryNameEn(city.getCountryNameEn());
        dto.setDate(city.getDate());
        dto.setDescriptionFr(city.getDescriptionFr());
        dto.setDescriptionEn(city.getDescriptionEn());

        if (city.getCuriosities() != null) {
            dto.setCuriosities(city.getCuriosities().stream().map(c -> {
                CuriosityDto cdto = new CuriosityDto();
                cdto.setTitleFr(c.getTitleFr());
                cdto.setTitleEn(c.getTitleEn());
                cdto.setDetailFr(c.getDetailFr());
                cdto.setDetailEn(c.getDetailEn());
                cdto.setUrlPhoto(c.getUrlPhoto());
                return cdto;
            }).collect(Collectors.toList()));
        }

        if (city.getPhotos() != null) {
            dto.setPhotos(city.getPhotos().stream().map(p -> {
                PhotoDto pdto = new PhotoDto();
                pdto.setUrl(p.getUrl());
                pdto.setCaption(p.getCaption());
                return pdto;
            }).collect(Collectors.toList()));
        }

        return dto;
    }

    // Conversion DTO -> Entity
    public City fromDto(CityDto dto) {
        City city = new City();
        city.setCityNameFr(dto.getCityNameFr());
        city.setCityNameEn(dto.getCityNameEn());
        city.setCountryNameFr(dto.getCountryNameFr());
        city.setCountryNameEn(dto.getCountryNameEn());
        city.setDate(dto.getDate());
        city.setDescriptionFr(dto.getDescriptionFr());
        city.setDescriptionEn(dto.getDescriptionEn());

        if (dto.getCuriosities() != null) {
            city.setCuriosities(dto.getCuriosities().stream().map(c -> {
                Curiosity curiosity = new Curiosity();
                curiosity.setTitleFr(c.getTitleFr());
                curiosity.setTitleEn(c.getTitleEn());
                curiosity.setDetailFr(c.getDetailFr());
                curiosity.setDetailEn(c.getDetailEn());
                curiosity.setUrlPhoto(c.getUrlPhoto());
                return curiosity;
            }).collect(Collectors.toList()));
        }

        if (dto.getPhotos() != null) {
            city.setPhotos(dto.getPhotos().stream().map(p -> {
                Photo photo = new Photo();
                photo.setUrl(p.getUrl());
                photo.setCaption(p.getCaption());
                return photo;
            }).collect(Collectors.toList()));
        }

        return city;
    }
}