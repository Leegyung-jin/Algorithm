package com.algorithm.chapter3;


import java.io.*;

public class algorithm3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cntS = br.readLine();
        int cnt = Integer.parseInt(cntS);

        for (int i=0; i<cnt; i++){
            String[] numS = br.readLine().split(" ");
            int sum = Integer.parseInt(numS[0]) + Integer.parseInt(numS[1]);
            bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
    }
}
