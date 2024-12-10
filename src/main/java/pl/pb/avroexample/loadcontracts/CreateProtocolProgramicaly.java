package pl.pb.avroexample.loadcontracts;

import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;

import java.util.List;

public class CreateProtocolProgramicaly {

    public static void main(String[] args) {
        Schema schema = SchemaBuilder.record("Person")
                .namespace("pl.pb.avroexample.protocal")
                .fields()
                .requiredString("firstName")
                .requiredString("lastName")
                .requiredInt("age")
                .endRecord();

        Protocol protocol = new Protocol("PersonData", "pl.pb.avroexample.protocal");
        protocol.setTypes(List.of(schema));

        // OUTPUT
        /*
            {
              "protocol" : "PersonData",
              "namespace" : "pl.pb.avroexample.protocal",
              "types" : [ {
                "type" : "record",
                "name" : "Person",
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
              } ],
              "messages" : { }
            }
         */

        System.out.println(protocol.toString(true));
    }
}
