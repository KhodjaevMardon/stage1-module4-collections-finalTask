package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> resultSet = new HashSet<>();
        for (Map.Entry<String, List<String>> e : timetable.entrySet()) {
            resultSet.addAll(e.getValue());
        }

        return resultSet;
    }
}
