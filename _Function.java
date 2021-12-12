package functionalinterface;

import java.util.function.Function;

// RETURN

public class _Function {

    public static void main(String[] args) {

        int incremented = incrementByOne(1);
        System.out.println(incremented);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }

}
