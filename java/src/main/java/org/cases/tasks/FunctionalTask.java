package org.cases.tasks;

import java.util.Arrays;
import java.util.List;

// Необходимо написать функцию, которой на вход подаётся List<Long>,
// а на выходе она должна вернуть ближайшее к нулю число из данного списка
public class FunctionalTask {

    private static Long getMinByAbsValue() {
        List<Long> numbers = Arrays.asList(1500L, -20000L, 4000L, 100000L, 20000L, -1L);
        Long min = Long.MAX_VALUE;

        for(Long num : numbers) {
            min = Math.abs(num) < min ? num : min;
        }
        return min;


//        System.out.println(getMinByAbsValue(numbers));
    }
}
