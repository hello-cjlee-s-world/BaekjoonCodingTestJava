package com.priv.cote.component.divisorMultipleDecimal;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class PrimeNumber implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String[] lst = br.readLine().split(" ");
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(lst[i]);

      if (num < 2) continue;

      boolean isPrime = true;
      for (int j = 2; j * j <= num; j++) {
        if (num % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) cnt++;
    }

    bw.write(String.valueOf(cnt));
    bw.flush();
    bw.close();
  }

}

