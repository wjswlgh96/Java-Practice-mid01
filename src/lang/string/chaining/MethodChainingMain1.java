package lang.string.chaining;

public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(2);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("result = " + adder.getValue());
        System.out.println("result = " + adder1.getValue());
        System.out.println("result = " + adder2.getValue());
        System.out.println("result = " + adder3.getValue());
    }
}
