package com.priv.cote.component.mathmatics;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class BeeHouse implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int house = Integer.parseInt(br.readLine());
    int point = 1;
    int cnt = 0;

    while (true) {
      if(house <= 1+(cnt*6)) {
        break;
      }
      else {
        cnt = cnt + point;
        point++;
      }
    }

    bw.write(String.valueOf(point));

    bw.flush();
    bw.close();
  }

}

