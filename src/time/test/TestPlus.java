package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime dateTimePlus = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("dateTimePlus = " + dateTimePlus);
    }
}
