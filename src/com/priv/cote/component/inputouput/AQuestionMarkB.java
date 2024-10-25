package com.priv.cote.component.inputouput;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class AQuestionMarkB implements BasicInterface {
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(br.readLine()+"??!");
        bw.flush();
        bw.close();
    }
}
