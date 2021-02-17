package edu.escuelaing.arem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Set;

import spark.Request;


public class ApiWheaterCall {
	public String _url;
	public String APIKEY = "7ac93a99c1116d4248f1475522520cef";
	
	
	public String Resolver(Request req) throws Exception {
		String lugar = req.queryParamsValues("lugar")[0];
		String url = "https://api.openweathermap.org/data/2.5/weather?q="+lugar+"&appid="+APIKEY;
		if((boolean) Cache.ValidarExistencia(lugar)){
			return (String)Cache.Sacar(lugar);
		}
		String respuesta=sendRequest(url);
		Cache.Guardar(lugar, respuesta);
		return respuesta;
	}
	
	
	public static String sendRequest(String url) throws Exception {
		StringBuilder resultado = new StringBuilder();
		URL request = new URL(url);
		HttpURLConnection conexion = (HttpURLConnection) request.openConnection();
		conexion.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
		String linea;
		while ((linea = rd.readLine()) != null) {
			resultado.append(linea);
		}
		rd.close();
		
		return resultado.toString();
	}
}
