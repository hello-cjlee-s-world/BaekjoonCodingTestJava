package com.priv.cote.component.conditional;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class Dice implements BasicInterface {
    public void print () throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a == b && b == c) {
            bw.append(String.valueOf(10000 + (a*1000)));
        } else if((a==b) || (a==c) || (b==c)) {
            int tmp = a==b ? a:a==c ? c:b;
            bw.append(String.valueOf(1000 + (tmp*100)));
        } else {
            bw.append(String.valueOf((Math.max(Math.max(a, b), c) * 100)));
        }
        bw.flush();
        bw.close();
    }
}
