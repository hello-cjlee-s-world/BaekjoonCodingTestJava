package com.priv.cote.component.mathmatics;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class BaseConversion implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] input = br.readLine().split(" ");
      int total = 0;
      String word = input[0];
      int baseNum = Integer.parseInt(input[1]);


      for(int i = 0; i < word.length(); i++){
        String curString = word.substring(word.length()-i-1, word.length()-i);
        int curNum;
        if(curString.matches("-?\\d+")){
          curNum = Integer.parseInt(curString);
          for(int j = 0; j < i; j++){
            curNum *= baseNum;
          }
        } else {
          curNum = curString.charAt(0) - 55;
          for(int j = 0; j < i; j++){
            curNum *= baseNum;
          }
        }
        total += curNum;
      }

      bw.write(String.valueOf(total));

      bw.flush();
      bw.close();
    }
}
