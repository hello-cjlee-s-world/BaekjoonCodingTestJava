package com.priv.cote.component.loop;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class FastAPlusB implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bw.append(String.valueOf(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))).append("\n");
        }
        bw.flush();
        bw.close();
    }
}
