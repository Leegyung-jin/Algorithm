package com.algorithm.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ch7_3 {
    public static void main(String[] args) throws IOException {
        // #1 Scanner 이용            > 메모리 18328 KB / 시간 224 ms
        // Scanner sc = new Scanner(System.in);

        // #2 BufferedReader 이용     > 메모리 15880 KB / 시간 114 ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 알파벳 전체의 길이만큼 -1을 입력하여 배열로 만든다.
        int[] arrS = new int[26];
        for (int i=0; i < 26; i++) {
            arrS[i] = -1;
        }

        // 단어를 입력받는다.
        // #1
        // String S = sc.nextLine();

        // #2 Exception을 추가한다.
        String S = br.readLine();

        // 입력받은 단어를 변수에 입력한다.
        for (int i=0; i < S.length(); i++) {
            char ch = S.charAt(i);

            // if문의 조건을 통해 배열의 값이 -1일 때(최초만 변경하기 위한 조건)
            if (arrS[ch - 'a'] == -1) {
                // i의 값을 저장한다.
                // 이 때 배열의 인덱스는 입력받은 단어의 int값에서 기본 값인 'a'를 뺀다.
                // ch - 'a' ===> 입력한 알파벳에서 'a' 뺀 값은 입력한 알파벳의 인덱스이다.
                // 이 때 해당하는 인덱스에 i의 값을 입력하여 출력되는 순서를 알 수 있다.
                arrS[ch - 'a'] = i;
            }
        }

        // 한 번에 arrS를 출력할 수도 있지만 출력 형식이 다르기 때문에 아래와 같이 출력한다.
        for (int n : arrS) {
            System.out.print(n + " ");
        }
    }
}
