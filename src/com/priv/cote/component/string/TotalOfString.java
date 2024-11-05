package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class TotalOfString implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}
