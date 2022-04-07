package com.algorithm.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch3_10 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 사용 (18328 KB / 380 ms)
        /*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        */

        // #2. BufferedReader 사용 ( 19896 KB / 296 ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            for (int k=(N-i-1); k>0; k--){
                System.out.print(" ");
            }
            for (int j=0; j<(i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
