package com.priv.cote.component.mathmatics;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Laundry implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int line = Integer.parseInt(br.readLine());
    for (int i = 0; i < line; i++) {
      int money = Integer.parseInt(br.readLine());
      bw.write(String.valueOf(money / 25) + " ");
      money %= 25;
      bw.write(String.valueOf(money / 10) + " ");
      money %= 10;
      bw.write(String.valueOf(money / 5) + " ");
      money %= 5;
      bw.write(String.valueOf(money) + "\n");
    }

    bw.flush();
    bw.close();
  }

}
