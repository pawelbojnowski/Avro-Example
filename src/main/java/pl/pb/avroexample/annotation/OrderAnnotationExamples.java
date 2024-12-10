package pl.pb.avroexample.annotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderAnnotationExamples {
    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvdlExample() {
        // OUTPUT
        /*
          AVDL. Before sorting
          - Alice, 30, 111-111-111-111
          - Bob, 20, 111-111-111-111
          - Bob, 25, 111-111-111-111
          - Alice, 40, 111-111-111-111

          AVDL. After sorting
          - Alice, 40, 111-111-111-111
          - Alice, 30, 111-111-111-111
          - Bob, 25, 111-111-111-111
          - Bob, 20, 111-111-111-111
         */
        List<pl.pb.avroexample.annotation.avdl.User> users = Arrays.asList(
                new pl.pb.avroexample.annotation.avdl.User("Alice", 30, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avdl.User("Bob", 20, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avdl.User("Bob", 25, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avdl.User("Alice", 40, "111-111-111-111")
        );

        System.out.println("\nAVDL. Before sorting");
        users.forEach(user -> System.out.printf("- %s, %s, %s,%n", user.getFullname(), user.getAge(), user.getPhone()));
        Collections.sort(users);

        System.out.println("\nAVDL. After sorting");
        users.forEach(user -> System.out.printf("- %s, %s, %s,%n", user.getFullname(), user.getAge(), user.getPhone()));

    }

    private static void runAvprExample() {
        // OUTPUT
        /*
          AVPR. Before sorting
          - Alice, 30, 111-111-111-111
          - Bob, 20, 111-111-111-111
          - Bob, 25, 111-111-111-111
          - Alice, 40, 111-111-111-111

          AVPR. After sorting
          - Alice, 40, 111-111-111-111
          - Alice, 30, 111-111-111-111
          - Bob, 25, 111-111-111-111
          - Bob, 20, 111-111-111-111
         */
        List<pl.pb.avroexample.annotation.avpr.User> users = Arrays.asList(
                new pl.pb.avroexample.annotation.avpr.User("Alice", 30, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avpr.User("Bob", 20, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avpr.User("Bob", 25, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avpr.User("Alice", 40, "111-111-111-111")
        );

        System.out.println("\nAVPR. Before sorting");
        users.forEach(user -> System.out.printf("- %s, %s, %s,%n", user.getFullname(), user.getAge(), user.getPhone()));

        Collections.sort(users);

        System.out.println("\nAVPR. After sorting");
        users.forEach(user -> System.out.printf("- %s, %s, %s,%n", user.getFullname(), user.getAge(), user.getPhone()));
    }

    private static void runAvscExample() {
        // OUTPUT
        /*
          AVSC. Before sorting
          - Alice, 30, 111-111-111-111
          - Bob, 20, 111-111-111-111
          - Bob, 25, 111-111-111-111
          - Alice, 40, 111-111-111-111

          AVSC. After sorting
          - Alice, 40, 111-111-111-111
          - Alice, 30, 111-111-111-111
          - Bob, 25, 111-111-111-111
          - Bob, 20, 111-111-111-111
         */
        List<pl.pb.avroexample.annotation.avsc.User> users = Arrays.asList(
                new pl.pb.avroexample.annotation.avsc.User("Alice", 30, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avsc.User("Bob", 20, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avsc.User("Bob", 25, "111-111-111-111"),
                new pl.pb.avroexample.annotation.avsc.User("Alice", 40, "111-111-111-111")
        );

        System.out.println("\nAVSC. Before sorting");
        users.forEach(user -> System.out.printf("- %s, %s, %s,%n", user.getFullname(), user.getAge(), user.getPhone()));

        Collections.sort(users);

        System.out.println("\nAVSC. After sorting");
        users.forEach(user -> System.out.printf("- %s, %s, %s,%n", user.getFullname(), user.getAge(), user.getPhone()));
    }
}