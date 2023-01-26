package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            int len = e.getKey().length();
            resultMap.putIfAbsent(len, new HashSet<>());
            resultMap.get(len).add(e.getKey());
        }

        return resultMap;
    }
}
