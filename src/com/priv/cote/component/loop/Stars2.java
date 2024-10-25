package com.priv.cote.component.loop;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Stars2 implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine())+1;
        for (int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                if(j < n-i){
                    bw.append(" ");
                } else {
                    bw.append("*");
                }
            }
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
