package pl.pb.avroexample.types;

import pl.pb.avroexample.types.avdl.PrimitiveTypes;

import java.nio.ByteBuffer;

public class PrimitiveTypesExamples {

    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvdlExample() {
        // AVDL
        PrimitiveTypes personAvdl = PrimitiveTypes.newBuilder()
                .setSomeInt(1)
                .setSomeLong(2l)
                .setSomeString("Numerb 3")
                .setSomeBoolean(true)
                .setSomeFloat(4.0f)
                .setSomeDouble(5.1d)
                .setSomeNull(null)
                .setSomeBytes(ByteBuffer.wrap(new byte[]{1, 2, 3}))
                .build();

        // OUTPUT
        // {"someInt": 1, "someLong": 2, "someString": "Numerb 3", "someBoolean": true, "someFloat": 4.0, "someDouble": 5.1, "someNull": null, "someBytes": "\u0001\u0002\u0003"}
        System.out.println(personAvdl);
    }

    private static void runAvprExample() {
        // AVPR
        pl.pb.avroexample.types.avpr.PrimitiveTypes personAvpr = pl.pb.avroexample.types.avpr.PrimitiveTypes.newBuilder()
                .setSomeInt(1)
                .setSomeLong(2l)
                .setSomeString("Numerb 3")
                .setSomeBoolean(true)
                .setSomeFloat(4.0f)
                .setSomeDouble(5.1d)
                .setSomeNull(null)
                .setSomeBytes(ByteBuffer.wrap(new byte[]{1, 2, 3}))
                .build();

        // OUTPUT
        // {"someInt": 1, "someLong": 2, "someString": "Numerb 3", "someBoolean": true, "someFloat": 4.0, "someDouble": 5.1, "someNull": null, "someBytes": "\u0001\u0002\u0003"}
        System.out.println(personAvpr);
    }

    private static void runAvscExample() {
        // AVCS
        pl.pb.avroexample.types.avsc.PrimitiveTypes personAcvs = pl.pb.avroexample.types.avsc.PrimitiveTypes.newBuilder()
                .setSomeInt(1)
                .setSomeLong(2l)
                .setSomeString("Numerb 3")
                .setSomeBoolean(true)
                .setSomeFloat(4.0f)
                .setSomeDouble(5.1d)
                .setSomeNull(null)
                .setSomeBytes(ByteBuffer.wrap(new byte[]{1, 2, 3}))
                .build();

        // OUTPUT
        // {"someInt": 1, "someLong": 2, "someString": "Numerb 3", "someBoolean": true, "someFloat": 4.0, "someDouble": 5.1, "someNull": null, "someBytes": "\u0001\u0002\u0003"}
        System.out.println(personAcvs);
    }
}