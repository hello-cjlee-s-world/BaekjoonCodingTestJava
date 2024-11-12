package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Constant implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        String s1 = s[0];
        String s2 = s[1];
        int a = Integer.parseInt(s1.substring(2)+s1.charAt(1)+s1.charAt(0));
        int b = Integer.parseInt(s2.substring(2)+s2.charAt(1)+s2.charAt(0));
        bw.write(String.valueOf(Math.max(a, b)));
        bw.flush();
        bw.close();
    }
}
