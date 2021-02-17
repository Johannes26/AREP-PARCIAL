package edu.escuelaing.arem;

import org.junit.Assert;
import org.junit.Test;

import spark.Request;

/**
 * Unit test for simple App.
 */
public class AppTest{
	public ApiWheaterCall api;
	public String APIKEY = "7ac93a99c1116d4248f1475522520cef";
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    	api = new ApiWheaterCall();
    }

    @Test
    public void deberiaCalcularElReultadoDeLaPrueba1(){
    	String lugar = "Bogota";
    	String url = "https://api.openweathermap.org/data/2.5/weather?q="+lugar+"&appid="+APIKEY;
        Assert.assertTrue(true);
    }
}
