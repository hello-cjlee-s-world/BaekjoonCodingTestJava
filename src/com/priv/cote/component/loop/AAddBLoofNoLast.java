package com.priv.cote.component.loop;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class AAddBLoofNoLast implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String s = br.readLine();
            if(s == null || s.isEmpty()) break;
            StringTokenizer st = new StringTokenizer(s, " ");
            bw.append(String.valueOf(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))).append("\n");
        }
        bw.flush();
        bw.close();
    }
}
