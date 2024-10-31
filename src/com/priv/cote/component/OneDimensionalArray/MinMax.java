package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class MinMax implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int min = 1000000;
        int max = -1000000;
        for(String s : br.readLine().split(" ")) {
            int v = Integer.parseInt(s);
            if(v > max) {max = v;}
            if(v < min) {min = v;}
        }
        bw.append(String.valueOf(min)).append(" ").append(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
