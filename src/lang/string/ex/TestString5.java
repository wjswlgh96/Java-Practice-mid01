package lang.string.ex;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        System.out.println(str.substring(0, str.indexOf(ext)) + ", " + str.substring(str.indexOf(ext)));
    }
}
