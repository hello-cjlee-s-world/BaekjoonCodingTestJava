package com.priv.cote.component.loop;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class Receipt implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            tmp += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        if(tmp == total) bw.write("Yes");
        else bw.write("No");
        bw.close();
    }
}
