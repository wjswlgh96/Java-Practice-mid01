package lang.string.ex;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] splitStr = email.split("@");
        String id = splitStr[0];
        String domain = splitStr[1];

        System.out.println("id = " + id);
        System.out.println("domain = " + domain);
    }
}
