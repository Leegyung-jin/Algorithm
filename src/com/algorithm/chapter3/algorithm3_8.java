package com.algorithm.chapter3;

import java.util.Scanner;

public class algorithm3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=cnt; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = a+b;
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);
        }

    }
}
