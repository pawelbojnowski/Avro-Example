package pl.pb.avroexample.types;


import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;


public class LogicalTypesExamples {

    private final static ByteBuffer someDecimal = encodeDecimal(new BigDecimal("12345.67"), 2);
    private final static LocalDate nowLocalDate = LocalDate.parse("2024-12-09");
    private final static LocalTime nowLocalTime = LocalTime.parse("23:34:17.526");
    private final static Instant nowInstant = Instant.parse("2024-12-09T22:34:17.526Z");
    private final static LocalDateTime nowLocalDateTime = LocalDateTime.parse("2024-12-09T23:34:17.526222");
    private final static UUID value = UUID.fromString("99D37B13-63C8-4528-A2A2-40B9213C9659");

    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvdlExample() {
        // AVDL
        final pl.pb.avroexample.types.avdl.LogicalTypes logicalTypesAvdl = pl.pb.avroexample.types.avdl.LogicalTypes.newBuilder()
                .setSomeDecimal(someDecimal)
                .setSomeDate(nowLocalDate)
                .setSomeTimeMs(nowLocalTime)
                .setSomeTimestampMs(nowInstant)
                .setSomeLocalMimestampMs(nowLocalDateTime)
                .setSomeUuid(value)
                .build();

        // OUTPUT
        // {"someDecimal": "\u0012Ö\u0087", "someDate": "2024-12-09", "someTimeMs": "23:34:17.526", "someTimestampMs": "2024-12-09T22:34:17.526Z", "someLocalMimestampMs": "2024-12-09T23:34:17.526222", "someUuid": "99d37b13-63c8-4528-a2a2-40b9213c9659"}
        System.out.println(logicalTypesAvdl);
    }

    private static void runAvprExample() {
        // AVPR
        final pl.pb.avroexample.types.avpr.LogicalTypes logicalTypesAvpr = pl.pb.avroexample.types.avpr.LogicalTypes.newBuilder()
                .setSomeDecimal(someDecimal)
                .setSomeDate(nowLocalDate)
                .setSomeTimeMs(nowLocalTime)
                .setSomeTimestampMs(nowInstant)
                .setSomeLocalMimestampMs(nowLocalDateTime)
                .setSomeUuid(value)
                .build();

        // OUTPUT
        // {"someDecimal": "\u0012Ö\u0087", "someDate": "2024-12-09", "someTimeMs": "23:34:17.526", "someTimestampMs": "2024-12-09T22:34:17.526Z", "someLocalMimestampMs": "2024-12-09T23:34:17.526222", "someUuid": "99d37b13-63c8-4528-a2a2-40b9213c9659"}
        System.out.println(logicalTypesAvpr);
    }

    private static void runAvscExample() {
        // AVCS
        final pl.pb.avroexample.types.avsc.LogicalTypes logicalTypesAcvs = pl.pb.avroexample.types.avsc.LogicalTypes.newBuilder()
                .setSomeDecimal(someDecimal)
                .setSomeDate(nowLocalDate)
                .setSomeTimeMs(nowLocalTime)
                .setSomeTimestampMs(nowInstant)
                .setSomeLocalMimestampMs(nowLocalDateTime)
                .setSomeUuid(value)
                .build();

        // OUTPUT
        // {"someDecimal": "\u0012Ö\u0087", "someDate": "2024-12-09", "someTimeMs": "23:34:17.526", "someTimestampMs": "2024-12-09T22:34:17.526Z", "someLocalMimestampMs": "2024-12-09T23:34:17.526222", "someUuid": "99d37b13-63c8-4528-a2a2-40b9213c9659"}
        System.out.println(logicalTypesAcvs);
    }

    private static ByteBuffer encodeDecimal(BigDecimal value, int scale) {
        BigDecimal scaledValue = value.setScale(scale);
        byte[] unscaledBytes = scaledValue.unscaledValue().toByteArray();
        return ByteBuffer.wrap(unscaledBytes);
    }
}