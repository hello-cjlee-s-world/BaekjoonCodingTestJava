package com.priv.cote.component.SquareTriangle;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class ForthDot implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] d1 = br.readLine().split(" ");
      String[] d2 = br.readLine().split(" ");
      String[] d3 = br.readLine().split(" ");

      int x = 0;
      int y = 0;

      if(d1[0].equals(d2[0])) {
        x = Integer.parseInt(d3[0]);
      } else if (d1[0].equals(d3[0])) {
        x = Integer.parseInt(d2[0]);
      } else {
        x = Integer.parseInt(d1[0]);
      };

      if(d1[1].equals(d2[1])) {
        y = Integer.parseInt(d3[1]);
      } else if (d1[1].equals(d3[1])) {
        y  = Integer.parseInt(d2[1]);
      } else {
        y = Integer.parseInt(d1[1]);
      };

      bw.write(String.valueOf(x) + " " + y);

      bw.flush();
      bw.close();
    }
}
