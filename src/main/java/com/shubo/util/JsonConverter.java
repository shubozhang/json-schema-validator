package com.shubo.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shubo.model.Customer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by k26511 on 5/10/2017.
 */
public class JsonConverter {

    public static void toJsonFile(Customer customer) throws IOException{
       /* Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String fileName = customer.getName();
        gson.toJson(customer, new FileWriter("./x.json"));*/

        Writer writer = new FileWriter("Output.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(customer, writer);

    }

    public static String toJsonString(Customer customer){
        Gson gson = new Gson();
        String jsonInString = gson.toJson(customer);
        return jsonInString;
    }

}
