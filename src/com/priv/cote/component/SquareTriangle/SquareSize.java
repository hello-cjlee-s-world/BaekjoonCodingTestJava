package com.priv.cote.component.SquareTriangle;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class SquareSize implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());

      bw.write(String.valueOf(a*b));

      bw.flush();
      bw.close();
    }
}
