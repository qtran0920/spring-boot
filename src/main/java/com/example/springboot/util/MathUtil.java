package com.example.springboot.util;

import java.util.stream.Stream;

public class MathUtil {

    // https://gist.github.com/artlovan/d7315b375f4553a1be1605b16c7a9098

    public static Long fibonacci(int n) {
        return Stream.iterate(new long[]{0, 1}, fibArr -> new long[]{fibArr[1], fibArr[0] + fibArr[1]})
                     .limit(n + 1)
                     .map(fibArr -> fibArr[0])
                     .reduce((f, s) -> s)
                     .orElse(null);
    }

}


