package com.priv.cote.component.divisorMultipleDecimal;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DivisorSum implements BasicInterface {
  @Override
  public void print() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while(true){
      String rst = br.readLine();
      int a = Integer.parseInt(rst);
      List<Integer> lst = new ArrayList<>();
      int total = 0;

      if(a == -1) break;
      for(int i = 1; i <= (a/2); i++) {
        if(a % i == 0) lst.add(i);
      }
      rst = rst + " = ";
      for(int j = 0; j < lst.size(); j++){
        total += lst.get(j);
        if(j == lst.size()-1) rst = rst + lst.get(j);
        else rst = rst + lst.get(j) + " + ";
      }

      if(total != a) rst = a + " is NOT perfect.";

      bw.write(rst);
      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }

}

