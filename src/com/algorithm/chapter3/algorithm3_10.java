package com.algorithm.chapter3;

import java.util.Scanner;

public class algorithm3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int i=0; i<cnt; i++){ // 전체 줄 개수
            for (int j=cnt-1; j>i; j--){
                System.out.print(" ");
            }
            for (int k=0; k<i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
