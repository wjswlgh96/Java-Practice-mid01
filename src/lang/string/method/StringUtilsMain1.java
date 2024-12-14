package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("numString = " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("boolString = " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("objString = " + objString);

        // 문자 + x -> 문자
        String numString2 = "" + num;
        System.out.println("numString2 = " + numString2);       // "100"

        // toCharArray 메서드
        char[] charArr = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + charArr);                            // 문자열을 문자 배열로 변환
        for (char c : charArr) {
            System.out.print(c);
        }
    }
}
