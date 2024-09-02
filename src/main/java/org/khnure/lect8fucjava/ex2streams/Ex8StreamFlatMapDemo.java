package org.khnure.lect8fucjava.ex2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex8StreamFlatMapDemo {
    // Метод для демонстрації операції flatMap, яка згладжує складні структури даних
    public List<Integer> flattenLists(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(List::stream) // Згладжує списки в один потік чисел
                .collect(Collectors.toList());
    }
}
