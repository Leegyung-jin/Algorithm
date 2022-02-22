package com.algorithm.chapter7;

import java.util.Scanner;

public class ch7_10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {

        // 입력할 단어의 개수 입력한다.
        int N = sc.nextInt();
        // 그룹 단어의 개수를 셀 변수를 선언한다.
        int cnt = 0;


        // N만큼 단어를 입력한다.
        for (int i=0; i<N; i++) {
            // 그룹단어일 때 cnt를 증가 시킨다.
            if (groupCheck() == true) cnt++;
        }

        // for문이 종료되면 그룹단어의 개수가 출력된다.
        System.out.println(cnt);
    }

    // 그룹단어를 찾을 함수를 선언한다.
    public static boolean groupCheck() {
        // 전체 알파벳 수만큼 배열을 선언하여 중복 값을 확인하도록 한다.
        boolean[] grpChk = new boolean[26];

        // 첫 번째 단어를 비교하기 위해 n1를 선언한 후 str 단어를 입력한다.
        int n1 = 0;
        String str = sc.next();

        // str의 길이만큼 for문을 진행한다.
        for (int i=0; i<str.length(); i++){
            // str 단어의 문자열을 하나씩 n2에 입력한다.
            int n2 = str.charAt(i);

            // 첫 번째 단어와 두 번째 단어가 같지 않은 경우
            if (n1 != n2) {
                // grpChk 배열을 사용하여 값이 false(처음 등장)인지 확인하여 중복 값을 찾는다.
                if (grpChk[n2 - 'a'] == false){
                    // 해당 값을 true로 변경하여 출력된 값임을 나타낸다.
                    grpChk[n2 - 'a'] = true;
                    // n2의 값을 n1로 옮겨서 다음 단어를 n2에 입력받는 형식으로 코드를 진행한다.
                    n1 = n2;
                } else {
                    return false;
                }
            } else {
                // 중복 검사를 하지 않고 다음 for문을 진행한다.
                continue;
            }
        }
        return true;
    }
}