package com.shubo;


import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.core.report.ListProcessingReport;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest{

    private App app;
    private static final String BAD1 = "./src/test/resources/bad1.json";
    private static final String BAD2 = "./src/test/resources/bad2.json";
    private static final String BAD3 = "./src/test/resources/bad3.json";
    private static final String BAD4 = "./src/test/resources/bad4.json";
    private static final String BAD5 = "./src/test/resources/bad5.json";
    private static final String BAD6 = "./src/test/resources/bad6.json";

    private static final String GOOD = "./src/test/resources/good.json";

    @Before
    public void setUp() {
        app = new App();
    }


    @Test
    public void testValidateJsonStringGood() throws Exception{
        ListProcessingReport report = app.validateJsonFile(GOOD);

        if (false == report.isSuccess()) {
            Iterator iterator  = report.asJson().iterator();
            while (iterator.hasNext()) {
                JsonNode jsonNode = (JsonNode) iterator.next();
                JsonNode instanceNode = jsonNode.findValue("instance");
                JsonNode messageNode = jsonNode.findValue("message");
                System.out.println("Error field: " + instanceNode.toString() + "  Message: " + messageNode.toString() );
            }
        }
        assertTrue(report.isSuccess());
    }

    @Test
    public void testValidateJsonStringBad1() throws Exception{
        ListProcessingReport report = app.validateJsonFile(BAD1);

        if (false == report.isSuccess()) {
            Iterator iterator  = report.asJson().iterator();
            while (iterator.hasNext()) {
                JsonNode jsonNode = (JsonNode) iterator.next();
                JsonNode instanceNode = jsonNode.findValue("instance");
                JsonNode messageNode = jsonNode.findValue("message");
                System.out.println("Error field: " + instanceNode.toString() + "  Message: " + messageNode.toString() );
            }
        }
        assertFalse(report.isSuccess());
    }

    @Test
    public void testValidateJsonStringBad2() throws Exception{
        ListProcessingReport report = app.validateJsonFile(BAD2);

        if (false == report.isSuccess()) {
            Iterator iterator  = report.asJson().iterator();
            while (iterator.hasNext()) {
                JsonNode jsonNode = (JsonNode) iterator.next();
                JsonNode instanceNode = jsonNode.findValue("instance");
                JsonNode messageNode = jsonNode.findValue("message");
                System.out.println("Error field: " + instanceNode.toString() + "  Message: " + messageNode.toString() );
            }
        }
        assertFalse(report.isSuccess());
    }

    @Test
    public void testValidateJsonStringBad3() throws Exception{
        ListProcessingReport report = app.validateJsonFile(BAD3);

        if (false == report.isSuccess()) {
            Iterator iterator  = report.asJson().iterator();
            while (iterator.hasNext()) {
                JsonNode jsonNode = (JsonNode) iterator.next();
                JsonNode instanceNode = jsonNode.findValue("instance");
                JsonNode messageNode = jsonNode.findValue("message");
                System.out.println("Error field: " + instanceNode.toString() + "  Message: " + messageNode.toString() );
            }
        }
        assertFalse(report.isSuccess());
    }

    @Test
    public void testValidateJsonStringBad4() throws Exception{
        ListProcessingReport report = app.validateJsonFile(BAD4);

        if (false == report.isSuccess()) {
            Iterator iterator  = report.asJson().iterator();
            while (iterator.hasNext()) {
                JsonNode jsonNode = (JsonNode) iterator.next();
                JsonNode instanceNode = jsonNode.findValue("instance");
                JsonNode messageNode = jsonNode.findValue("message");
                System.out.println("Error field: " + instanceNode.toString() + "  Message: " + messageNode.toString() );
            }
        }
        assertFalse(report.isSuccess());
    }

    @Test
    public void testValidateJsonStringBad5() throws Exception{
        ListProcessingReport report = app.validateJsonFile(BAD5);

        if (false == report.isSuccess()) {
            Iterator iterator  = report.asJson().iterator();
            while (iterator.hasNext()) {
                JsonNode jsonNode = (JsonNode) iterator.next();
                JsonNode instanceNode = jsonNode.findValue("instance");
                JsonNode messageNode = jsonNode.findValue("message");
                System.out.println("Error field: " + instanceNode.toString() + "  Message: " + messageNode.toString() );
            }
        }
        assertFalse(report.isSuccess());
    }
    @Test
    public void testValidateJsonFile() {

    }
}
