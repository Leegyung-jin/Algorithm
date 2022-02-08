package com.algorithm.chapter5;

import java.util.HashSet;
import java.util.Scanner;

public class ch5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] num = new int[10];
//        int cnt = 0;
//
//        // 배열에 값 넣기
//        for(int j=0; j<num.length; j++){
//            num[j] = sc.nextInt() % 42;
//        }
//
//        // 42로 나눈 후 값을 비교
//        for (int i=0; i<num.length; i++){
//            for(int k=0; k<num.length; k++){
//                if(num[i] != num[k]){
//                    cnt++;
//                    // 중복으로 확인할 필요 없으니 cnt++ 후 종료
//                    break;
//                }
//            }
//        }
//        System.out.println(cnt);


        HashSet<Integer> setInt = new HashSet<Integer>();

        for (int i=0; i<10; i++){
            // 입력받은 값을 배열을 이용하지 않고 직접 삽입한다.
            // 42로 나눈 나머지 값을 HashSet에 바로 저장한다.
            setInt.add(sc.nextInt() % 42);
        }
        System.out.println(setInt.size());
    }
}
