package com.priv.cote.component.bruteForce;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class ChessColoring implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


      String[] input = br.readLine().split(" ");
      int m = Integer.parseInt(input[0]); // 세로
      int n = Integer.parseInt(input[1]); // 가로
      
      int rst = 64;
      input = new String[m];
      for(int i = 0; i< m; i++) {
        input[i] = br.readLine();
      }

      for(int i = 0; i< m-7; i++) {
        for(int j = 0; j< n-7; j++) {
          int tmp1 = 0;
          int tmp2 = 0;
          for(int k = i; k < i+8; k++) {
            for(int l = j; l < j+8; l++) {
              if((k+l)%2 == 0) {
                if(input[k].charAt(l) == 'W') tmp1++;
                else tmp2++;
              } else {
                if(input[k].charAt(l) == 'B') tmp1++;
                else tmp2++;
              }
            }
          }
        rst = Math.min(Math.min(tmp1, tmp2), rst);
        }
      }
      bw.write(String.valueOf(rst));
      bw.flush();
      bw.close();
    }
}
