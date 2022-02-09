package com.algorithm.chapter7;

import java.util.Scanner;

public class ch7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int sum = 0;
        // 공백 없이 숫자를 입력한다.
        String cList = sc.next();

        // chatAt을 이용해 하나씩 받아 변수 sum에 값을 더한다.
        for (int i=0; i<cnt; i++){
            sum += cList.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
