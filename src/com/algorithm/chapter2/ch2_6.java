package com.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch2_6 {
    public static void main(String[] args) throws IOException {
        // #1. Scanner 이용 ( 18512KB / 236ms )
         // Scanner sc = new Scanner(System.in);

         // int h = sc.nextInt();
         // int m = sc.nextInt();
         // int time = sc.nextInt();

        // #2. BufferedReader 사용 ( 16024KB / 152ms )
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        h = h+(time/60); // time/60 = 환산된 시간
        m = m+(time%60); // tiem%60 = 환산된 분

        // m이 60분 이상일 때 h를 1더하고 60에서 m을 빼준다.
        if (m >= 60) {
            h = h + 1;
            m = m - 60;
        }
        // h가 24 이상일 때 시간을 계산해준다.
        if (h >= 24) {
            h = h-24;
        }
        System.out.println(h + " " + m);
    }
}
