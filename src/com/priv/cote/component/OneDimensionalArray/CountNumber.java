package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class CountNumber implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[201];
        for(String s : br.readLine().split(" ")) {
           arr[Integer.parseInt(s)+100]++;
        }
        bw.write(String.valueOf(arr[Integer.parseInt(br.readLine())+100]));
        bw.close();
    }


}
