package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class StringToAscii implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char s = br.readLine().charAt(0);
        bw.write(String.valueOf((int)s));
        bw.flush();
        bw.close();
    }
}
