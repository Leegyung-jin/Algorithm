package com.algorithm.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch8_1 {
    public static void main(String[] args) throws IOException {
        /*
         A 고정 비용
         B 가변 비용
         C 책정된 가격

         C * n > A + (B * n) >> true일 때 손익분기점
        */

        // #1
        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();

        // #2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

         if (C <= B) {
             System.out.println(-1);
         } else {
             System.out.println((A/(C-B))+1);
         }
    }
}