package com.priv.cote.component.bruteForce;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class SugarDelivery implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int input = Integer.parseInt(br.readLine());
      if (input == 4 || input == 7) bw.write(String.valueOf(-1));
      else bw.write(String.valueOf(((2 * input % 5) * 2 + input) / 5));

      bw.flush();
      bw.close();
    }
}
