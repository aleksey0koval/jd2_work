package it.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Average {

    public static void main(String[] args) {
        // List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> numbers = new ArrayList<>();
//        numbers.add(0);
//        numbers.add(0);
//        numbers.add(0);

        System.out.println(getAverage(null));

    }

    public static Double getAverage(List<Integer> numbers) {
        if (numbers == null) {
            return 0.0;
        }
        return numbers.stream()
                .filter(Objects::nonNull)
                .mapToInt(value -> value)
                .average()
                .orElse(0.0);
    }
}
