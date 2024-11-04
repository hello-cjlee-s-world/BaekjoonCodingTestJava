package com.priv.cote.component.OneDimensionalArray;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.StringTokenizer;

public class TestAvgFake implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double max = 0.0;
        double[] score = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < score.length; i++) {
            double scoreNum = Double.parseDouble(st.nextToken());
            if(max < scoreNum) max = scoreNum;
            score[i] = scoreNum;
        }
        double rst = 0;
        for(double s : score) {
            rst += (s/max*100);
        }
        bw.append(String.valueOf(rst/score.length));
        bw.flush();
        bw.close();
    }
}
