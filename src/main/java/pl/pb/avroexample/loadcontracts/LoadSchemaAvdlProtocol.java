package pl.pb.avroexample.loadcontracts;

import org.apache.avro.ParseContext;
import org.apache.avro.Protocol;
import org.apache.avro.idl.IdlFile;
import org.apache.avro.idl.IdlReader;

import java.io.ByteArrayInputStream;

public class LoadSchemaAvdlProtocol {

    public static void main(String[] args) {
        String avdl = """
                @namespace("pl.pb.avroexample.protocal")
                protocol PersonData {
                
                	record Person {
                		string firstName;
                		string lastName;
                		int age;
                
                	}
                }
                """;

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(avdl.getBytes())) {
            IdlReader idlReader = new IdlReader(new ParseContext());
            IdlFile parse = idlReader.parse(byteArrayInputStream);
            Protocol protocol = parse.getProtocol();

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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
