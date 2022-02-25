package com.algorithm.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch8_4 {
    public static void main(String[] args) throws IOException {
        /**
         * A = 낮에 올라간 길이
         * B = 밤에 내려온 길이
         * V = 나무의 높이
         *
         * A = 2
         * B = 1
         * V = 5
         * => (A - B) * i = V
        **/

        /*
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int cnt = 0, i=0;
        int n = (A-B);
        */

        // 오답
        /*
        while (true) {
            if (V <= n) {
                System.out.println(cnt);
                break;
            } else {
                i++;
                // (A-B)를 V가 될 때까지 i회 곱셈한다.
                n = (A-B)*i;
                cnt++;
            }
        }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());


        int cnt = (V-B) / (A-B);
        if ((V-B) % (A-B) != 0) {
            cnt++;
        }
        System.out.println(cnt);
    }
}