package com.algorithm.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch8_2 {
    public static void main(String[] args) throws IOException {
      /* *
      * range              cnt
      * 2 - 7 = 5           2
      * 8 - 19 = 11     6   3
      * 20 - 37 = 17    6   4
      * 38 - 61 = 23    6   5
      * */

        // #1 Scanner 사용        => 17788 KB / 212 ms
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();

        // #2 BufferedReader 사용 => 14124 KB / 128 ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N이 1일때에는 바로 출력되므로 2부터 시작한다.
        int range = 2;
        // N이 2일 때부터 계산을 하기 때문에 카운트는 1부터 시작한다.
        int cnt = 1;

        if (N == 1) {
            System.out.println(cnt);
        } else {
            // 반복 횟수가 정해지지 않았으므로 while문 사용
            while (range <= N) {
                // range가 N보다 작을 때를 계산하여 범위를 구한다.
                range = range + (cnt * 6);
                // 한 번 range를 계산할 때마다 room의 cnt를 증가시킨다.
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}