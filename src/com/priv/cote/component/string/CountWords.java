package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class CountWords implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(new StringTokenizer(br.readLine()).countTokens()));
        bw.flush();
        bw.close();
    }
}
