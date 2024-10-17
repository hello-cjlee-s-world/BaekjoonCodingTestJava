package com.priv.cote.component.conditional;

import java.io.*;

public class LeafYear {
    public void print () throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int year = Integer.parseInt(br.readLine());
        if(year % 4 == 0) {
            if(year % 100 != 0 || year % 400 == 0) {
                bw.append("1");
            } else bw.append("0");
        }
        else bw.append("0");
        bw.flush();
        bw.close();
    }
}
