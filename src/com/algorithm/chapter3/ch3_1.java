package com.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch3_1 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 사용 (18644KB / 236ms )
        // Scanner sc = new Scanner(System.in);
        // int cnt = sc.nextInt();

        // #2. BufferReader 사용 ( 16160KB / 160ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for (int j=1; j<10; j++) {
            System.out.println(cnt + " * " + j + " = " + cnt*j);
        }
    }
}
