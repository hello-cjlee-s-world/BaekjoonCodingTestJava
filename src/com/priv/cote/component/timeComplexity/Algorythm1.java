package com.priv.cote.component.timeComplexity;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Algorythm1 implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int a = Integer.parseInt(br.readLine());
      bw.write(String.valueOf(1)+"\n");
      bw.write(String.valueOf(0)+"\n");

      bw.flush();
      bw.close();
    }
}
