package com.shubo.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shubo.model.Customer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Java can perform buffering which means that it will hold onto data written in memory until
 * it has a certain amount, and then write it all to the file in one go which is more efficient.
 * The downside of this is that the file is not necessarily up-to-date at any given time.
 * Flush is a way of saying "make the file up-to-date.

 * Close calls flush first to ensure that after closing the file has what you would
 * expect to see in it, hence as others have pointed out, no need to flush before closing.
 */
public class JsonConverter {

    public static void toJsonFile(Customer customer) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String fileName = customer.getName();
        FileWriter fileWriter = new FileWriter("./src/main/resources/" + fileName + ".json");

        // method 1
        gson.toJson(customer,fileWriter);
        fileWriter.flush();
        fileWriter.close();

        //method 2
        //fileWriter.write(gson.toJson(customer));
        //fileWriter.flush();
        //fileWriter.close();

        // method 3: In above example FileWriter instance is declared in a try-with-resource statement,
        // it will be closed regardless of whether the try statement completes normally or abruptly.
        // You don’t have catch IOException or no need to mention finally block.
       /* try (FileWriter file = new FileWriter("./" + fileName + ".json")) {
            file.write(gson.toJson(customer));
        }*/

       // method 4
        /*try {
            FileWriter fileWriter = new FileWriter("./src/main/resources/" + fileName + ".json");
            fileWriter.write(gson.toJson(customer));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.flush();
            fileWriter.close();
        }*/
    }

    public static void toJsonFile(Customer customer, String path) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String fileName = customer.getName();

        try (FileWriter file = new FileWriter(path + fileName + ".json")) {
            file.write(gson.toJson(customer));
        }
    }

    public static String toJsonString(Customer customer) {
        Gson gson = new Gson();
        String jsonInString = gson.toJson(customer);
        return jsonInString;
    }

}
