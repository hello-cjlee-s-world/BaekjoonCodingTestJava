package com.priv.cote.component.conditional;

import java.io.*;

public class TestScore {
    public void print () throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int score = Integer.parseInt(br.readLine());
        if(score >= 90) bw.append("A");
        else if (score >= 80) bw.append("B");
        else if (score >= 70) bw.append("C");
        else if (score >= 60) bw.append("D");
        else bw.append("F");
        bw.flush();
        bw.close();
    }
}
