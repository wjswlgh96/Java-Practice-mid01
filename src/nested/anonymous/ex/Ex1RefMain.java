package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {
    public static void hello(Print print) {
        System.out.println("프로그램 시작");
        print.print();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new Print() {
            @Override
            public void print() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        hello(new Print() {
            @Override
            public void print() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
