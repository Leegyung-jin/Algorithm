package com.algorithm.chapter6_R;

import java.util.Scanner;

public class ch6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(hanN(input));
    }
    
    public static int hanN(int n) {
        int cnt = 0;

        // inputNumber가 100 미만일 때 한수 = 전달 값
        if (n < 100){
            return n;
        // inputNumber가 100 이상일 때 한수의 개수 구하기
        } else {
            // 100 미만의 값의 한수는 99개
            cnt = 99;

            // inputNumber만큼 for문을 반복 실행하여 한수의 개수를 구한다.
            for(int i = 100; i <= n; i++){
                int n1 = i/100;
                int n2 = (i/10)%10;
                int n3 = i%10;

                if((n1-n2) == (n2-n3)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}