package com.shubo;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ListProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.IOException;


public class App {

    public ListProcessingReport validateJson(String schemaPath, String jsonString) throws ProcessingException, IOException {
        JsonNode fsJsonSchema = JsonLoader.fromPath(schemaPath);
        final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        final JsonSchema schema = factory.getJsonSchema(fsJsonSchema);


        JsonNode fsJson = JsonLoader.fromString(jsonString);
        ListProcessingReport report = (ListProcessingReport) schema.validate(fsJson);

        return report;
    }

}
