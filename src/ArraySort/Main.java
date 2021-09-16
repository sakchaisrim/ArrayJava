package ArraySort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] num = { 15, 66, 18, 19, 5, 1};
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.printf("num[%d] = ",i );
            System.out.println(num[i]);
        }
    }
}
