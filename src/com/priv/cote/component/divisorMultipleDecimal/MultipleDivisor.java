package com.priv.cote.component.divisorMultipleDecimal;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class MultipleDivisor implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while(true) {
      String[] line = br.readLine().split(" ");
      int a = Integer.parseInt(line[0]);
      int b = Integer.parseInt(line[1]);
      if(a==0 && b==0) break;
      if(a > b) {
        if(a % b == 0) bw.write("multiple\n");
        else bw.write("neither\n");
      } else {
        if(b % a == 0) bw.write("factor\n");
        else bw.write("neither\n");
      }
    }

    bw.flush();
    bw.close();
  }

}

