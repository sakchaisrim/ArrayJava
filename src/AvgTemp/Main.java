package AvgTemp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float [] temp;
        float sum,avgTemp;
        sum = 0.0f;

        temp = new float[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < temp.length; i++) {
            System.out.print("temp[" +i + "] = ");
            temp[i] = scan.nextFloat();
            sum += temp[i];
        }
        avgTemp = sum/5;
        System.out.printf("avgTemp= "+ "%.2f",avgTemp);
        System.out.println("\ntemp have member= " + temp.length);
    }
}
