package com.epam.demo;

import java.util.List;
import java.util.function.Predicate;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        Predicate<String> check = str -> {
            if(str.contains("-")) return true;
            else if(str.contains("0")) return true;
            else if(str.isEmpty()) return true;
            else if(str.isBlank()) return true;
            else if(str == null) return true;
            else return false;
        };
        return !args.stream()
                .anyMatch(check);
    }
}