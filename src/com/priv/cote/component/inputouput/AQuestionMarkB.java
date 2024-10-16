package com.priv.cote.component.inputouput;

import java.io.*;
import java.util.StringTokenizer;

public class AQuestionMarkB {
    public void plusQuestionMark() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(br.readLine()+"??!");
        bw.flush();
        bw.close();
    }
}
