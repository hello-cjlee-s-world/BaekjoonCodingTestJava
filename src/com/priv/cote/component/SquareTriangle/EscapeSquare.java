package com.priv.cote.component.SquareTriangle;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class EscapeSquare implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] s = br.readLine().split(" ");
      int x = Integer.parseInt(s[0]);
      int y = Integer.parseInt(s[1]);
      int w = Integer.parseInt(s[2]);
      int h = Integer.parseInt(s[3]);

      int close = Math.min(w - x, x);
      close = Math.min(h - y, close);
      close = Math.min(y, close);

      bw.write(String.valueOf(close));

      bw.flush();
      bw.close();
    }
}
