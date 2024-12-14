package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        // Integer newInteger = new Integer(10);                // 미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer newInteger = Integer.valueOf(10);            // valueOf는 캐싱된 값을 사용하기에 같은 값이면 ==연산자의 값이 true로 나온다.
        Integer integerObj = Integer.valueOf(10);            // -128 ~ 127 자주 사용하는 숫자 값이 캐싱 되어있음, 불변
        System.out.println("integerObj = " + integerObj);

        Long longObj = Long.valueOf(100);
        System.out.println("longObj = " + longObj);

        Double doubleObj = Double.valueOf(10.5);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (integerObj == newInteger));
        System.out.println("equals : " + (integerObj.equals(newInteger)));
    }
}
