package com.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch2_5 {
    public static void main(String[] args)  {
        // #1. Scanner 이용 ( 17652KB / 204ms )
         Scanner sc = new Scanner(System.in);

         int h = sc.nextInt();
         int m = sc.nextInt();


         if (m < 45) {
             // 정리
             // h = h -1 ;
             // m = 60-(45-m);
             // if (h < 0) {
             //   h = 23;
             // }
             if (h == 0) {
                 h = 23;
             } else {
                 h = h-1;
             }
             m = 60-(45-m);
             System.out.println(h + " " + m);
         } else {
             m = m-45;
             System.out.println(h + " " + m);
         }



        // #2. BufferReader 이용 ( 14084KB / 124ms )
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }
}
