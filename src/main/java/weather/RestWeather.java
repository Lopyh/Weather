package weather;

import org.springframework.web.client.RestTemplate;
import weather.model.MyPojo;


public class RestWeather {
    String url = "https://query.yahooapis.com/v1/public/yql?q=select wind from weather.forecast " +
            "where woeid in (select woeid from geo.places(1) where text=";
            //'chicago, il')
    String country;


    RestTemplate restTemplate = new RestTemplate();
    MyPojo pojo = restTemplate.getForObject((url+"'chicago, il')"), MyPojo.class);





}
