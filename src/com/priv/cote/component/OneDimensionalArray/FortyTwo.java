package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class FortyTwo implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[42];
        for(int i = 0; i < 10; i++) {
            int a = (Integer.parseInt(br.readLine()) % 42);
            arr[a] = arr[a]+1;
        }
        int rst = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                rst++;
            }
        }
        if(rst == 0) rst++;
        bw.append(String.valueOf(rst));
        bw.flush();
        bw.close();
    }
}
