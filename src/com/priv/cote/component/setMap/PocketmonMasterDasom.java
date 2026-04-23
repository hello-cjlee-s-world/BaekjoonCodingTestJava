package com.priv.cote.component.setMap;

import com.priv.cote.main.BasicInterface;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PocketmonMasterDasom implements BasicInterface {
  @Override
  public void print() throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    Map<Integer, String> mapByNumber = new HashMap<>();
    Map<String, Integer> mapByName = new HashMap<>();

    for (int i = 1; i <= n; i++) {
      String pocketmon = sc.next();
      mapByNumber.put(i, pocketmon);
      mapByName.put(pocketmon, i);
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < m; i++) {
      String s = sc.next();

      if (Character.isDigit(s.charAt(0))) {
        sb.append(mapByNumber.get(Integer.parseInt(s))).append('\n');
      } else {
        sb.append(mapByName.get(s)).append('\n');
      }
    }

    System.out.print(sb);
  }
}