package reduce;

import java.util.Arrays;

public class TestReduce {

    public static void main(String[] args) {

        var number = Arrays.asList(2, 3, 4, 5, 10, 24, 52);
        var even = number.stream().filter(x -> x % 2 == 0).reduce(100, (a, b) -> a + b);
        System.out.println(even);

        var number1 = Arrays.asList(2, 3, 4, 5);
        var even1 = number1.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(even1);
    }
}
