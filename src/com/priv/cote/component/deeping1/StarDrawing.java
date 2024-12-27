package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class StarDrawing implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int flag = 0;
        for (int i = 0; i < 2*cnt-1; i++) {
            if(i < cnt){
                flag++;
            } else {
                flag--;
            }
            for(int j=0; j<cnt-flag; j++){
                bw.append(" ");
            }
            for(int j=0; j<flag*2-1; j++){
                bw.append("*");
            }
            bw.append("\n");
        }
        bw.flush();
    }
}
