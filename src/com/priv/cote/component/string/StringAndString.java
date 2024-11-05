package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class StringAndString implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        bw.write(s.substring(i-1,i));
        bw.flush();
        bw.close();
    }
}
