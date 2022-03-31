package com.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch3_5 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 사용 (31640 KB / 1044 ms )
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

        // #2. BufferReader 사용 ( 29732 KB / 884 ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

         for(int i=0; i<n; i++) {
             System.out.println(i+1);
         }

    }
}
