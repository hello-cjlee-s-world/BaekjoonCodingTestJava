package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.Arrays;

public class GroupWordChecker implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String[] words = new String[length];
        int rst = 0;

        for (int i = 0; i < length; i++) {
            words[i] = br.readLine();
        }

        for(String word : words) {
            boolean[] tmp = new boolean[26];
            char prev = 0;
            boolean f = true;
            for(int i = 0; i < word.length(); i++) {
               char curr = word.charAt(i);
               if(tmp[curr - 'a']) {
                   if(prev != curr) {
                       f = false;
                   }
               } else {
                   tmp[curr - 'a'] = true;
               }
               prev = curr;
            }

            if(f) rst++;
        }

        bw.write(String.valueOf(rst));
        bw.flush();

    }
}
