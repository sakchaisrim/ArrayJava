package CalMark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] scores;
        scores = new int[5];
        Scanner scan =new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Score[%d] = ",i );
            scores[i] = scan.nextInt();
        }

        MaxMinAvg test = new MaxMinAvg();
        int max, min;
        float avg;

        min = test.getMin(scores);
        max = test.getMax(scores);
        avg = test.getAvg(scores);

        System.out.println("Min Score: " + min);
        System.out.println("Max Score: " + max);
        System.out.println("Mean Score: " + avg);

    }
}
