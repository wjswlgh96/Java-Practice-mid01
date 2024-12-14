package lang.string.ex;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        System.out.println(String.join("", fruits.split(",")));
    }
}
