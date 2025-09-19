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
        paris.setDescriptionFr(List.of("Dar es Salaam (en arabe : Dar as-Salam, 'Maison de la Paix') est la plus grande ville et le principal port de Tanzanie. Au fil du temps, elle s’est transformée en une métropole dynamique où cohabitent une grande diversité de cultures et de communautés. La ville est aussi un centre historique et culturel important. Le Musée national de Tanzanie, fondé en 1934, conserve des collections précieuses sur l’histoire du pays, la culture swahilie, les luttes pour l’indépendance et surtout les découvertes archéologiques de la gorge d’Olduvai, considérée comme l’un des 'berceaux de l’humanité'. On y trouve des fossiles d’hominidés de plusieurs millions d’années, ce qui inscrit Dar es Salaam dans le réseau mondial des hauts lieux de la recherche anthropologique.", "En plus de son rôle économique et historique, Dar es Salaam est une ville en pleine croissance urbaine. Son port est l’un des plus actifs d’Afrique orientale et sert de porte d’entrée aux marchandises de toute la région. Elle abrite également des institutions académiques majeures comme l’Université de Dar es Salaam, fondée en 1961, qui reste un pôle de recherche et de formation de premier plan pour l’Afrique de l’Est.", "Malgré sa modernisation rapide, Dar es Salaam conserve une forte identité swahilie. Les quartiers animés comme Kariakoo reflètent la vitalité des marchés africains, tandis que la péninsule de Msasani et les plages comme Coco Beach rappellent le lien intime de la ville avec l’océan Indien. Cette dualité entre urbanisation moderne et traditions locales fait de Dar es Salaam une ville fascinante et en constante transformation.", "Ancienne capitale du pays jusqu’au transfert des fonctions politiques vers Dodoma en 1974, elle demeure aujourd’hui le centre économique, commercial et culturel de la nation. Avec plus de 6 millions d’habitants estimés en 2025, elle est l’une des plus vastes métropoles d’Afrique de l’Est et un carrefour incontournable pour le commerce régional, reliant la Tanzanie aux pays voisins sans accès à la mer comme la Zambie, le Malawi, le Burundi ou le Rwanda.", "La ville doit son essor à sa position stratégique sur la côte de l’océan Indien. Fondée au milieu du XIXe siècle par le sultan de Zanzibar, elle portait à l’origine le nom de Mzizima, un petit village de pêcheurs. Le sultan Majid ben Saïd décida d’en faire une ville portuaire moderne, l’appelant Dar es Salaam. Au cours de la période coloniale, elle prit une importance considérable : d’abord sous administration allemande (1887-1916), devenant capitale du protectorat de l’Afrique orientale allemande, puis sous mandat britannique après la Première Guerre mondiale. De nombreux bâtiments de style colonial, encore visibles aujourd’hui dans certains quartiers, témoignent de cette histoire.", "On y retrouve une forte influence swahilie, mêlée à des héritages arabes, indiens et européens. Cette pluralité se reflète dans la gastronomie, l’architecture, les pratiques religieuses (islam, christianisme et religions traditionnelles) ainsi que dans la vie quotidienne de ses habitants."));
        paris.setDescriptionEn(List.of(
                "Dar es Salaam (in Arabic: Dar as-Salam, 'House of Peace') is the largest city and main port of Tanzania. Over time, it has transformed into a dynamic metropolis where a wide diversity of cultures and communities coexist. The city is also an important historical and cultural center. The National Museum of Tanzania, founded in 1934, preserves valuable collections on the country's history, Swahili culture, struggles for independence, and especially the archaeological discoveries at Olduvai Gorge, considered one of the 'cradles of humanity'. Fossils of hominids millions of years old are found there, placing Dar es Salaam among the world's leading sites for anthropological research.",
                "In addition to its economic and historical role, Dar es Salaam is a city experiencing rapid urban growth. Its port is one of the busiest in East Africa and serves as a gateway for goods across the region. The city also hosts major academic institutions such as the University of Dar es Salaam, founded in 1961, which remains a leading center for research and education in East Africa.",
                "Despite rapid modernization, Dar es Salaam retains a strong Swahili identity. Vibrant neighborhoods like Kariakoo reflect the energy of African markets, while the Msasani Peninsula and beaches like Coco Beach highlight the city's close connection to the Indian Ocean. This duality between modern urbanization and local traditions makes Dar es Salaam a fascinating and constantly evolving city.",
                "Formerly the country's capital until political functions moved to Dodoma in 1974, it remains today the economic, commercial, and cultural center of the nation. With over 6 million inhabitants estimated in 2025, it is one of the largest metropolises in East Africa and a key hub for regional trade, linking Tanzania to landlocked neighboring countries such as Zambia, Malawi, Burundi, and Rwanda.",
                "The city's growth owes much to its strategic position on the Indian Ocean coast. Founded in the mid-19th century by the Sultan of Zanzibar, it was originally called Mzizima, a small fishing village. Sultan Majid bin Said decided to turn it into a modern port city, naming it Dar es Salaam. During the colonial period, it gained significant importance: first under German administration (1887-1916) as the capital of German East Africa, then under British mandate after World War I. Many colonial-style buildings, still visible today in some neighborhoods, testify to this history.",
                "Dar es Salaam shows a strong Swahili influence, mixed with Arab, Indian, and European heritage. This diversity is reflected in its cuisine, architecture, religious practices (Islam, Christianity, and traditional religions), and the daily life of its inhabitants."
        ));

        // curiosities
        Curiosity curiosity1 = new Curiosity();
        curiosity1.setTitleFr("Marché de Kariakoo");
        curiosity1.setTitleEn("Kariakoo Market");
        curiosity1.setDetailFr("Le marché de Kariakoo est l’un des plus grands et des plus animés de toute l’Afrique de l’Est. Construit à l’époque coloniale allemande puis développé sous l’administration britannique, il est aujourd’hui un véritable centre névralgique de la vie économique de Dar es Salaam. On y trouve une immense variété de produits : fruits tropicaux, légumes, poissons frais, épices, textiles, vêtements et artisanat. Le marché est également connu pour son atmosphère vibrante, où se croisent commerçants, familles locales et visiteurs venus de toute la région. Il constitue un lieu d’observation unique de la culture urbaine tanzanienne.");
        curiosity1.setDetailEn("The Kariakoo market is one of the largest and liveliest in all of East Africa. Built during the German colonial period and later developed under British administration, it is today a true hub of Dar es Salaam's economic life. The market offers an immense variety of products: tropical fruits, vegetables, fresh fish, spices, textiles, clothing, and handicrafts. It is also known for its vibrant atmosphere, where traders, local families, and visitors from across the region converge. It provides a unique insight into Tanzanian urban culture.");
        curiosity1.setUrlPhoto("https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0f/91/8c/9f/vu-sur-le-marche.jpg?w=1200&h=-1&s=1");

        Curiosity curiosity2 = new Curiosity();
        curiosity2.setTitleFr("Musée national de Tanzanie");
        curiosity2.setTitleEn("National Museum of Tanzania");
        curiosity2.setDetailFr("Le Musée national de Tanzanie est un haut lieu culturel et scientifique. Créé dans les années 1930, il rassemble des collections variées allant de l’histoire précoloniale et coloniale de la Tanzanie aux découvertes archéologiques les plus marquantes. Il conserve notamment des restes fossiles provenant de la célèbre gorge d’Olduvai, où ont été retrouvés certains des plus anciens hominidés jamais découverts. Le musée présente aussi des expositions sur la culture swahilie, l’histoire de la traite des esclaves, ainsi que sur les luttes pour l’indépendance. C’est un lieu incontournable pour comprendre l’identité et l’évolution de la Tanzanie.");
        curiosity2.setDetailEn("The National Museum of Tanzania is an important cultural and scientific institution. Established in the 1930s, it houses a diverse collection ranging from Tanzania’s precolonial and colonial history to its most significant archaeological discoveries. It notably preserves fossil remains from the famous Olduvai Gorge, where some of the oldest hominids ever discovered were found. The museum also features exhibitions on Swahili culture, the history of the slave trade, and the struggles for independence. It is an essential place for understanding Tanzania’s identity and historical development.");
        curiosity2.setUrlPhoto("https://momaa.org/wp-content/uploads/2019/09/nmt-1024x568.png");

        Curiosity curiosity3 = new Curiosity();
        curiosity3.setTitleFr("Plage Coco");
        curiosity3.setTitleEn("Coco Beach");
        curiosity3.setDetailFr("Située sur la péninsule de Msasani, la plage Coco est l’une des plages les plus populaires de Dar es Salaam. Très fréquentée par les habitants, en particulier le week-end, elle est connue pour ses couchers de soleil spectaculaires sur l’océan Indien. La plage est également un lieu de vie sociale, avec ses vendeurs de nourriture de rue, ses musiciens et ses animations en plein air. Elle illustre parfaitement la manière dont Dar es Salaam conjugue urbanité et proximité avec la mer, offrant aux habitants un espace de détente au cœur d’une métropole en pleine expansion.");
        curiosity3.setDetailEn("Located on the Msasani Peninsula, Coco Beach is one of the most popular beaches in Dar es Salaam. Heavily frequented by locals, especially on weekends, it is known for its spectacular sunsets over the Indian Ocean. The beach is also a social hub, with street food vendors, musicians, and outdoor entertainment. It perfectly illustrates how Dar es Salaam combines urban life with proximity to the sea, providing residents with a relaxing space in the heart of a rapidly growing metropolis.");
        curiosity3.setUrlPhoto("https://upload.wikimedia.org/wikipedia/commons/thumb/7/7c/Coco_Beach.jpg/500px-Coco_Beach.jpg");

        paris.setCuriosities(List.of(curiosity1, curiosity2, curiosity3));

        // photos
        Photo photo1 = new Photo();
        photo1.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Dar_es_Salaam_-_Posta.jpg/500px-Dar_es_Salaam_-_Posta.jpg");
        photo1.setCaption("City vue of MV Kigamboni");

        Photo photo2 = new Photo();
        photo2.setUrl("https://mediaim.expedia.com/destination/1/f0f6b766fc14b364fd60927356e8edb3.jpg");
        photo2.setCaption("Aerial vue of Dar es Salaam");

        Photo photo3 = new Photo();
        photo3.setUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Tanzania_National_Main_Stadium_Aerial.jpg/330px-Tanzania_National_Main_Stadium_Aerial.jpg");
        photo3.setCaption("Benjamin Mkapa National Stadium");
        paris.setPhotos(List.of(photo1, photo2, photo3));





        cityService.saveCity(paris);

        System.out.println("✅ Base initialisée, c'est bon !");
    }
}
