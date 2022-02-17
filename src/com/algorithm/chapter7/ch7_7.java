package com.algorithm.chapter7;

import java.util.Scanner;

public class ch7_7 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String stringA = "";
        String stringB = "";

        // 문자열 반대로 넣기
        for (int i=a.length()-1; i>=0; i--) {
            stringA = stringA + a.charAt(i);
            stringB = stringB + b.charAt(i);
        }
        // 비교를 위해 int로 형변환
        int aa = Integer.parseInt(stringA);
        int bb = Integer.parseInt(stringB);

        if ( aa > bb ) {
            System.out.println(aa);
        } else {
            System.out.println(bb);
        }
    }
}