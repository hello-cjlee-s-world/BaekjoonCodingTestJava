package com.priv.cote.component.divisorMultipleDecimal;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class PrimeFactorization implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    int cnt = 2;
    while(true){
        if(num == 1) break;
        if(num % cnt == 0) {
            bw.write(cnt + "\n");
            num /= cnt;
            cnt = 2;
            if(num == 1) break;
        } else {
            cnt++;
        }
    }

    bw.flush();
    bw.close();
  }

}

