package com.algorithm.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch7_5 {
    public static void main(String[] args) throws IOException {
        // #1 Scanner 이용            메모리 31596 KB / 시간 524 ms
        // Scanner sc = new Scanner(System.in);

        // #2 BufferedReader 이용     메모리 20060 KB / 시간 272 ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 알파벳 배열, 최댓값, 출력할 문자를 선언한다.
        int[] arr = new int[26];
        int max = 0;
        char value = ' ';

        // 문자열을 입력받는다.
        // #1
        // String S = sc.nextLine();
        // #2
        String S = br.readLine();

        // 문자열의 길이만큼 for문을 반복한다.
        for (int i=0; i<S.length(); i++) {
            // 배열의 값에 따라 대문자, 소문자인지 확인 후 계산을 진행하도록 한다.
            if (65 <= S.charAt(i) && S.charAt(i) <= 90) {
                // 배열은 총 26개이며 입력한 알파벳의 순서에 해당하는 값에서 1을 더한다.
                arr[S.charAt(i) - 65]++;
            } else {
                // 입력받은 문자가 대문자가 아닐 때(소문자) 해당 배열의 값을 1 더한다.
                arr[S.charAt(i) - 97]++;
            }
        }

        // 알파벳 개수만큼 for문을 반복하여 최댓값을 카운트하여 max에 삽입한다.
        for (int i=0; i < 26; i++) {
            // arr[i]가 0보다 클 때 value에 배열의 값을 대문자로 삽입한다.
            if ( max < arr[i] ) {
                max = arr[i];
                value = (char)(i+65);
            }
            // 새로운 arr[i]와 기존에 삽입된 max의 값이 같을 때 value에 ?를 삽입한다.
            else if ( max == arr[i] ) {
                value = '?';
            }
        }
        System.out.println(value);
    }
}
