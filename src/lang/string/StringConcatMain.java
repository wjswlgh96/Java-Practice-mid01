package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;             // 참조형끼리의 +연산자는 원칙적으로 안된다. 그러나 문자열은 너무 자주 쓰여서 Java에서 +연산이 가능하도록 제공해준다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
