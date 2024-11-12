package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class PrintSame implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String s = br.readLine();
            if(s == null || s.isEmpty()){
                break;
            } else {
                bw.append(s).append('\n');
                bw.flush();
            }
        }
        bw.close();
    }
}
