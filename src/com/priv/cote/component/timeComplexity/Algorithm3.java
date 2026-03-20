package com.priv.cote.component.timeComplexity;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Algorithm3 implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      long a = Integer.parseInt(br.readLine());

      bw.write(a*a+"\n" + "2");

      bw.flush();
      bw.close();
    }
}
