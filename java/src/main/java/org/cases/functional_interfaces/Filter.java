package org.cases.functional_interfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public List<String> filterWords(List<String> words) {
        return words.stream()
                .filter(word -> word.length() > 5)
                .map(String::toUpperCase)
                .toList();

    }

    /**
     *
     *filterWords(List.of("apple", "banana", "pear", "avocado"),
     *     word -> word.startsWith("a"),
     *     String::toUpperCase)
     */
    public List<String> filterWords(List<String> words,
                                    Predicate<String> predicate,
                                    Function<String, String> function) {

        return words.stream().filter(predicate)
                .map(function)
                .toList();
    }

    /**
     *
     * aggregate(numbers, 0, Integer::sum)
     * aggregate(numbers, Integer.MIN_VALUE, Integer::max)
     * aggregate(numbers, 1, (a, b) -> a * b)
     */
    public Integer aggregate(List<Integer> nums, Integer identity, BinaryOperator<Integer> operator) {
        return nums.stream()
                .reduce(identity, operator);
    }




}
