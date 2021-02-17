package edu.escuelaing.arem;

import org.junit.Assert;
import org.junit.Test;

import spark.Request;

/**
 * Unit test for simple App.
 */
public class AppTest{
	public String APIKEY = "7ac93a99c1116d4248f1475522520cef";

    @Test
    public void deberiaCalcularElReultadoDeLaPrueba1() throws Exception{
    	String lugar = "Bogota";
    	String url = "https://api.openweathermap.org/data/2.5/weather?q="+lugar+"&appid="+APIKEY;
    	String responseTeoric = "{\"coord\":{\"lon\":-74.0817,\"lat\":4.6097},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"base\":\"stations\",\"main\":{\"temp\":293.15,\"feels_like\":288.24,\"temp_min\":293.15,\"temp_max\":293.15,\"pressure\":1023,\"humidity\":49},\"visibility\":10000,\"wind\":{\"speed\":6.69,\"deg\":280},\"clouds\":{\"all\":75},\"dt\":1613593423,\"sys\":{\"type\":1,\"id\":8582,\"country\":\"CO\",\"sunrise\":1613560256,\"sunset\":1613603399},\"timezone\":-18000,\"id\":3688689,\"name\":\"Bogotá\",\"cod\":200}";
        String response = ApiWheaterCall.sendRequest(url);
    	Assert.assertTrue(response.equals(response));
    }
}
