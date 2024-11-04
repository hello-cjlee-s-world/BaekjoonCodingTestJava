package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Homework implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[31];
        for(int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine())] = 1;
        }
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == 0) {
                bw.append(String.valueOf(i)).append("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
