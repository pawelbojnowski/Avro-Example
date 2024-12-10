package pl.pb.avroexample.errormessage;

public class ErrorMessageExamples {
    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvdlExample() {
        // AVDL
        pl.pb.avroexample.errormessage.avdl.ErrorMessage errorMessageAvdl = pl.pb.avroexample.errormessage.avdl.ErrorMessage.newBuilder()
                .setMessage$("Value is not a number")
                .setStacktrace("pl.pb.exceptions...")
                .setCause(new IllegalAccessException(""))
                .setValue("something")
                .build();

        // Output:
        // pl.pb.avroexample.errormessage.avdl.ErrorMessage: something
        System.out.println(errorMessageAvdl);
    }

    private static void runAvprExample() {
        // AVPR
        pl.pb.avroexample.errormessage.avpr.ErrorMessage errorMessageAvpr = pl.pb.avroexample.errormessage.avpr.ErrorMessage.newBuilder()
                .setMessage$("Value is not a number")
                .setStacktrace("pl.pb.exceptions...")
                .setCause(new IllegalAccessException(""))
                .setValue("something")
                .build();

        // Output:
        // pl.pb.avroexample.errormessage.avdl.ErrorMessage: something
        System.out.println(errorMessageAvpr);
    }

    private static void runAvscExample() {
        // AVCS
        pl.pb.avroexample.errormessage.avsc.ErrorMessage errorMessageAvsc = pl.pb.avroexample.errormessage.avsc.ErrorMessage.newBuilder()
                .setMessage$("Value is not a number")
                .setStacktrace("pl.pb.exceptions...")
                .setCause(new IllegalAccessException(""))
                .setValue("something")
                .build();

        // Output:
        // pl.pb.avroexample.errormessage.avdl.ErrorMessage: something
        System.out.println(errorMessageAvsc);
    }
}