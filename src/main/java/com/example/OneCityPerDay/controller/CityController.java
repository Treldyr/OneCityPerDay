package com.example.OneCityPerDay.controller;

import com.example.OneCityPerDay.dto.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cities")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://treldyr.github.io/OneCityPerDay_FrontEnd/"
})
public class CityController {

    private final List<CityDto> cities = new ArrayList<>();
    private long nextId = 1; // compteur pour générer les IDs

    @PostMapping("/submit")
    public CityDto submitCity(@RequestBody CityDto cityDto) {
        cityDto.setId(nextId++);
        cities.add(cityDto);
        return cityDto;
    }

    @PostMapping("/submitMany")
    public List<CityDto> submitManyCities(@RequestBody List<CityDto> cityDtos) {
        for (CityDto cityDto : cityDtos) {
            cityDto.setId(nextId++);
            cities.add(cityDto);
        }
        return cityDtos;
    }

    @GetMapping("/all")
    public List<CityDto> getAllCities() {
        return cities;
    }

    @GetMapping("/pastOrToday")
    public List<CityDto> getCitiesPastOrToday() {
        LocalDate today = LocalDate.now();
        return cities.stream()
                .filter(city -> !city.getDate().isAfter(today)) // exclut les dates futures
                .sorted(Comparator.comparing(CityDto::getDate).reversed()) // tri décroissant
                .collect(Collectors.toList());
    }
}

