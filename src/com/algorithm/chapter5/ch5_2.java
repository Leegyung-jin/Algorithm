package com.algorithm.chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class ch5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[9];
        int max = 0, cnt = 0;

        for (int i=0; i<9; i++){
            num[i] = sc.nextInt();
        }

        for (int i=0; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
                cnt = i+1;
            }

        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
