package ArraySort2;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] num = new Integer[]{5, 66, 16, 3, 5, 1};
        Arrays.sort(num, Collections.reverseOrder());
        for (int i :num) {
//            System.out.printf("num[%d] = ", i);
            System.out.println(i);
        }
    }
}
