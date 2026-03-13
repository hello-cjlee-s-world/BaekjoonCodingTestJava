package com.priv.cote.component.SquareTriangle;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class TriangleAndLine implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      while(true) {
        String s = br.readLine();
        if(s.equals("0 0 0")) break;
        String[] ss = s.split(" ");
        int a = Integer.parseInt(ss[0]);
        int b = Integer.parseInt(ss[1]);
        int c = Integer.parseInt(ss[2]);
        int max = Math.max(Math.max(a, b), c);
        if((a+b+c-max) <= max) bw.write("Invalid\n");
        else if(a==b && b==c) bw.write("Equilateral\n");
        else if(a==b || b==c || c==a) bw.write("Isosceles\n");
        else bw.write("Scalene\n");
      }
      bw.flush();
      bw.close();
    }
}
