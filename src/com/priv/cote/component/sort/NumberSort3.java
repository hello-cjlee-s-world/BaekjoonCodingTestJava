package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class NumberSort3 implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[10000];
      for(int i = 0; i < n; i++){
        int num = Integer.parseInt(br.readLine()) - 1;
        arr[num] = arr[num] + 1;
      }

      for(int i = 0; i < arr.length; i++){
        if(arr[i] > 0){
          for(int j = 0; j < arr[i]; j++){
            bw.write(i+1 + "\n");
          }
        }
      }

      bw.flush();
      bw.close();
    }
}
