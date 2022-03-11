package com.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch2_2 {
    public static void main(String[] args) throws IOException {

        // #1. Scanner를 이용한 경우 (17752 KB / 216 ms)
        // Scanner sc = new Scanner(System.in);
        // int A = sc.nextInt();

        // #2. BufferedReader 이용한 경우 (14256 KB / 132 ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        // #3. if문 사용
        if(90 <= A) {
            System.out.println("A");
        } else if(80 <= A) {
            System.out.println("B");
        } else if(70 <= A) {
            System.out.println("C");
        } else if(60 <= A) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
