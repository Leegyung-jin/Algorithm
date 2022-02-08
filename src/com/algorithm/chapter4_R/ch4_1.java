package com.algorithm.chapter4_R;

import java.util.Scanner;

public class ch4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         # 1
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        while (a != 0 && b != 0){
//            System.out.println(a + b);
//            a = sc.nextInt();
//            b = sc.nextInt();
//        }
//        # 2
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 & b == 0){
                break;
            }
            System.out.println(a+b);
        }
    }
}
