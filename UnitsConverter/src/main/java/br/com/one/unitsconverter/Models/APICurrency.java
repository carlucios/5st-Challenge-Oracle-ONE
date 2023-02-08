/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.one.unitsconverter.Models;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import br.com.one.unitsconverter.Views.MessageWindow;

/**
 *
 * @author Carlucio
 */
public abstract class APICurrency {
    
    
    private static String webService = "https://economia.awesomeapi.com.br/json/";
    
    public static HashMap getAPICurrencyTable() {
        HashMap table = new HashMap();
        
        float bidUSD = requestAPIBid("USD");
        table.put("De Reais a Dólares", bidUSD);
        table.put("De Dólares a Reais", 1/bidUSD);
        float bidEUR = requestAPIBid("EUR");
        table.put("De Reais a Euros", bidEUR);
        table.put("De Euros a Reais", 1/bidEUR);
        float bidGBP = requestAPIBid("GBP");
        table.put("De Reais a Libras", bidGBP);
        table.put("De Libras a Reais", 1/bidGBP);
        float bidARS = requestAPIBid("ARS");
        table.put("De Reais a Peso Argentino", bidARS);
        table.put("De Peso Argentino a Reais", 1/bidARS);
        float bidCLP = requestAPIBid("CLP");
        table.put("De Reais a Peso Chileno", bidCLP);
        table.put("De Peso Chileno a Reais", 1/bidCLP);
       
        return table;
    }

    public static float requestAPIBid(String coin) {
        
        String urlParaChamada = webService + coin;

        try {

            URL url = new URL(urlParaChamada);

            URLConnection conn = url.openConnection();
            
            InputStream is = conn.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String line = "";
            List<String> jsonCoin = new ArrayList<String>();
            
            while((line = br.readLine()) != null){
                jsonCoin.add(line);
            }
            
            String singleString = jsonCoin.toString().replaceAll("[\\[\\]]","");
            
            JsonObject coinJson = new Gson().fromJson(singleString, JsonObject.class);
            
            return coinJson.get("bid").getAsFloat();


        } catch (Exception e) {
            MessageWindow errorMsg = new MessageWindow(e.toString());
            return (float) 0.0;
        }
    }
    
}
