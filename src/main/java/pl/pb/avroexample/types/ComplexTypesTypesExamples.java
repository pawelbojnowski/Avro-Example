package pl.pb.avroexample.types;

import pl.pb.avroexample.types.avdl.ComplexTypes;

import java.util.List;
import java.util.Map;

public class ComplexTypesTypesExamples {

    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvdlExample() {
        // AVDL
        pl.pb.avroexample.types.avdl.EnumType enumTypeAvdl = pl.pb.avroexample.types.avdl.EnumType.Enum1;
        pl.pb.avroexample.types.avdl.MD5 fixedTypesAvdl = new pl.pb.avroexample.types.avdl.MD5(new byte[]{0, 1, 2, 3});
        pl.pb.avroexample.types.avdl.NestedComplexTypes nestedComplexTypesAvdl = new pl.pb.avroexample.types.avdl.NestedComplexTypes("Avro");
        ComplexTypes complexTypesAvdl = ComplexTypes.newBuilder()
                .setEnumType(enumTypeAvdl)
                .setArrayTypes(List.of("Dog", "cat", "parot"))
                .setMapTypes(Map.of("localhost", "127.0.01", "UAT", "159.159.159.159"))
                .setUnionTypes("")
                .setFixedTypes(fixedTypesAvdl)
                .setNestedComplexTypes(nestedComplexTypesAvdl)
                .build();

        // OUTPUT
        // {"enumType": "Enum1", "arrayTypes": ["Dog", "cat", "parot"], "mapTypes": {"UAT": "159.159.159.159", "localhost": "127.0.01"}, "unionTypes": "", "fixedTypes": [0, 1, 2, 3], "nestedComplexTypes": {"nestedComplexTypesValue": "Avro"}}
        System.out.println(complexTypesAvdl);
    }

    private static void runAvprExample() {
        // AVPR
        pl.pb.avroexample.types.avpr.EnumType enumTypeAvpr = pl.pb.avroexample.types.avpr.EnumType.Enum1;
        pl.pb.avroexample.types.avpr.MD5 fixedTypesAvpr = new pl.pb.avroexample.types.avpr.MD5(new byte[]{0, 1, 2, 3});
        pl.pb.avroexample.types.avpr.NestedComplexTypes nestedComplexTypesAvpr = new pl.pb.avroexample.types.avpr.NestedComplexTypes("Avro");
        pl.pb.avroexample.types.avpr.ComplexTypes complexTypesAvpr = pl.pb.avroexample.types.avpr.ComplexTypes.newBuilder()
                .setEnumType(enumTypeAvpr)
                .setArrayTypes(List.of("Dog", "cat", "parot"))
                .setMapTypes(Map.of("localhost", "127.0.01", "UAT", "159.159.159.159"))
                .setUnionTypes("")
                .setFixedTypes(fixedTypesAvpr)
                .setNestedComplexTypes(nestedComplexTypesAvpr)
                .build();

        // OUTPUT
        // {"enumType": "Enum1", "arrayTypes": ["Dog", "cat", "parot"], "mapTypes": {"UAT": "159.159.159.159", "localhost": "127.0.01"}, "unionTypes": "", "fixedTypes": [0, 1, 2, 3], "nestedComplexTypes": {"nestedComplexTypesValue": "Avro"}}
        System.out.println(complexTypesAvpr);
    }

    private static void runAvscExample() {
        // AVCS
        pl.pb.avroexample.types.avsc.EnumType enumTypeAvsc = pl.pb.avroexample.types.avsc.EnumType.Enum1;
        pl.pb.avroexample.types.avsc.MD5 fixedTypesAvsc = new pl.pb.avroexample.types.avsc.MD5(new byte[]{0, 1, 2, 3});
        pl.pb.avroexample.types.avsc.NestedComplexTypes nestedComplexTypesAvsc = new pl.pb.avroexample.types.avsc.NestedComplexTypes("Avro");

        pl.pb.avroexample.types.avsc.ComplexTypes complexTypesAcvs = pl.pb.avroexample.types.avsc.ComplexTypes.newBuilder()
                .setEnumType(enumTypeAvsc)
                .setArrayTypes(List.of("Dog", "cat", "parot"))
                .setMapTypes(Map.of("localhost", "127.0.01", "UAT", "159.159.159.159"))
                .setUnionTypes("")
                .setFixedTypes(fixedTypesAvsc)
                .setNestedComplexTypes(nestedComplexTypesAvsc)
                .build();
        // OUTPUT
        // {"enumType": "Enum1", "arrayTypes": ["Dog", "cat", "parot"], "mapTypes": {"UAT": "159.159.159.159", "localhost": "127.0.01"}, "unionTypes": "", "fixedTypes": [0, 1, 2, 3], "nestedComplexTypes": {"nestedComplexTypesValue": "Avro"}}
        System.out.println(complexTypesAcvs);
    }
}