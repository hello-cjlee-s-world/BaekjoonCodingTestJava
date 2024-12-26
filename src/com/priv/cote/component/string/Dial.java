package com.priv.cote.component.string;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dial implements BasicInterface {

    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            char value = word.charAt(i);
            if(value < 68) result += 3;
            else if(value < 71) result += 4;
            else if(value < 74) result += 5;
            else if(value < 77) result += 6;
            else if(value < 80) result += 7;
            else if(value < 84) result += 8;
            else if(value < 87) result += 9;
            else result += 10;
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
