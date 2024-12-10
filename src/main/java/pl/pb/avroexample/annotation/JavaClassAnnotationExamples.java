package pl.pb.avroexample.annotation;

import java.math.BigDecimal;
import java.util.Map;

public class JavaClassAnnotationExamples {
    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvdlExample() {
        // AVDL
        // OUTPUT
        // AVDL: {"Name": "Apple iPhone 16", "price": 1234, "metadata": {"{\"name\": \"description\"}": "description", "{\"name\": \"bestRating\"}": "1.2"}}
        pl.pb.avroexample.annotation.avdl.OrderItem orderItemAvdl = pl.pb.avroexample.annotation.avdl.OrderItem.newBuilder()
                .setName("Apple iPhone 16")
                .setPrice(new BigDecimal("1234"))
                .setMetadata(Map.of(
                        new pl.pb.avroexample.annotation.avdl.MetadataKey("description"), "description",
                        new pl.pb.avroexample.annotation.avdl.MetadataKey("bestRating"), "1.2"))
                .build();

        System.out.println("AVDL: " + orderItemAvdl);
    }

    private static void runAvprExample() {
        // AVPR
        // OUTPUT
        // AVPR: {"Name": "Apple iPhone 16", "price": 1234, "metadata": {"{\"name\": \"description\"}": "description", "{\"name\": \"bestRating\"}": "1.2"}}
        pl.pb.avroexample.annotation.avpr.OrderItem orderItemAvpr = pl.pb.avroexample.annotation.avpr.OrderItem.newBuilder()
                .setName("Apple iPhone 16")
                .setPrice(new BigDecimal("1234"))
                .setMetadata(Map.of(
                        new pl.pb.avroexample.annotation.avpr.MetadataKey("description"), "description",
                        new pl.pb.avroexample.annotation.avpr.MetadataKey("bestRating"), "1.2"))
                .build();

        System.out.println("AVPR: " + orderItemAvpr);
    }

    private static void runAvscExample() {
        // AVSC
        // OUTPUT
        // AVSC: {"Name": "Apple iPhone 16", "price": 1234, "metadata": {"{\"name\": \"description\"}": "description", "{\"name\": \"bestRating\"}": "1.2"}}
        pl.pb.avroexample.annotation.avsc.OrderItem orderItemAvsc = pl.pb.avroexample.annotation.avsc.OrderItem.newBuilder()
                .setName("Apple iPhone 16")
                .setPrice(new BigDecimal("1234"))
                .setMetadata(Map.of(
                        new pl.pb.avroexample.annotation.avsc.MetadataKey("description"), "description",
                        new pl.pb.avroexample.annotation.avsc.MetadataKey("bestRating"), "1.2"))
                .build();

        System.out.println("AVSC: " + orderItemAvsc);
    }
}