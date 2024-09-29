package org.example;

import java.util.HashMap;
import java.util.Map;

public class ElementCounter {

    public static <T> Map<T, Integer> countElements(T[] elements) {
        Map<T, Integer> elementCountMap = new HashMap<>();

        for (T element : elements) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        return elementCountMap;
    }
}
