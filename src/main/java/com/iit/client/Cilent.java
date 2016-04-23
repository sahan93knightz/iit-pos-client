/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.client;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iit.client.model.Brand;
import com.iit.client.net.Connection;

/**
 *
 * @author sahan
 */
public class Cilent {
    public static void main(String[] args) throws Exception {
//        String s = Connection.sendGet("http://localhost:8080/brands/");
//        System.out.println(s);
//        
//       
        Gson g = new Gson();
//        JsonObject jo = new Gson().fromJson(s, JsonObject.class);
//       
//        String x = (jo.get("_embedded").getAsJsonObject().get("brands").getAsJsonArray().get(0)).toString();
//        Brand b = g.fromJson(x, Brand.class);
//        System.out.println(b);
        
        Brand b = new Brand();
        b.setName("Test Brand Name");
        String json = g.toJson(b);
        Connection.sendPost("http://localhost:8080/brands/", json);
    }
}
