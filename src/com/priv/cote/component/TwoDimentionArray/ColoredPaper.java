package com.priv.cote.component.TwoDimentionArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class ColoredPaper implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int[][] wholePaper = new int[100][100];
      int max = 0;
      int qty = Integer.parseInt(br.readLine());
      for (int i = 0; i < qty; i++) {
        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
        for (int j = 0; j < 10; j++) {
          for (int k = 0; k < 10; k++) {
            wholePaper[x+j][y+k] = 1;
          }
        }
      }

      for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 100; j++) {
          if (wholePaper[i][j] == 1) {max++;}
        }
      }
      bw.write(String.valueOf(max));

      bw.flush();
      bw.close();
    }
}
