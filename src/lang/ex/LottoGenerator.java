package lang.ex;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while(count < 6) {
            int randomInt = random.nextInt(45) + 1;

            if(isUnique(randomInt)) {
                lottoNumbers[count] = randomInt;
                count++;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for(int i = 0; i < count; i++) {
            if(lottoNumbers[i] == number) {
                return false;
            }
        }

        return true;
    }

    public void print() {
        lottoNumbers = Arrays.stream(lottoNumbers).sorted().toArray();
        System.out.print("로또 번호 : ");
        for (int l : lottoNumbers) {
            System.out.print(l + " ");
        }
    }
}
