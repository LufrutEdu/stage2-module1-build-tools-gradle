package com.epam.demo;

import java.util.List;
import java.util.function.Predicate;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        Predicate<String> check = str -> {
            if(str.contains("-")) return false;
            if(str.contains("0")) return false;
            if(str.isEmpty()) return false;
            return !str.isBlank();
        };
        return args.stream()
                .allMatch(check);
    }
}