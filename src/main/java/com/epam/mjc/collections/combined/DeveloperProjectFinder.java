package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) {
                resultList.add(e.getKey());
            }
        }

        resultList.sort((o1, o2) -> o2.length() == o1.length()
                ? String.CASE_INSENSITIVE_ORDER.compare(o2, o1)
                : Integer.compare(o2.length(), o1.length()));

        return resultList;
    }
}
