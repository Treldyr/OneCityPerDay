package com.example.OneCityPerDay;

import com.example.OneCityPerDay.entity.City;
import com.example.OneCityPerDay.entity.Curiosity;
import com.example.OneCityPerDay.entity.Photo;
import com.example.OneCityPerDay.service.CityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final CityService cityService;

    public DataInitializer(CityService cityService) {
        this.cityService = cityService;
    }

    @Override
    public void run(String... args) {
        cityService.clearCities();

        City paris = new City();
        paris.setCityNameFr("Dar es Salaam");
        paris.setCityNameEn("Dar es Salaam");
        paris.setCountryNameFr("Tanzanie");
        paris.setCountryNameEn("Tanzania");
        paris.setDate(LocalDate.now());

        // descriptions
        paris.setDescriptionFr(List.of(
                "Coimbra est une ville historique située au centre du Portugal, traversée par le fleuve Mondego. Ancienne capitale du pays, elle possède un riche patrimoine architectural mêlant époques médiévales, baroques et modernes. Ses rues pavées et ses places animées reflètent l’histoire profonde de la ville et offrent un cadre pittoresque aux visiteurs.",
                "La ville est surtout renommée pour son université, l’Université de Coimbra, fondée en 1290, l’une des plus anciennes d’Europe. Cet établissement emblématique attire chaque année des étudiants du monde entier et contribue à la vitalité culturelle et intellectuelle de la ville. La bibliothèque Joanina et l’Académie des sciences sont des exemples impressionnants du patrimoine académique et artistique de Coimbra.",
                "Outre son rôle académique, Coimbra est également un centre culturel et musical. Les traditions locales, comme le fado de Coimbra, témoignent de l’âme poétique et mélancolique de la ville. Les nombreux jardins, les berges du Mondego et les monuments historiques offrent un équilibre entre vie urbaine animée et moments de détente, faisant de Coimbra une ville fascinante à découvrir."
        ));
        paris.setDescriptionEn(List.of(
                "Coimbra is a historic city located in central Portugal, crossed by the Mondego River. A former capital of the country, it boasts a rich architectural heritage combining medieval, baroque, and modern styles. Its cobbled streets and lively squares reflect the city’s deep history and provide a picturesque setting for visitors.",
                "The city is especially renowned for its university, the University of Coimbra, founded in 1290, one of the oldest in Europe. This iconic institution attracts students from around the world every year and contributes to the city’s cultural and intellectual vibrancy. The Joanina Library and the Academy of Sciences are impressive examples of Coimbra’s academic and artistic heritage.",
                "Beyond its academic role, Coimbra is also a cultural and musical hub. Local traditions, such as Coimbra fado, reflect the city’s poetic and melancholic spirit. Numerous gardens, the banks of the Mondego River, and historical monuments offer a balance between lively urban life and peaceful moments, making Coimbra a fascinating city to explore."
        ));

        // curiosities
        Curiosity curiosity1 = new Curiosity();
        curiosity1.setTitleFr("La Bibliothèque Joanina");
        curiosity1.setTitleEn("Joanina Library");
        curiosity1.setDetailFr("Située au sein de l’Université de Coimbra, cette bibliothèque baroque du XVIIIᵉ siècle est célèbre pour son architecture somptueuse, ses milliers de livres anciens et sa décoration intérieure impressionnante, avec des boiseries sculptées et des plafonds peints. Elle est considérée comme l’une des plus belles bibliothèques historiques d’Europe.");
        curiosity1.setDetailEn("Located within the University of Coimbra, this 18th-century Baroque library is renowned for its magnificent architecture, thousands of ancient books, and stunning interior decoration, featuring carved woodwork and painted ceilings. It is considered one of the most beautiful historic libraries in Europe.");
        curiosity1.setUrlPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Library_of_the_Universtity_of_Coimbra.jpg/608px-Library_of_the_Universtity_of_Coimbra.jpg");

        Curiosity curiosity2 = new Curiosity();
        curiosity2.setTitleFr("Le Portugal dos Pequenitos");
        curiosity2.setTitleEn("Portugal dos Pequenitos");
        curiosity2.setDetailFr("Ce parc miniature est dédié à la culture portugaise et à l’histoire du pays. On y trouve des reproductions à petite échelle de monuments portugais, de maisons traditionnelles et même des pavillons représentant les anciennes colonies du Portugal, offrant aux visiteurs une découverte ludique et éducative de la culture portugaise.");
        curiosity2.setDetailEn("This miniature park is dedicated to Portuguese culture and history. It features scaled-down replicas of Portuguese monuments, traditional houses, and even pavilions representing Portugal’s former colonies, offering visitors a fun and educational way to explore Portuguese culture.");
        curiosity2.setUrlPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Coimbra_pp_%2817%29.JPG/500px-Coimbra_pp_%2817%29.JPG");

        paris.setCuriosities(List.of(curiosity1, curiosity2));

        // photos
        Photo photo1 = new Photo();
        photo1.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Coimbra_e_o_rio_Mondego_%286167200429%29_%28cropped%29.jpg/500px-Coimbra_e_o_rio_Mondego_%286167200429%29_%28cropped%29.jpg");
        photo1.setCaption("Global vue of Coimbra");

        Photo photo2 = new Photo();
        photo2.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/94918-Coimbra_%2849022894973%29_%28cropped%29.jpg/330px-94918-Coimbra_%2849022894973%29_%28cropped%29.jpg");
        photo2.setCaption("University of Coimbra");

        paris.setPhotos(List.of(photo1, photo2));





        cityService.saveCity(paris);

        System.out.println("✅ Base initialisée, c'est bon !");
    }
}
