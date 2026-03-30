package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class CutLine implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] s = br.readLine().split(" ");
      Integer cutLine = Integer.parseInt(s[1]);

      int n = Integer.parseInt(s[0]);
      Integer[] lst = new Integer[n];

      s = br.readLine().split(" ");

      for (int i = 0; i < s.length; i++) {
        lst[i] = Integer.parseInt(s[i]);
      }

      for(int i = n-1; i > 0; i--){
        for(int j = 0; j < i; j++){
          int tmp = 0;
          if(lst[j] < lst[j+1]){
            tmp =lst[j];
            lst[j] = lst[j+1];
            lst[j+1] = tmp;
          }
        }
      }

      bw.write(String.valueOf(lst[cutLine-1]));

      bw.flush();
      bw.close();
    }
}
