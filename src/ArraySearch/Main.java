package ArraySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num [] = {7, 66, 16, 3, 5, 1};

        Arrays.sort(num);
        int pos = Arrays.binarySearch(num, 7);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +" ");
        }
        System.out.println("\nfound (16) in position= " +pos);
    }
}
