package com.priv.cote.component.setMap;

import com.priv.cote.main.BasicInterface;

import java.io.IOException;
import java.util.*;

public class InCompanyPeople implements BasicInterface {
  @Override
  public void print() throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Set<String> set = new HashSet<String>();

    for(int i = 0; i < n; i++) {
      String name = sc.next();
      if(sc.next().equals("enter")) set.add(name);
      else set.remove(name);
    }

    Set<String> sorted = new TreeSet<>(Collections.reverseOrder());
    sorted.addAll(set);

    StringBuilder sb = new StringBuilder();
    for(String name : sorted) {
      sb.append(name).append("\n");
    }
    System.out.println(sb);
  }
}
