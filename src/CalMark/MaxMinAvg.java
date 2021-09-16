package CalMark;

import java.util.Arrays;

public class MaxMinAvg {
    public int getMax(int [] p){
        Arrays.sort(p);
        int max = p[p.length-1];
        return max;
    }
    public int getMin(int [] p){
        Arrays.sort(p);
        int min = p[0];
        return min;
    }
    public float getAvg(int [] p){
        float sum, avg;
        sum= 0.0f;
        for (int i = 0; i < p.length; i++) {
            sum += p[i];
        }
        avg = sum/p.length;
        return avg;
    }
}
