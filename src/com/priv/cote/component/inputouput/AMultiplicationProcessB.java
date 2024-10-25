package com.priv.cote.component.inputouput;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class AMultiplicationProcessB implements BasicInterface {
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(a * (b % 10)));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(a * ((b % 100)/10)));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(a * (b / 100)));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(a*b));
        bw.flush();bw.newLine();
        bw.close();
    }
}
