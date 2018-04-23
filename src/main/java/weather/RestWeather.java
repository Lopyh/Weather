package weather;

public class RestWeather {
    String string = "https://query.yahooapis.com/v1/public/yql?q=select wind from weather.forecast " +
            "where woeid in (select woeid from geo.places(1) where text=";
            //'chicago, il')
    String country;


}
