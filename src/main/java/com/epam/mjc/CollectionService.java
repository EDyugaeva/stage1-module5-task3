package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream()
                .max(Comparator.naturalOrder());

    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        Optional<Integer> integer = list.stream()
                .flatMap(l -> l.stream())
                .min(Comparator.naturalOrder());
        return integer;

    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }
}
