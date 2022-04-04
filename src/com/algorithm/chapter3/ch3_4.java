package com.algorithm.chapter3;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch3_4 {
    public static void main(String[] args) throws IOException {
        /*#1. Scanner 사용 ( 시간초과 )
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=0; i<T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
        */
        // BufferReader 사용 ( 235740 KB / 864 ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(A+B + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
