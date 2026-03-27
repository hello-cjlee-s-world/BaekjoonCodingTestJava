package com.priv.cote.component.bruteForce;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class MovieDirector implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int input = Integer.parseInt(br.readLine());
      int tmp = 0;
      while (input != 0) {
        tmp++;
        if(String.valueOf(tmp).contains("666")) {
          input--;
        }
      }
      bw.write(String.valueOf(tmp));
      bw.flush();
      bw.close();
    }
}
