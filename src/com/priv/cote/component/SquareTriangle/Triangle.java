package com.priv.cote.component.SquareTriangle;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Triangle implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      int c = Integer.parseInt(br.readLine());
      if(a+b+c == 180){
        if(a == 60 && b == 60 && c == 60) bw.write("Equilateral");
        else if (a == b && b != 60 || a == c && c != 60 || b == c && c != 60) bw.write("Isosceles");
        else if (a != b && a != c && b != c) bw.write("Scalene");
      } else {
        bw.write("Error");
      }

      bw.flush();
      bw.close();
    }
}
