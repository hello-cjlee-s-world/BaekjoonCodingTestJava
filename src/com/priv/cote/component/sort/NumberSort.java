package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class NumberSort implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      Integer[] arr = new Integer[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(br.readLine());
      }
      for (int i = n-1; i > 0; i--) {
        for(int j = 0; j < i; j++) {
          int tmp = arr[j];
          if(arr[j] > arr[j+1]) {
            tmp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tmp;
          }
        }
      }

      for (Integer integer : arr) {
        bw.write(integer + "\n");
      }

      bw.flush();
      bw.close();
    }
}
