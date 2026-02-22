package coding_bat.gera.lamda_demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;           // 8
        MathOperation multiply = (a, b) -> a * b;      // 15

        System.out.println(sum.operation(5,3));
        System.out.println(multiply.operation(5,3));

        //1. Predicate <T> - проверка условия (test())

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));         // true

        // 2. Function<T ,R>  - преобразование (apply())

        Function<String,Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Hello"));   // 5

        // 3. Consumer<T> - принимает, но не возвращает (accept())
        Consumer<String> printer = str -> System.out.println("Hello" + str);
        printer.accept("World");

        // 4. Supplier <T> - не принимает, но возвращает

        Supplier<Double> randomGenerator = () -> Math.random();
        System.out.println(randomGenerator.get());


        // Использование лямбд в STREAM API

        List<String> names = Arrays.asList("Alice", "Bob","Charlie");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

    }
}
