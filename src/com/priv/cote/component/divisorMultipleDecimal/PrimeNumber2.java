package com.priv.cote.component.divisorMultipleDecimal;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class PrimeNumber2 implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int m = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());
    int total = 0;
    int min = n;
    for(int i = m; i <= n; i ++) {
      if(i < 2) continue;
      boolean isPrime = true;
      for(int j = 2; j*j <= i; j++) {
        if(i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        total += i;
        if(i < min) min = i;
      }
    }

    if(total == 0) bw.write("-1");
    else {
      bw.write(String.valueOf(total));
      bw.write(String.valueOf("\n"));
      bw.write(String.valueOf(min));
    }

    bw.flush();
    bw.close();
  }

}

