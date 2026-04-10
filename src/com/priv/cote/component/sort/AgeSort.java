package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AgeSort implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      String[][] lst = new String[n][3];
      for(int i = 0; i < n; i++) {
        String s = br.readLine();
        lst[i][0] = s.split(" ")[0];
        lst[i][1] = s.split(" ")[1];
        lst[i][2] = String.valueOf(i);
      }

      Arrays.sort(lst, (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

      for(int i = 0; i < n; i++) {
        sb.append(lst[i][0]).append(" ").append(lst[i][1]).append("\n");
      }
        System.out.print(sb);
    }
}
