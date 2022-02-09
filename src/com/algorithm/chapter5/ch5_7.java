package com.algorithm.chapter5;

import java.util.Scanner;

public class ch5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

//        #1
//        double[] temp = new double[testCase];
//        double[] avg = new double[testCase];
//
//        // result 개수만큼 학생을 받는다.
//        for (int i=0; i<testCase; i++){
//            // 학생 수 입력.
//            int cnt = sc.nextInt();
//            int sum = 0;
//            int[] point = new int[cnt];
//
//            // 학생 수 만큼 점수 입력
//            for (int j=0; j<cnt; j++){
//                point[j] = sc.nextInt();
//                sum += point[j];
//            }
//            // 케이스별 평균
//            avg[i] = (float)sum/cnt;
//
//            double castCnt =0;
//            for (int j=0; j<point.length; j++){
//                if (point[j] > avg[i]) {
//                    castCnt++;
//                }
//            }
//            temp[i] = ((castCnt/point.length) * 100);
//        }
//        for (int i=0; i<testCase; i++){
//            System.out.println(String.format("%.3f", temp[i]) + "%");
//        }

        // # 2
        // result 개수만큼 학생을 받는다.
        for (int i=0; i<testCase; i++){
            // 학생 수 입력.
            int cnt = sc.nextInt();
            double sum = 0;
            int[] point = new int[cnt];

            // 학생 수 만큼 점수 입력
            for (int j=0; j<cnt; j++){
                point[j] = sc.nextInt();
                sum += point[j];
            }
            // 케이스별 평균
            double avg = sum/cnt;
            double castCnt = 0;

            for (int j=0; j<point.length; j++){
                if (point[j] > avg) {
                    castCnt++;
                }
            }
            System.out.printf("%.3f%%\n", (castCnt/cnt)*100);
        }
    }
}
