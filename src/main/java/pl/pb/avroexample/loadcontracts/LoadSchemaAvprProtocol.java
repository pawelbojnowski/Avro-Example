package pl.pb.avroexample.loadcontracts;

import org.apache.avro.Protocol;

import java.io.ByteArrayInputStream;

public class LoadSchemaAvprProtocol {

    public static void main(String[] args) {
        String avpr = """
                {
                  "namespace": "pl.pb.avroexample.protocal",
                  "protocol": "PersonData",
                  "types": [
                    {
                      "name": "Person",
                      "type": "record",
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
                    }
                  ]
                }""";

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(avpr.getBytes())) {
            Protocol protocol = Protocol.parse(byteArrayInputStream);

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

            System.out.println(protocol.toString(true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
