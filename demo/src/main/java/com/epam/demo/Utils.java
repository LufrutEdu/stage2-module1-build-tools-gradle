package com.epam.demo;

import java.util.List;
import java.util.function.Predicate;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        Predicate<String> check = str -> {
            if(str.contains("-")) return false;
            else if(str.contains("0")) return false;
            else if(str.isEmpty()) return false;
            else if(str.isBlank()) return false;
            else if(str == null) return false;
            else return true;
        };
        return args.stream()
                .allMatch(check);
    }
}