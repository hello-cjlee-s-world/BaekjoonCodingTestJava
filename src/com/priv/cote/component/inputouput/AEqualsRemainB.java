package com.priv.cote.component.inputouput;

import java.io.*;
import java.util.StringTokenizer;

public class AEqualsRemainB {
    public void equalsRemain() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf((a+b)%c));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(((a%c)+(b%c))%c));
        bw.flush();bw.newLine();
        bw.write(String.valueOf((a*b)%c));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(((a%c)*(b%c))%c));
        bw.flush();bw.newLine();
        bw.close();
    }
}
