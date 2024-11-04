package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class ChangeBall implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(s[0])+1];
        for(int i = 1; i < Integer.parseInt(s[0])+1; i++){
            arr[i] = i;
        }
        for(int i = 0; i < Integer.parseInt(s[1]); i++) {
            String[] t = br.readLine().split(" ");
            int tmp1 = arr[Integer.parseInt(t[0])];
            arr[Integer.parseInt(t[0])] = arr[Integer.parseInt(t[1])];
            arr[Integer.parseInt(t[1])] = tmp1;
        }
        for(int i = 1; i < arr.length; i++) {
            bw.append(String.valueOf(arr[i])).append(" ");
        }
        bw.flush();
        bw.close();
    }
}
