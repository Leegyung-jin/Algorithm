package com.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch3_11 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 사용 (30936 KB / 572 ms)
        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
             arr[i] = sc.nextInt();
        }
        for (int j=0; j<N; j++) {
            if (arr[j] < X) {
                System.out.print(arr[j] + " ");
            }
        }
        */

        // #2. BufferedReader 사용 ( 15304 KB / 164 ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if (A < X) {
                sb.append(A).append(" ");
            }
        }
        System.out.println(sb);
    }
}
