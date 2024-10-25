package com.priv.cote.component.loop;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class NineNineDan implements BasicInterface {

    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {

            bw.append(String.valueOf(n)).append(" * ").append(String.valueOf(i)).append(" = ").append(String.valueOf(n * i)).append("\n");
        }
        bw.flush();
        bw.close();
    }
}
