package com.algorithm.chapter5;

import java.util.Scanner;

public class ch5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ## 첫 번째 방법
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int value = a*b*c;
//        String sValue = Integer.toString(value);
//        int arr[] = new int[sValue.length()];
//        int cnt[] = new int[10];
//
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = sValue.charAt(i)-'0';
//        }
//
//        for (int i=0; i<10; i++){
//            for (int j=0; j<arr.length; j++){
//                if(arr[j] == i) {
//                    cnt[i] += 1;
//                }
//            }
//        }
//        for (int i=0; i<cnt.length; i++){
//            System.out.println(cnt[i]);
//        }

//      ## 두 번째 방법
        int value = sc.nextInt() * sc.nextInt() * sc.nextInt();
        String str = Integer.toString(value);

        for (int i=0; i<10; i++){
            int cnt = 0;
            for (int j=0; j<str.length(); j++){
                if(str.charAt(j)-'0' == i) {
                    cnt+= 1;
                }
            }
            System.out.println(cnt);
        }
    }
}
