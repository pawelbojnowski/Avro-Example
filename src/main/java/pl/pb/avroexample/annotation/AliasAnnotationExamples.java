package pl.pb.avroexample.annotation;

import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.specific.SpecificRecordBase;

public class AliasAnnotationExamples {
    public static void main(String[] args) {

        String userV1 = "{ \"name\": \"Alice\"}";
        String userV2 = "{ \"firstAndSecondName\": \"Alice\"}";
        String userV3 = "{ \"fullname\": \"Alice\"}";

        runAvdlExampl(userV1, userV2, userV3);
        runAvprExample(userV1, userV2, userV3);
        runAvscExample(userV1, userV2, userV3);
    }

    private static void runAvdlExampl(String userV1, String userV2, String userV3) {
        // AVDL
        // OUTPUT
        /*
          AVDL: {"fullname": "Alice"}
          AVDL: {"fullname": "Alice"}
          AVDL: {"fullname": "Alice"}
         */
        Class<pl.pb.avroexample.annotation.avdl.Person> recordClass = pl.pb.avroexample.annotation.avdl.Person.class;
        System.out.println("AVDL: " + getPerson(recordClass, userV1));
        System.out.println("AVDL: " + getPerson(recordClass, userV2));
        System.out.println("AVDL: " + getPerson(recordClass, userV3));
    }

    private static void runAvprExample(String userV1, String userV2, String userV3) {
        // AVPR
        // OUTPUT
        /*
          AVPR: {"fullname": "Alice"}
          AVPR: {"fullname": "Alice"}
          AVPR: {"fullname": "Alice"}
         */
        Class<pl.pb.avroexample.annotation.avpr.Person> recordClass1 = pl.pb.avroexample.annotation.avpr.Person.class;
        System.out.println("\nAVPR: " + getPerson(recordClass1, userV1));
        System.out.println("AVPR: " + getPerson(recordClass1, userV2));
        System.out.println("AVPR: " + getPerson(recordClass1, userV3));
    }

    private static void runAvscExample(String userV1, String userV2, String userV3) {
        // AVSC
        // OUTPUT
        /*
          AVSC: {"fullname": "Alice"}
          AVSC: {"fullname": "Alice"}
          AVSC: {"fullname": "Alice"}
         */
        Class<pl.pb.avroexample.annotation.avsc.Person> recordClass2 = pl.pb.avroexample.annotation.avsc.Person.class;
        System.out.println("\nAVSC: " + getPerson(recordClass2, userV1));
        System.out.println("AVSC: " + getPerson(recordClass2, userV2));
        System.out.println("AVSC: " + getPerson(recordClass2, userV3));
    }

    private static <T extends SpecificRecordBase & SpecificRecord> T getPerson(Class<T> recordClass, String json) {
        try {
            SpecificDatumReader<T> datumReader = new SpecificDatumReader<>(recordClass);
            Decoder decoder = DecoderFactory.get().jsonDecoder(recordClass.getDeclaredConstructor().newInstance().getSchema(), json);
            return datumReader.read(null, decoder);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}