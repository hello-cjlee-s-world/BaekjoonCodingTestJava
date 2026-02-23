package com.priv.cote.component.mathmatics;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Fraction implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    int total = 0;
    int point = 1;
    while(true) {
      if(num > total && num <= total + point) {
        total+=point;
        break;
      } else {
        total+=point;
      }
      point++;
    }

    int son;
    int parent;

    if (point % 2 == 0) {
      son = point - (total - num);
      parent = point - (point - (total - num + 1));
    } else {
      son = point - (point - (total - num + 1));
      parent = point - (total - num);
    }

    bw.write(String.valueOf(son));
    bw.write("/");
    bw.write(String.valueOf(parent));

    bw.flush();
    bw.close();
  }

}

