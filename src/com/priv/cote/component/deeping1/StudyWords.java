package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.*;

public class StudyWords implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine().toUpperCase(Locale.ROOT);
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Collections.max(map.values());
        int flag = 0;
        char result = '?';

        for (char c : map.keySet()) {
            if (map.get(c) == max) {
                flag++;
                result = c;
            }
            if (flag > 1) {
                result = '?';
                break;
            }
        }
        bw.write(result);
        bw.flush();
    }
}
