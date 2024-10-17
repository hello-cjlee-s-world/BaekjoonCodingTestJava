package com.priv.cote.component.conditional;

import java.io.*;

public class Quadrant {
    public void print () throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if(x > 0 && y > 0)  bw.append("1");
        else if(x < 0 && y > 0) bw.append("2");
        else if(x < 0 && y < 0) bw.append("3");
        else bw.append("4");
//        System.out.print(x>0?y>0?1:4:y>0?2:3);
        bw.flush();
        bw.close();
    }
}
