package com.example.OneCityPerDay.controller;

import com.example.OneCityPerDay.dto.CityDateDto;
import com.example.OneCityPerDay.dto.CityDto;
import com.example.OneCityPerDay.entity.City;
import com.example.OneCityPerDay.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cities")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://treldyr.github.io/OneCityPerDay_FrontEnd/"
})
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping("/submit")
    public CityDto submitCity(@RequestBody CityDto cityDto) {
        City city = cityService.fromDto(cityDto);
        city = cityService.saveCity(city);
        return cityService.toDto(city);
    }

    @PostMapping("/submitMany")
    public List<CityDto> submitManyCities(@RequestBody List<CityDto> cityDtos) {
        return cityDtos.stream()
                .map(cityService::fromDto)
                .map(cityService::saveCity)
                .map(cityService::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/all")
    public List<CityDto> getAllCities() {
        return cityService.getAllCities()
                .stream()
                .map(cityService::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/datesAvailable")
    public List<CityDateDto> getDatesAvailable() {
        LocalDate today = LocalDate.now();
        return cityService.getAllCities()
                .stream()
                .filter(city -> !city.getDate().isAfter(today))
                .sorted((c1, c2) -> c1.getDate().compareTo(c2.getDate()))
                .map(city -> new CityDateDto(city.getId(), city.getDate()))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CityDto getCityById(@PathVariable Long id) {
        City city = cityService.getCityById(id);
        return cityService.toDto(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
    }
}
