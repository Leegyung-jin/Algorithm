package com.algorithm.chapter5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ch5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] M = new double[sc.nextInt()];
        double sum = 0;

        for (int i=0; i<M.length; i++) {
            // 배열에 과목 수 만큼 점수를 입력한다.
            M[i] = sc.nextDouble();
        }
        Arrays.sort(M);

        // 점수가 최댓값보다 클 때 max에 점수를 저장하고, 최댓값보다 작을 때 점수/M*100으로 수정한다.
        for(int i=0; i<M.length;i++) {
            sum += M[i] / M[M.length-1] * 100;
        }
        // 평균 값 계산
        double avg = sum/M.length;
        System.out.println(avg);

        //        오답
//            if(max > point[i]) {
//                point[i] = point[i] / max * 100;
//            } else{
//                max = point[i];
//                System.out.println("else, " + max);
//            }
//            sum += point[i];
//        }
    }
}
