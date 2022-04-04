package com.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch3_7 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 사용 (18640 KB / 252 ms )
        /*
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i=0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + (i+1) + ": " + (A+B));
        }
        */

        // #2. BufferReader 사용 ( 16152 KB / 160 ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + (i+1) + ": " + (A+B));
        }
    }
}
