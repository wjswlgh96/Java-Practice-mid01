package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class MyCalender {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("월을 입력하세요 : ");
        int month = input.nextInt();
        input.nextLine();

        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate nextMonth = date.plusMonths(1);
        int startRows = date.getDayOfWeek().getValue() % 7;

        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        for(int i = 0; i < startRows; i++) {
            System.out.print("   ");
        }

        LocalDate dayIter = date;
        while(dayIter.isBefore(nextMonth)) {
            System.out.printf("%2d  ", dayIter.getDayOfMonth());

            if(dayIter.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            dayIter = dayIter.plusDays(1);
        }
    }
}
