package pl.pb.avroexample.fields;

public class FieldsExamples {
    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvscExample() {
        // AVCS
        pl.pb.avroexample.fields.avsc.FieldsTypes fieldsTypes1Avsc = pl.pb.avroexample.fields.avsc.FieldsTypes.newBuilder()
                .setOptionalFiled(null)
                .setFieldAcceptDiffrettypes("14.2")
                .build();

        // Output:
        // {"optionalFiled": null, "withDefaultValue": "some value", "fieldAcceptDiffrettypes": "14.2"}
        System.out.println(fieldsTypes1Avsc);

        pl.pb.avroexample.fields.avsc.FieldsTypes fieldsTypes2Avsc = pl.pb.avroexample.fields.avsc.FieldsTypes.newBuilder()
                .setOptionalFiled("Some Value")
                .setFieldAcceptDiffrettypes(14.2f)
                .build();

        // Output:
        // {"optionalFiled": "Some Value", "withDefaultValue": "some value", "fieldAcceptDiffrettypes": 14.2}
        System.out.println(fieldsTypes2Avsc);
    }

    private static void runAvprExample() {
        // AVPR
        pl.pb.avroexample.fields.avpr.FieldsTypes fieldsTypes1Avpr = pl.pb.avroexample.fields.avpr.FieldsTypes.newBuilder()
                .setOptionalFiled(null)
                .setFieldAcceptDiffrettypes("14.2")
                .build();

        // Output:
        // {"optionalFiled": null, "withDefaultValue": "some value", "fieldAcceptDiffrettypes": "14.2"}
        System.out.println(fieldsTypes1Avpr);

        pl.pb.avroexample.fields.avpr.FieldsTypes fieldsTypes2Avpr = pl.pb.avroexample.fields.avpr.FieldsTypes.newBuilder()
                .setOptionalFiled("Some Value")
                .setFieldAcceptDiffrettypes(14.2f)
                .build();

        // Output:
        // {"optionalFiled": "Some Value", "withDefaultValue": "some value", "fieldAcceptDiffrettypes": 14.2}
        System.out.println(fieldsTypes2Avpr);
    }

    private static void runAvdlExample() {
        // AVDL
        pl.pb.avroexample.fields.avdl.FieldsTypes fieldsTypes1Avdl = pl.pb.avroexample.fields.avdl.FieldsTypes.newBuilder()
                .setOptionalFiled(null)
                .setFieldAcceptDiffrettypes("14.2")
                .build();

        // Output:
        // {"optionalFiled": null, "withDefaultValue": "some value", "fieldAcceptDiffrettypes": "14.2"}
        System.out.println(fieldsTypes1Avdl);

        pl.pb.avroexample.fields.avdl.FieldsTypes fieldsTypes2Avdl = pl.pb.avroexample.fields.avdl.FieldsTypes.newBuilder()
                .setOptionalFiled("Some Value")
                .setFieldAcceptDiffrettypes(14.2f)
                .build();

        // Output:
        // {"optionalFiled": "Some Value", "withDefaultValue": "some value", "fieldAcceptDiffrettypes": 14.2}
        System.out.println(fieldsTypes2Avdl);
    }
}