package com.algorithm.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ch7_4 {
    public static void main(String[] args) throws IOException {
        // #1 Scanner 이용        => 17568 KB / 220 ms
//        Scanner sc = new Scanner(System.in);
//
//        // 테스트 케이스를 반복해야 하는 횟수를 입력한다.
//        int T = sc.nextInt();
//
//        // 문자를 반복할 횟수 R과 문자열 S를 입력한다.
//        for (int i=0; i<T; i++) {
//            int R = sc.nextInt();
//            String S = sc.next();
//
//            // 문자열의 길이만큼 for문을 반복한다.
//            for(int j=0; j<S.length(); j++) {
//                // 하나의 문자를 R만큼 반복하여 출력한다.
//                for (int k=0; k<R; k++) {
//                    char ch = S.charAt(j);
//                    System.out.print(ch);
//                }
//            }
//            System.out.println();
//        }


        // #2 BufferedReader 이용     => 14096 KB / 144 ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // T를 int 형으로 변환한다.
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            // readLine은 한 줄을 통채로 받아오기 때문에 공백을 기준으로 R과 S를 받을 수 있도록 한다.
            String[] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for (int j=0; j<S.length(); j++) {
                for (int k=0; k<R; k++) {
                    char ch = S.charAt(j);
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}
