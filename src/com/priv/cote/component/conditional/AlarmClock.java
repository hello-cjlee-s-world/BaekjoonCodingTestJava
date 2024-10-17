package com.priv.cote.component.conditional;

import java.io.*;
import java.util.StringTokenizer;

public class AlarmClock {
    public void print () throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if((m - 45) < 0) {
            if(h == 0) h = 23;
            else h--;
            m = 60 + (m-45);
        } else m -= 45;
        bw.append(String.valueOf(h)).append(" ").append(String.valueOf(m));
        bw.flush();
        bw.close();
    }
}
