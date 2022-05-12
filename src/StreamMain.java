import java.util.*;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
            Stream<Integer> stream = Stream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
            stream.filter(x -> x > 0 && x % 2 == 0)
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);
    }
}