package org.cases.kata;

public class StringCalculator {

    public int add(String nums) {
        int sum = 0;

        for (int i = 0; i < nums.length(); i++) {
            var currentEl = nums.charAt(i);

            if (Character.isDigit(currentEl)) {
                sum += Integer.parseInt(String.valueOf(currentEl));
            }
        }

        return sum;
    }

}
