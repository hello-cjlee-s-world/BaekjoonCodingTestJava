package com.priv.cote.component.bruteForce;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class MathIsNoneFace implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] s = br.readLine().split(" ");
      int a = Integer.parseInt(s[0]);
      int b = Integer.parseInt(s[1]);
      int c = Integer.parseInt(s[2]);
      int d = Integer.parseInt(s[3]);
      int e = Integer.parseInt(s[4]);
      int f = Integer.parseInt(s[5]);

      int x = (c * e - b * f) / (a * e - b * d);
      int y = (c * d - a * f) / (b * d - a * e);

      bw.write(x + " " + y);
      bw.flush();
      bw.close();
    }
}
