package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class First {
    public static Map<Integer, Integer> countEntities(int[] arr) {
        Map<Integer, Integer> container = new HashMap<>();
        for (int j : arr) {
            container.computeIfPresent(j, (key, value) -> ++value);
            container.putIfAbsent(j, 1);
        }
        return container;
    }

    public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(e -> result.put(e.getKey(), e.getValue()));
        return result;
    }
}
