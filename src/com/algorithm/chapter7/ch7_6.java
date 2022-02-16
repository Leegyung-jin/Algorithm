package com.algorithm.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ch7_6 {
    public static void main(String[] args) throws IOException {
        // #1 Scanner 이용            메모리 30896 KB / 시간 480 ms
        // Scanner sc = new Scanner(System.in);

        // #2 BufferedReader 이용     메모리 18444 KB / 시간 244 ms
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 오답 영역 [split] *************************************************************
        // split을 이용했을 때 공백이 있으면 arr는 null로 체크되지 않고 1이 출력된다.
        // String S = sc.nextLine().trim();
        // String[] arr = S.split(" ");
        // *******************************************************************************

        // #ㄱ StringTokenizer를 이용하는 방법.
        // #1
        // String S = sc.nextLine();
        // #2
        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S, " ");

        // 토큰의 개수를 반환한다.
        int count = st.countTokens();

        System.out.println(count);
    }
}