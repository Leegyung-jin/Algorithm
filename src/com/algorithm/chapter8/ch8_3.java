package com.algorithm.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch8_3 {
    public static void main(String[] args) throws IOException {
      /* *
      *
      *  1  2  6  7 15
      *  3  5  8 14
      *  4  9 13
      * 10 12
      * 11
      *
      *  2   3   4   5   6  => prev_count_sum
      * 1/1 1/2 1/3 1/4 1/5
      * 2/1 2/2 2/3 2/4
      * 3/1 3/2 3/3
      * 4/1 4/2
      * 5/1
      * */

        // #1 Scanner 사용        => 17788 KB / 212 ms
         Scanner sc = new Scanner(System.in);
         int X = sc.nextInt();
         int count = 1;
         int sum = 0;

        // #2 BufferedReader 사용 => 14124 KB / 128 ms
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int X = Integer.parseInt(br.readLine());

        while (true) {

            if (X <= sum + count) {
                if (count % 2 == 1) {
                    System.out.println((count-(X-sum -1)) + "/" + (X-sum));
                    break;
                } else {
                    System.out.println((X-sum) + "/" + (count-(X-sum-1)));
                    break;
                }
            } else {
                sum += count;
                count++;
            }
        }
    }
}