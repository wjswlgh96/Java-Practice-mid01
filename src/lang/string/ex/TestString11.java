package lang.string.ex;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse().toString());
    }
}
