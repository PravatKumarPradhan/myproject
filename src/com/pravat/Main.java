package com.pravat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 10;

        Map<String, String> wordsByKey = new HashMap<>();
        wordsByKey.put("1", "one");
        wordsByKey.put("2", "two");
        wordsByKey.put("3", "three");
        wordsByKey.put("4", "four");
        String mapAsString = wordsByKey.keySet().stream()
                .map(key -> key + ":" + wordsByKey.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println(mapAsString);


    }

}



