package com.priv.cote.component.setMap;

import com.priv.cote.main.BasicInterface;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSet implements BasicInterface {
  @Override
  public void print() throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    Set<String> set = new HashSet<String>();
    int rst = 0;
    for(int i = 0; i < n; i++) {
      set.add(sc.next());
    }
    for(int i = 0; i < m; i++) {
      if(set.contains(sc.next())) rst++;
    }

    System.out.println(sb.append(rst));
  }
}
