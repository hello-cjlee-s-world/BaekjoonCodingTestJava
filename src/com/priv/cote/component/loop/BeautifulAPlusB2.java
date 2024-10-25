package com.priv.cote.component.loop;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class BeautifulAPlusB2 implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine())+1;
        for (int i = 1; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.append("Case #")
                    .append(String.valueOf(i))
                    .append(": ")
                    .append(String.valueOf(a))
                    .append(" + ")
                    .append(String.valueOf(b))
                    .append(" = ")
                    .append(String.valueOf(a + b))
                    .append("\n");
        }
        bw.flush();
        bw.close();
    }
}
