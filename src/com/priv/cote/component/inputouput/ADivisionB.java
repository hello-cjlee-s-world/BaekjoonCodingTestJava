package com.priv.cote.component.inputouput;

import java.io.*;
import java.util.StringTokenizer;

public class ADivisionB {
    public void division() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken())));
        bw.flush();
        bw.close();
    }
}
