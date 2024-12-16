package time.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonDateTime = seoulDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkDateTime = seoulDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("seoulDateTime = " + seoulDateTime);
        System.out.println("londonDateTime = " + londonDateTime);
        System.out.println("newYorkDateTime = " + newYorkDateTime);
    }
}
