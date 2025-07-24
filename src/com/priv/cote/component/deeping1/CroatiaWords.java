package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class CroatiaWords implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        String[] croatian = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for (String ch : croatian) {
            if (word.contains(ch)) {
                word = word.replace(ch, "*");  // * 하나로 치환 = 한 글자
            }
        }
        bw.write(String.valueOf(word.length()));
        bw.flush();
    }
}
