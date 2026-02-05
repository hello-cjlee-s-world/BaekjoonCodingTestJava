package com.priv.cote.component.TwoDimentionArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class MatrixAddition implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String[] lines = br.readLine().split(" ");
      int[][] oneD = new int[Integer.valueOf(lines[0])][Integer.valueOf(lines[1])];
      int[][] towD = new int[Integer.valueOf(lines[0])][Integer.valueOf(lines[1])];

      for(int i = 0; i < oneD.length*2; i++) {
        if(i<oneD.length) {
          String[] M = br.readLine().split(" ");
          for(int j = 0; j < M.length; j++) {
            oneD[i][j] = Integer.valueOf(M[j]);
          }
        }else {
          String[] M = br.readLine().split(" ");
          for(int j = 0; j < M.length; j++) {
            towD[i-oneD.length][j] = Integer.valueOf(M[j]);
          }
        }
      }

      for(int i = 0; i < oneD.length; i++) {
        for(int j = 0; j < oneD[i].length; j++) {
          bw.write(oneD[i][j]+towD[i][j] + " ");
        }
        bw.write("\n");
      }

      bw.flush();
      bw.close();
    }
}
