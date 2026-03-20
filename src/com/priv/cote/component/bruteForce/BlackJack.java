package com.priv.cote.component.bruteForce;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class BlackJack implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String[] s = br.readLine().split(" ");
      int n = Integer.parseInt(s[0]);
      int max = Integer.parseInt(s[1]);
      int rst = 0;
      s = br.readLine().split(" ");

      for(int i = 0; i < n-2; i++){
        for(int j = i+1; j < n-1; j++){
          for(int k = j+1; k < n; k++){
            int tmp = Integer.parseInt(s[i]) + Integer.parseInt(s[j]) + Integer.parseInt(s[k]);
            if(tmp <= max && tmp > rst) {
              rst = tmp;
            };
          }
        }
      }
      bw.write(String.valueOf(rst));

      bw.flush();
      bw.close();
    }
}
