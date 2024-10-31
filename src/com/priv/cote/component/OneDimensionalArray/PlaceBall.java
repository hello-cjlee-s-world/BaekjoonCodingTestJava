package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class PlaceBall implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(s[0])];
        for(int i = 0; i < Integer.parseInt(s[1]); i++) {
            String[] t = br.readLine().split(" ");
            int x = Integer.parseInt(t[0])-1;
            int y = Integer.parseInt(t[1]);
            int z = Integer.parseInt(t[2]);
            for(int j = x; j < y; j++) {
                arr[j] = z;
            }
        }
        for(int a : arr){
            bw.append(String.valueOf(a)).append(" ");
        }
        bw.flush();
        bw.close();
    }
}
