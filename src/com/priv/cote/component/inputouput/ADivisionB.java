package com.priv.cote.component.inputouput;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class ADivisionB implements BasicInterface {
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken())));
        bw.flush();
        bw.close();
    }
}
