package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class SortInside implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String s = br.readLine();
      int[] arr = new int[s.length()];
      for (int i = 0; i < s.length(); i++) {
        arr[i] = s.charAt(i) - '0';
      }

      for(int i = 0; i < arr.length-1; i++){
        int maxIndex = i;
        for(int j = i+1; j < arr.length; j++){
          if(arr[maxIndex] < arr[j]){
            maxIndex = j;
          }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[i];
        arr[i] = temp;
      }

      for(int i = 0; i < arr.length; i++){
        bw.write(arr[i]+"");
      }

      bw.flush();
      bw.close();
    }
}
