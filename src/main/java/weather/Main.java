package weather;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;
import weather.controller.WeatherController;
import weather.dao.WeatherDao;
import weather.model.MyPojo;
import weather.service.WeatherService;
import weather.testRest.Quote;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        String url = "https://query.yahooapis.com/v1/public/yql?q=select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"Chicago\") and u=\"c\"&format=json&env= store://datatables.org/alltableswithkeys";
        String test = "http://gturnquist-quoters.cfapps.io/api/random";
        //'chicago, il')
        String country;

        WeatherService weatherService = applicationContext.getBean(WeatherService.class);
        System.out.println(weatherService.getByName("Moscow"));





//        RestTemplate restTemplate = new RestTemplate();
//        MyPojo pojo = restTemplate.getForObject((url), MyPojo.class);
//        System.out.println(pojo);

    }
}
