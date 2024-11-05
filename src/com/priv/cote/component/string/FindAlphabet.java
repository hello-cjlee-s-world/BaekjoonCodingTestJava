package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class FindAlphabet implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] arr = new int[26];
        for(int i = 0; i < 26; i++) {
            int n = s.indexOf(String.valueOf((char)(97 + i)))+1;
            if(n > 0){
                arr[i] = n;
            }
        }
        for(int n:arr){
            if(n == 0) bw.append(String.valueOf(-1)).append(" ");
            else bw.append(String.valueOf(n-1)).append(" ");
        }
        bw.flush();
        bw.close();
    }
}
