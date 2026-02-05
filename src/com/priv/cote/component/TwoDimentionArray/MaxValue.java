package com.priv.cote.component.TwoDimentionArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class MaxValue implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int max = 0;
      int x = 0;
      int y = 0;

      for(int i = 0; i < 9; i++) {
        String[] line = br.readLine().split(" ");
        for(int j = 0; j < 9; j++) {
          if(Integer.parseInt(line[j]) > max){
            max = Integer.parseInt(line[j]);
            x=i;y=j;
          }
        }
      }

      bw.write(String.valueOf(max));
      bw.write("\n");
      bw.write((x+1) + " " + (y+1));

      bw.flush();
      bw.close();
    }
}
