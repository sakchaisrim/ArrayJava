package ArrayFill;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num [] = {7, 66, 16, 3, 5, 1};

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        Arrays.fill(num, 5);
        System.out.println("\nAfter fill(num,5)");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }



    }
}
