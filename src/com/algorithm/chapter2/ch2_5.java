package com.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch2_5 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 이용 ( 18528KB / 232ms )
//         Scanner sc = new Scanner(System.in);

//         int h = sc.nextInt();
//         int m = sc.nextInt();

        // #2. BufferedReader 사용 ( 16172KB / 148ms )

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

         if (m < 45) {
             // #1) 0시 45분 이전일 때 이중 if문을 사용
             if (h == 0) {
                 h = 23;
             } else {
                 h = h-1;
             }
             m = 60-(45-m);


             // #2)
             // h = h-1;
             // m = 60-(45-m);
             // if (h < 0) {
             //   h = 23;
             // }
             System.out.println(h + " " + m);
         } else {
             m = m-45;
             System.out.println(h + " " + m);
         }
    }
}
