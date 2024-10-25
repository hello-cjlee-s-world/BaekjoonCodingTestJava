package com.priv.cote.component.conditional;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class ACompareB implements BasicInterface {
    public void print () throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a == b) {
            bw.append("==");
        } else {
            bw.append(a > b ? ">" : "<");
        }
        bw.flush();
        bw.close();
    }
}
