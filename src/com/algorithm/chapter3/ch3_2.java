package com.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch3_2 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 사용 (17940KB / 228ms )
        // Scanner sc = new Scanner(System.in);
        // int T = sc.nextInt();

        // #2. BufferReader 사용 ( 14224KB / 128ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


         for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
             // int A = sc.nextInt();
             // int B = sc.nextInt();
             int A = Integer.parseInt(st.nextToken());
             int B = Integer.parseInt(st.nextToken());

             System.out.println(A+B);
         }
    }
}
