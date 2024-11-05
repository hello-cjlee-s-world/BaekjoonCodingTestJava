package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class StringLength implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(br.readLine().length()));
        bw.flush();
        bw.close();
    }
}
