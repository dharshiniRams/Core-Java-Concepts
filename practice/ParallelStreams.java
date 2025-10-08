import java.util.*;
import java.util.stream.*;

class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 1000000)
                .boxed()
                .collect(Collectors.toList());

        long start1 = System.currentTimeMillis();
        numbers.stream()
                .map(n -> n * 2)
                .count();
        long end1 = System.currentTimeMillis();
        System.out.println("Sequential Time: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        numbers.parallelStream()
                .map(n -> n * 2)
                .count();
        long end2 = System.currentTimeMillis();
        System.out.println("Parallel Time: " + (end2 - start2) + " ms");
    }
}
