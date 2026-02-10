package com.priv.cote.component.mathmatics;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class CenterMoveAlgorithm implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int line = Integer.parseInt(br.readLine());
    int dots = 2;

    for (int i = 0; i < line; i++) {
      dots += dots-1;
    }

    bw.write(String.valueOf(dots*dots));

    bw.flush();
    bw.close();
  }

}
