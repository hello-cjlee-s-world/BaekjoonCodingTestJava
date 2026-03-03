package com.priv.cote.component.SquareTriangle;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class MathIsPhysical implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      int rst = n*4;
      bw.write(String.valueOf(rst));
      bw.flush();
      bw.close();
    }
}
