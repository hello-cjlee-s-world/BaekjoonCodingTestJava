package com.priv.cote.component.SquareTriangle;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class TheLand implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int a = 10000;
      int b = 10000;
      int c = -10000;
      int d = -10000;

      int num = Integer.parseInt(br.readLine());

      for(int i = 0; i < num; i++){
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        if(a > x) a = x;
        if(b > y) b = y;
        if(c < x) c = x;
        if(d < y) d = y;
      }
      bw.write(String.valueOf((a-c) * (b-d)));

      bw.flush();
      bw.close();
    }
}
