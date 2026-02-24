package com.priv.cote.component.divisorMultipleDecimal;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Divisor implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] s = br.readLine().split(" ");
    int a = Integer.parseInt(s[0]);
    int b = Integer.parseInt(s[1]);
    List<Integer> rstList = new ArrayList<>();

    for(int i = 1; i <= a; i++){
      if(a % i == 0) {
        rstList.add(i);
      }
    }

    String rst = rstList.size() >= b ? String.valueOf(rstList.get(b-1)) : "0";

    bw.write(rst);

    bw.flush();
    bw.close();
  }

}

