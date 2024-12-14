package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();
        // Random random = new Random(1);                         // seed 가 같으면 Random 의 결과가 같다.

        int randomInt = random.nextInt();                           // 랜덤 정수 범위 반환
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();                  // 0.0d ~ 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);     // true or false

        // 범위 조회
        int randomRange1 = random.nextInt(10);               // 0 ~ 9까지 출력
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("randomRange2 = " + randomRange2);       // 1 ~ 10까지 출력
    }
}
