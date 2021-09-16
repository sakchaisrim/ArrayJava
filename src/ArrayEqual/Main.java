package ArrayEqual;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] num1 = {7, 66, 16, 3, 5, 1};
        int [] num2 = {3, 66, 16, 7, 5, 1};
        Arrays.sort(num1);
        Arrays.sort(num2);

        System.out.println("result (num1 compare num2) = "+
                        Arrays.equals(num1, num2)
                );

    }
}
