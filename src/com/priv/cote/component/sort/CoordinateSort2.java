package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.IOException;
import java.util.Arrays;

public class CoordinateSort2 implements BasicInterface {
    @Override
    public void print() throws IOException {
      int n = read();
      StringBuilder sb = new StringBuilder();
      int[][] arr = new int[n][2];

      for (int i = 0; i < n; i++) {
        arr[i][0] = read();
        arr[i][1] = read();
      }

      Arrays.sort(arr, (x, y) -> {
        if (x[1] == y[1]) {
          return x[0] - y[0];
        } else {
          return x[1] - y[1];
        }
      });

      for (int i = 0; i < arr.length; i++) {
        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
      }
      System.out.print(sb);
    }

  private static int read() throws IOException {
    int n;
    int result = 0;
    int operation = 1;

    while (true) {
      n = System.in.read();
      if (n == '-') {
        operation = -1;
        continue;
      }

      if (n < '0' || n > '9') {
        return result * operation;
      }

      result *= 10;
      result += n - '0';
    }
  }
}
