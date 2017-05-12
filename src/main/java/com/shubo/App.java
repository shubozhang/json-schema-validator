package com.shubo;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ListProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class App {

    private static final String SCHEMA_PATH = "./src/main/resources/schema.json";

    public ListProcessingReport validateJsonString(String jsonString) throws ProcessingException, IOException {
        JsonNode jsonNode = JsonLoader.fromPath(SCHEMA_PATH);
        final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        final JsonSchema schema = factory.getJsonSchema(jsonNode);

        JsonNode json = JsonLoader.fromString(jsonString);
        ListProcessingReport report = (ListProcessingReport) schema.validate(json);

        return report;
    }

    public ListProcessingReport validateJsonFile(String filePath) throws ProcessingException, IOException {
        JsonNode jsonNode = JsonLoader.fromPath(SCHEMA_PATH);
        final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        final JsonSchema schema = factory.getJsonSchema(jsonNode);

        Gson gson = new Gson();
        /*BufferedReader br = new BufferedReader(new FileReader(filePath));
        Type type = new TypeToken<List<Customer>>() {}.getType();
        List<Customer> models = gson.fromJson(br, type);
        String strJson = gson.toJson(models.get(0));


        JsonNode json = JsonLoader.fromString(strJson);
        ListProcessingReport report = (ListProcessingReport) schema.validate(json);*/

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(br).getAsJsonObject();
        JsonNode json = JsonLoader.fromString(jsonObject.toString());
        ListProcessingReport report = (ListProcessingReport) schema.validate(json);
        return report;
    }


}
