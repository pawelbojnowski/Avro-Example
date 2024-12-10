package pl.pb.avroexample.types;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class LogicalAsRawTypesExamples {

    private final static ByteBuffer SOME_DECIMAL = encodeDecimal(new BigDecimal("12345.67"), 2);
    private final static LocalDate DATE = LocalDate.parse("2024-12-09");
    private final static LocalTime SOME_DIME_MILLIS = LocalTime.parse("23:34:17.526");
    private final static LocalTime SOME_TIME_MICROS = LocalTime.parse("23:34:17.526");
    private final static Instant SOME_TIMESTAMP_MILLIS = Instant.parse("2024-12-09T22:34:17.526Z");
    private final static Instant SOME_TIMESTAMP_MICROS = Instant.parse("2024-12-09T22:34:17.526Z");
    private final static int TIMEDELTA = 2;
    private final static UUID SOME_UUID = UUID.fromString("99D37B13-63C8-4528-A2A2-40B9213C9659");

    public static void main(String[] args) {
        runAvdlExample();
        runAvprExample();
        runAvscExample();
    }

    private static void runAvdlExample() {
        // AVDL
        pl.pb.avroexample.types.avdl.LogicalAsRawTypes logicalAsRawTypesAvdl = pl.pb.avroexample.types.avdl.LogicalAsRawTypes.newBuilder()
                .setSomeDecimal(SOME_DECIMAL)
                .setSomeDate(DATE)
                .setSomeDimeMillis(SOME_DIME_MILLIS)
                .setSomeTimeMicros(SOME_TIME_MICROS)
                .setSomeTimestampMillis(SOME_TIMESTAMP_MILLIS)
                .setSomeTimestampMicros(SOME_TIMESTAMP_MICROS)
                .setSomeTimedelta(TIMEDELTA)
                .setSomeUuid(SOME_UUID)
                .build();

        // OUTPUT
        // {"someDate": "2024-12-09", "someDimeMillis": "23:34:17.526", "someTimeMicros": "23:34:17.526", "someTimestampMillis": "2024-12-09T22:34:17.526Z", "someTimestampMicros": "2024-12-09T22:34:17.526Z", "someTimedelta": 2.0, "someUuid": "99d37b13-63c8-4528-a2a2-40b9213c9659", "someDecimal": "\u0012Ö\u0087"}
        System.out.println(logicalAsRawTypesAvdl);
    }

    private static void runAvprExample() {
        // AVPR
        pl.pb.avroexample.types.avpr.LogicalAsRawTypes logicalAsRawTypesAvpr = pl.pb.avroexample.types.avpr.LogicalAsRawTypes.newBuilder()
                .setSomeDecimal(SOME_DECIMAL)
                .setSomeDate(DATE)
                .setSomeDimeMillis(SOME_DIME_MILLIS)
                .setSomeTimeMicros(SOME_TIME_MICROS)
                .setSomeTimestampMillis(SOME_TIMESTAMP_MILLIS)
                .setSomeTimestampMicros(SOME_TIMESTAMP_MICROS)
                .setSomeTimedelta(TIMEDELTA)
                .setSomeUuid(SOME_UUID)
                .build();

        // OUTPUT
        // {"someDate": "2024-12-09", "someDimeMillis": "23:34:17.526", "someTimeMicros": "23:34:17.526", "someTimestampMillis": "2024-12-09T22:34:17.526Z", "someTimestampMicros": "2024-12-09T22:34:17.526Z", "someTimedelta": 2.0, "someUuid": "99d37b13-63c8-4528-a2a2-40b9213c9659", "someDecimal": "\u0012Ö\u0087"}
        System.out.println(logicalAsRawTypesAvpr);
    }

    private static void runAvscExample() {
        // AVCS
        pl.pb.avroexample.types.avsc.LogicalAsRawTypes logicalAsRawTypesAcvs = pl.pb.avroexample.types.avsc.LogicalAsRawTypes.newBuilder()
                .setSomeDecimal(SOME_DECIMAL)
                .setSomeDate(DATE)
                .setSomeDimeMillis(SOME_DIME_MILLIS)
                .setSomeTimeMicros(SOME_TIME_MICROS)
                .setSomeTimestampMillis(SOME_TIMESTAMP_MILLIS)
                .setSomeTimestampMicros(SOME_TIMESTAMP_MICROS)
                .setSomeTimedelta(TIMEDELTA)
                .setSomeUuid(SOME_UUID)
                .build();

        // OUTPUT
        // {"someDate": "2024-12-09", "someDimeMillis": "23:34:17.526", "someTimeMicros": "23:34:17.526", "someTimestampMillis": "2024-12-09T22:34:17.526Z", "someTimestampMicros": "2024-12-09T22:34:17.526Z", "someTimedelta": 2.0, "someUuid": "99d37b13-63c8-4528-a2a2-40b9213c9659", "someDecimal": "\u0012Ö\u0087"}
        System.out.println(logicalAsRawTypesAcvs);
    }

    private static ByteBuffer encodeDecimal(BigDecimal value, int scale) {
        BigDecimal scaledValue = value.setScale(scale);
        byte[] unscaledBytes = scaledValue.unscaledValue().toByteArray();
        return ByteBuffer.wrap(unscaledBytes);
    }
}