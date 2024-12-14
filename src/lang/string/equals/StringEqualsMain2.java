package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        // String 은 그래도 항상 equals 써서 비교해야 한다. 아래는 그 이유에 대한 코드다.

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1 : " + isSame(str1, str2));           // false

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2 : " + isSame(str3, str4));           // true

        // 사실 개발은 혼자 진행하는 일이 드물다. 다른 사람이 만든 isSame 메서드를 사용한다고 가정했을때
        // isSame 메서드는 인자로 전해지는 String 이 new String 형태일지 문자열 리터럴 형태로 생성된 객체인지 알 수가 없다.
        // 그래서 그런것을 방지하기 위해 애초에 값을 비교하는 == 연산자기에 equals 로 사전에 일어날 사고를 방지하는 것이다.
    }

    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
