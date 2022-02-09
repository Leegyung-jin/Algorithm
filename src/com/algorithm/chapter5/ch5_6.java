package com.algorithm.chapter5;

import java.util.Scanner;

public class ch5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] result = new String[sc.nextInt()]; // OX개수

        // 개수 입력
        for (int i=0; i<result.length; i++) {
            result[i] = sc.next();
        }
        sc.close();

        // OX 값 계산
        for (int i=0; i<result.length; i++){
            int point = 0;
            int cnt = 0;
            for (int j=0; j<result[i].length(); j++) {
                if (result[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                point += cnt;
            }
        System.out.println(point);
        }
    }
}
