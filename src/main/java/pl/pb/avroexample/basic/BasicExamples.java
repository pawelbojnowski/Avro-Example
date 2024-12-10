package pl.pb.avroexample.basic;

public class BasicExamples {
    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvdlExample() {
        // AVDL
        pl.pb.avroexample.basic.avdl.Person personAvdl = pl.pb.avroexample.basic.avdl.Person.newBuilder()
                .setFirstName("Cristiano")
                .setLastName("Ronaldo")
                .setAge(39)
                .build();

        // Output:
        // {"firstName": "Cristiano", "lastName": "Ronaldo", "age": 39}
        System.out.println(personAvdl);
    }

    private static void runAvprExample() {
        // AVPR
        pl.pb.avroexample.basic.avpr.Person personAvpr = pl.pb.avroexample.basic.avpr.Person.newBuilder()
                .setFirstName("Cristiano")
                .setLastName("Ronaldo")
                .setAge(39)
                .build();

        // Output:
        // {"firstName": "Cristiano", "lastName": "Ronaldo", "age": 39}
        System.out.println(personAvpr);
    }

    private static void runAvscExample() {
        // AVCS
        pl.pb.avroexample.basic.avcs.Person personAcvs = pl.pb.avroexample.basic.avcs.Person.newBuilder()
                .setFirstName("Cristiano")
                .setLastName("Ronaldo")
                .setAge(39)
                .build();

        // Output:
        // {"firstName": "Cristiano", "lastName": "Ronaldo", "age": 39}
        System.out.println(personAcvs);
    }
}