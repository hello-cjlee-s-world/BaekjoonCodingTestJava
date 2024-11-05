package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class StringString implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            if(s.length() == 1) bw.append(s).append(s).append("\n");
            else bw.append(s.substring(0,1)).append(s.substring(s.length()-1)).append("\n");

        }
        bw.flush();
        bw.close();
    }
}
