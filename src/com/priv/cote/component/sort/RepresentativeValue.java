package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class RepresentativeValue implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      Integer[] lst = new Integer[5];
      int avg = 0;

      for(int i = 0; i < 5; i++) {
        lst[i] = Integer.parseInt(br.readLine());
        avg += lst[i];
      }

      for(int i = 0; i < lst.length-1; i++){
        int min = 0;
        for(int j = i+1; j < lst.length; j++){
          if(lst[j] < lst[i]){
            min = lst[j];
            lst[j] = lst[i];
            lst[i] = min;
          }
        }
      }

      bw.write(String.valueOf(avg/5)+"\n");
      bw.write(lst[2] + "\n");

      bw.flush();
      bw.close();
    }
}
