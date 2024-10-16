package com.priv.cote.component.inputouput;

import java.io.*;
import java.util.StringTokenizer;

public class AFourBasicOperationsB {
    public void fourBasicOperations() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(a+b));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(a-b));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(a*b));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(a/b));
        bw.flush();bw.newLine();
        bw.write(String.valueOf(a%b));
        bw.flush();bw.newLine();
        bw.close();
    }
}
