package com.algorithm.chapter6_R;

public class ch6_1 {
    long sum(int[] a) {
        long sum = 0;
        for (int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
