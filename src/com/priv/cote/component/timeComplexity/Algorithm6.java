package com.priv.cote.component.timeComplexity;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Algorithm6 implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      long a = Integer.parseInt(br.readLine());

      bw.write(a*(a-1)*(a-2)/3/2+"\n" + "3");

      bw.flush();
      bw.close();
    }
}
