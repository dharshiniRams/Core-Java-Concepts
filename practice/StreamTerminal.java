import java.util.*;
import java.util.stream.*;
class StreamTerminal{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        numbers.stream()
                .forEach(n -> System.out.println("Number: " + n));
        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
        long count = numbers.stream()
                .filter(n -> n > 20)
                .count();
        System.out.println("Count > 20: " + count);
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(n -> System.out.println("First Element: " + n));
        Optional<Integer> any = numbers.parallelStream().findAny();
        any.ifPresent(n -> System.out.println("Any Element: " + n));
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}