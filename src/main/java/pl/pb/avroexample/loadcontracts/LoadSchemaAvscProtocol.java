package pl.pb.avroexample.loadcontracts;

import org.apache.avro.SchemaParser;

import java.io.ByteArrayInputStream;

public class LoadSchemaAvscProtocol {

    public static void main(String[] args) {
        String avsc = """
                {
                  "type": "record",
                  "name": "Person",
                  "namespace": "pl.pb.avroexample.annotation.avsc",
                  "fields": [
                        {
                          "name": "firstName",
                          "type": "string"
                        },
                        {
                          "name": "lastName",
                          "type": "string"
                        },
                        {
                          "name": "age",
                          "type": "int"
                        }
                      ]
                }""";

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(avsc.getBytes())) {
            SchemaParser.ParseResult protocol = new SchemaParser().parse(byteArrayInputStream);

            // OUTPUT
            /*
              {
                "type" : "record",
                "name" : "Person",
                "namespace" : "pl.pb.avroexample.annotation.avsc",
                "fields" : [ {
                  "name" : "firstName",
                  "type" : "string"
                }, {
                  "name" : "lastName",
                  "type" : "string"
                }, {
                  "name" : "age",
                  "type" : "int"
                } ]
              }
             */

            System.out.println(protocol.mainSchema().toString(true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
