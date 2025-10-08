import java.util.*;
public class Streamdiff {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Sequential Stream:");
        numbers.stream()
                .forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));

        System.out.println("\nParallel Stream:");
        numbers.parallelStream()
                .forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));
    }
}
