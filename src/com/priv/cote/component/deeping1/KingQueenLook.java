package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KingQueenLook implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] orgList = {1,1,2,2,2,8};
        String[] readList = br.readLine().split(" ");
        String[] resultList = new String[readList.length];
        int result = 0;
        for(int i = 0; i < readList.length; i++){
            resultList[i] = String.valueOf(orgList[i] - Integer.parseInt(readList[i]));
        }
        for(String st : resultList){
            bw.append(st).append(" ");
        }
        bw.flush();
    }
}
