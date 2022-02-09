package com.algorithm.chapter6_R;

public class ch6_2_R {
    public static void main(String[] args) {
        boolean[] chk = new boolean[10001];
        int arr[] = new int[10001];

        for (int i=0; i < 10; i++){
            int n = d(i);

            if (10001 > n) {
                chk[n] = true;
                System.out.println("chk[" + n + "]= " + chk[n]);
            }
            if(!chk[i]) {
                arr[i] = i;
                System.out.println("arr[" + i + "]= " + arr[i]);
            }
        }
    }

    public static int d(int n) {
        int sum = n;

        while (n != 0){
            sum = sum + (n % 10);
            n = n/10;
        }
        System.out.println("sum= " + sum);
        return sum;
    }
}