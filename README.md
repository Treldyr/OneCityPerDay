# OneCityPerDay
A Back-end in Java Spring boot storing a list of cities : One for each day.

The final goal is to host a website that present one underrated city around the world each day, show some curiosities, pictures, history...
The website using the APIs is deployed here : https://treldyr.github.io/OneCityPerDay_FrontEnd/

TODO List : 

- Deploy the API online
  ✅ It is deployed with Heruko

- Change the Photo class : Caption should be split into CaptionFr and CaptionEn
  ✅ Done

- Add an endpoint to get a list of dates (the one where a city already exist)
  ✅ Done : the name is datesAvailable
  
- Add security to the endpoint (with spring security already installed)
- Add a security at the add city endpoint : If a city already contain the same date, The add is rejected

