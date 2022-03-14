package com.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch2_4 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 이용 ( 17652KB / 204ms )
        // Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // int y = sc.nextInt();

        // #2. BufferReader 이용 ( 14084KB / 124ms )
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x>=0 && y>=0) {
            System.out.println("1");
        } else if (x<0 && y>=0) {
            System.out.println("2");
        } else if (x<0 && y<0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
