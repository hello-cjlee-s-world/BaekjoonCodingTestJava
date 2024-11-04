package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.Arrays;

public class ReverseBasket implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(s[0])+1];
        for(int i=1;i < arr.length; i++){arr[i]=i;}
        for(int i = 0; i < Integer.parseInt(s[1]); i++) {
            String[] t = br.readLine().split(" ");
            int a = Integer.parseInt(t[0]);
            int b = Integer.parseInt(t[1]);
            int[] temp = new int[arr.length];
            for(int j = 0; j < b-a+1; j++) {
                temp[b-j] = arr[j+a];
            }
            for(int j = 0; j < b-a+1; j++) {
                arr[j+a] = temp[j+a];
            }
        }
        for(int i = 1; i < arr.length; i++) {
            bw.append(String.valueOf(arr[i])).append(" ");
        }
        bw.flush();
        bw.close();
    }
}
