package com.algorithm.chapter4_R;

import java.util.Scanner;

public class ch4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
        sc.close();
    }
}
