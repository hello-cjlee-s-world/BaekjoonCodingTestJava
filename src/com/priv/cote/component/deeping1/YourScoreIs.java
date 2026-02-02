package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class YourScoreIs implements BasicInterface {
    @Override
    public void print() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      float avg;
      float total = 0.0f;
      float score = 0.0f;

      String line;
      for(int i = 0; i < 20; i ++) {
        line = br.readLine();
        String[] words = line.split(" ");
        if(words[2].equals("P")) continue;

        total += Float.parseFloat(words[1]) * getScoreFromAlphabet(words[2]);
        score += Float.parseFloat(words[1]);
      }

      avg = total/score;

      bw.write(String.valueOf(avg));
      bw.flush();
    }

  private float getScoreFromAlphabet(String Alphabet) {
    float rst;
    switch(Alphabet){
      case "A+":
        rst = 4.5f;
        break;
      case "A0":
        rst = 4.0f;
        break;
      case "B+":
        rst = 3.5f;
        break;
      case "B0":
        rst = 3.0f;
        break;
      case "C+":
        rst = 2.5f;
        break;
      case "C0":
        rst = 2f;
        break;
      case "D+":
        rst = 1.5f;
        break;
      case "D0":
        rst = 1f;
        break;
      default:
        rst = 0.0f;
    }
    return rst;
  }
}
