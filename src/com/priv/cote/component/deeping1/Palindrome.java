package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Palindrome implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length()/2; i++) {
            if(chars[i] != chars[str.length()-i-1]){
                bw.write(String.valueOf(0));
                bw.flush();
                return;
            }
        }
        bw.write(String.valueOf(1));
        bw.flush();
    }
}
