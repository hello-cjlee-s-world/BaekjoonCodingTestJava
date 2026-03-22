package com.priv.cote.component.bruteForce;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class ConstructorSum implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      String n = br.readLine();
      int nn = Integer.parseInt(n);
      int rst = 0;
      for(int i = 0; i < nn; i++){
        int tmp = 0;
        String ii = String.valueOf(i);
        for (int j = 0; j < ii.length(); j++){
          tmp += Integer.parseInt(String.valueOf(ii.charAt(j)));
        }
        if(i + tmp == nn) {
          rst = i;
          break;
        }
      }

      bw.write(String.valueOf(rst));

      bw.flush();
      bw.close();
    }
}
