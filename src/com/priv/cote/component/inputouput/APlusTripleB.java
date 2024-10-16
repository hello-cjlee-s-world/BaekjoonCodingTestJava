package com.priv.cote.component.inputouput;

import java.io.*;
import java.util.StringTokenizer;

public class APlusTripleB {
    public void plusTriple() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken())));
        bw.close();
    }
}
