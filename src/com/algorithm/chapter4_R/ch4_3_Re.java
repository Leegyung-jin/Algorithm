package com.algorithm.chapter4_R;

import java.util.Scanner;

public class ch4_3_Re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int cnt = 0;

        int n1, n2;
//        int n1 = (N / 10);
//        int n2 = (N % 10);

        while (true) {

            if(10 > N) {

            }


            N = ((N/10) * 10) + (N%10);
            System.out.println("N- " + N + ", temp- " + temp);
            cnt++;

            if(N == temp){
                break;
            }
        }
        System.out.println(cnt);
    }
}
