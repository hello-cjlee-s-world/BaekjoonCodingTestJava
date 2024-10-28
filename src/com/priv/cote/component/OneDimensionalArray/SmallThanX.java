package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class SmallThanX implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine().split(" ")[1]);
        for(String s : br.readLine().split(" ")) {
            if(Integer.parseInt(s) < x) bw.append(s).append(" ");
        }
        bw.flush();
        bw.close();
    }
}
