package Array2D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] numStd;
        int [] tfac;
        int total=0;

        numStd = new int[2][4];
        tfac = new int[2];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter total Student in Faculty " + (i+1));
            tfac[i] = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Year " + (j+1) + " = ");
                numStd[i][j] = scan.nextInt();
                tfac[i] = tfac[i] + numStd[i][j];
            }
            total = total + tfac[i];
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("================================\n");
            for (int j = 0; j < 4; j++) {
                System.out.println("Student in Year" + (j+1) + " = " + numStd[i][j]);
            }
            System.out.println("Student in Faculty " + (i+1) + " = " + tfac[i]);
        }
        System.out.println("=========================\n");
        System.out.println("Total Student = " + total);
    }
}
