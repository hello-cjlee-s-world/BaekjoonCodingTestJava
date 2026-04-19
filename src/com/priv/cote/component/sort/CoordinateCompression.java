package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoordinateCompression implements BasicInterface {
  @Override
  public void print() throws IOException {
    int n = read();
    int[] original = new int[n];
    int[] sorted = new int[n];

    for (int i = 0; i < n; i++) {
      original[i] = read();
      sorted[i] = original[i];
    }

    Arrays.sort(sorted);

    Map<Integer, Integer> compressed = new HashMap<>();
    int rank = 0;
    for (int value : sorted) {
      if (!compressed.containsKey(value)) {
        compressed.put(value, rank++);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int value : original) {
      sb.append(compressed.get(value)).append(' ');
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
