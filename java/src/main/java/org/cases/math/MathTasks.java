package org.cases.math;

public class MathTasks {

    public int randomInRange(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1 )) + min;
    }


    public int[] generateArrWithRandom(int num) {
        int randomMax = randomInRange(2, num);
        int[] arr = new int[randomMax];

        for (int i = 0; i < randomMax; i++) {
            arr[i] = randomInRange(0, randomMax);
        }

        return arr;
    }

}
