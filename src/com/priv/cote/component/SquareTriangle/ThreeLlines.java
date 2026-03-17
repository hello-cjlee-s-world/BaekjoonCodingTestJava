package com.priv.cote.component.SquareTriangle;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class ThreeLlines implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] s = br.readLine().split(" ");
      int a = Integer.parseInt(s[0]);
      int b = Integer.parseInt(s[1]);
      int c = Integer.parseInt(s[2]);

      int max = Math.max(Math.max(a, b), c);
      if(max >= (a+b+c-max)){
        bw.write(String.valueOf((a+b+c-max) * 2 -1));
      } else {
        bw.write(String.valueOf(a+b+c));
      }

      bw.flush();
      bw.close();
    }
}
