package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.*;

public class CroatiaWords implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        String[] croatiaWords = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int rst = 0;
        for(String s : croatiaWords) {
            int length = s.length();
            while(true){
                int flag = word.indexOf(s);
                if(flag == -1){
                    break;
                } else {
                    rst++;
                    word = word.substring(0, flag) + word.substring(flag + length);
                    System.out.println(word);
                }
            }
        }
        System.out.println(rst);
        System.out.println(word.length());
        bw.write(String.valueOf(word.length() + rst));
        bw.flush();
    }
}
