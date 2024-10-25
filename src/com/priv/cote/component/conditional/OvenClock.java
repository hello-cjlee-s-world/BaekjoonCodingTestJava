package com.priv.cote.component.conditional;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class OvenClock implements BasicInterface {
    public void print () throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());

        h = h + ((m + t) / 60);
        m = (m + t) % 60;

        bw.append(String.valueOf(h % 24)).append(" ").append(String.valueOf(m));
        bw.flush();
        bw.close();
    }
}
