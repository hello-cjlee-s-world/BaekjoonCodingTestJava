package com.priv.cote.component.sort;

import com.priv.cote.main.BasicInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordsSort implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        String previous = "";
        for (int i = 0; i < n; i++) {
            if (!words[i].equals(previous)) {
                sb.append(words[i]).append('\n');
                previous = words[i];
            }
        }

        System.out.print(sb);
    }
}
