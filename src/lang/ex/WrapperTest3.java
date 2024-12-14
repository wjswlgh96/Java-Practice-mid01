package lang.ex;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        Integer integerValue = Integer.valueOf(str);
        int intValue = integerValue.intValue();
        Integer reIntegerValue = Integer.valueOf(intValue);

        System.out.println("integerValue = " + integerValue);
        System.out.println("intValue = " + intValue);
        System.out.println("reIntegerValue = " + reIntegerValue);
    }
}
