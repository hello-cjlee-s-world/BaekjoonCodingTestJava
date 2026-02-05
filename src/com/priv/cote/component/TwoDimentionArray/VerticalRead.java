package com.priv.cote.component.TwoDimentionArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class VerticalRead implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int max = 0;
      String[] strings = new String[5];
      for(int i = 0; i < 5; i++) {
        strings[i] = br.readLine();
        if (max < strings[i].length()) {max = strings[i].length();}
      }
      for(int j = 0; j < max; j++) {
        for(int i = 0; i < 5; i++) {
          if(strings[i].length() <= j) continue;
          bw.write(strings[i].charAt(j));
        }
      }

      bw.flush();
      bw.close();
    }
}
