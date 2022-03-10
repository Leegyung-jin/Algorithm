package com.algorithm.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch2_1 {

    public static void main(String[] args) throws IOException {
        /*
        // #1. Scanner를 이용한 경우
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        */

        // #2. BufferedReader 이용한 경우

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // #3. if문 사용
        if( A > B) {
            System.out.println(">");
        } else if( A < B ) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        // #4. 삼항 연산자 사용
        System.out.println(((A>B ? ">" : (A<B) ? "<" : "===")));

    }
}
