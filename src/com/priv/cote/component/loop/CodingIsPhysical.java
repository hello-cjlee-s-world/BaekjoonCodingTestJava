package com.priv.cote.component.loop;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class CodingIsPhysical implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()) / 4;
        for (int i = 0; i < n; i++) {
            bw.append("long ");
        }
        bw.append("int");
        bw.flush();
        bw.close();
    }
}
