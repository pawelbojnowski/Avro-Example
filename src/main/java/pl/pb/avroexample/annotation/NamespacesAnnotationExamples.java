package pl.pb.avroexample.annotation;

import java.util.UUID;

public class NamespacesAnnotationExamples {
    public static void main(String[] args) {
        UUID value = UUID.fromString("77fba37a-e3a2-41b2-8d1c-417c5f4787ec");
        String userName = "robertoCarlos";

        runAvdlExample(value, userName);
        runAvprExample(value, userName);
        runAvscExample(value, userName);
    }

    private static void runAvdlExample(UUID value, String userName) {
        // AVDL
        // OUTPUT
        /*
          AVDL: {"id": "77fba37a-e3a2-41b2-8d1c-417c5f4787ec", "userName": "robertoCarlos"}
          AVDL: {"id": "77fba37a-e3a2-41b2-8d1c-417c5f4787ec", "userName": "robertoCarlos", "fullname": "Roberto Carlos", "email": "robertoCarlos@example.com"}
         */
        pl.pb.avroexample.annotation.avdl.api.UserInfo userInfoApiAvdl = pl.pb.avroexample.annotation.avdl.api.UserInfo.newBuilder()
                .setId(value)
                .setUserName(userName)
                .build();
        System.out.println("AVDL: " + userInfoApiAvdl);

        pl.pb.avroexample.annotation.avdl.dto.UserInfo userInfoDtoAvdl = pl.pb.avroexample.annotation.avdl.dto.UserInfo.newBuilder()
                .setId(value)
                .setUserName(userName)
                .setFullname("Roberto Carlos")
                .setEmail("robertoCarlos@example.com")
                .build();
        System.out.println("AVDL: " + userInfoDtoAvdl);
    }

    private static void runAvprExample(UUID value, String userName) {
        // AVPR
        // OUTPUT
        /*
          AVPR: {"id": "77fba37a-e3a2-41b2-8d1c-417c5f4787ec", "userName": "robertoCarlos"}
          AVPR: {"id": "77fba37a-e3a2-41b2-8d1c-417c5f4787ec", "userName": "robertoCarlos", "fullname": "Roberto Carlos", "email": "robertoCarlos@example.com"}
         */
        pl.pb.avroexample.annotation.avpr.api.UserInfo userInfoApiAvpr = pl.pb.avroexample.annotation.avpr.api.UserInfo.newBuilder()
                .setId(value)
                .setUserName(userName)
                .build();
        System.out.println("\nAVPR: " + userInfoApiAvpr);

        pl.pb.avroexample.annotation.avpr.dto.UserInfo userInfoDtoAvpr = pl.pb.avroexample.annotation.avpr.dto.UserInfo.newBuilder()
                .setId(value)
                .setUserName(userName)
                .setFullname("Roberto Carlos")
                .setEmail("robertoCarlos@example.com")
                .build();
        System.out.println("AVPR: " + userInfoDtoAvpr);
    }

    private static void runAvscExample(UUID value, String userName) {
        // AVSC
        // OUTPUT
        /*
          AVSC: {"id": "77fba37a-e3a2-41b2-8d1c-417c5f4787ec", "userName": "robertoCarlos"}
          AVSC: {"id": "77fba37a-e3a2-41b2-8d1c-417c5f4787ec", "userName": "robertoCarlos", "fullname": "Roberto Carlos", "email": "robertoCarlos@example.com"}
         */
        pl.pb.avroexample.annotation.avpr.api.UserInfo userInfoApiAvsc = pl.pb.avroexample.annotation.avpr.api.UserInfo.newBuilder()
                .setId(value)
                .setUserName(userName)
                .build();
        System.out.println("\nAVSC: " + userInfoApiAvsc);

        pl.pb.avroexample.annotation.avpr.dto.UserInfo userInfoDtoAvsc = pl.pb.avroexample.annotation.avpr.dto.UserInfo.newBuilder()
                .setId(value)
                .setUserName(userName)
                .setFullname("Roberto Carlos")
                .setEmail("robertoCarlos@example.com")
                .build();
        System.out.println("AVSC: " + userInfoDtoAvsc);
    }
}