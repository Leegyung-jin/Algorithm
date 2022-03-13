package com.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch2_3 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 이용 ( 17740KB / 204ms )
        // Scanner sc = new Scanner(System.in);
        // int year = sc.nextInt();

        // #2. BufferedReader 이용 ( 14236KB / 128 ms)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if (((year%4==0)&&(year%100!=0)) || (year%400==0)) {
            System.out.println("1");
        } else if (year == 2000) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
