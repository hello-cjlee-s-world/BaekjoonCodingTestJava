package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class WhereIsMax implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int num = 0;
        for(int i = 0; i < 9; i++) {
            int value = Integer.parseInt(br.readLine());
            if(value > max) {
                max = value;
                num = i;
            }
        }
        bw.append(String.valueOf(max)).append("\n").append(String.valueOf(num+1));
        bw.flush();
        bw.close();
    }
}
