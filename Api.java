package main;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;




/**
 *
 * @author gmora
 */

 
public class Api {  
        HttpResponse<String> response = Unirest.get("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword=iphone")
	.header("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
	.header("x-rapidapi-key", "56cbb60f7amsh8361b552684d3cbp1b35e6jsnc48e54096964")
	
        .asString();
        Unirest.get("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword=iphone" + valor)
        .routeParam(valor, "value")
        .asJson();

    }
