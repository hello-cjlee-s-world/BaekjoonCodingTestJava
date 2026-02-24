package com.priv.cote.component.mathmatics;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Snail implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] s = br.readLine().split(" ");
    int a = Integer.parseInt(s[0]);
    int b = Integer.parseInt(s[1]);
    int v = Integer.parseInt(s[2]);

    if((v-a) % (a-b) == 0) bw.write(String.valueOf((v-a) / (a-b) +1));
    else bw.write(String.valueOf((v-a) / (a-b) +2));

    bw.flush();
    bw.close();
  }

}

