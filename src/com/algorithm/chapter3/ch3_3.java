package com.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch3_3 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 사용 (17700 KB / 212 ms )
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // #2. BufferReader 사용 ( 14200 KB / 128 ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i=0; i<n+1; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
