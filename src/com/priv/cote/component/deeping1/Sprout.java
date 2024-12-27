package com.priv.cote.component.deeping1;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class Sprout implements BasicInterface {
    @Override
    public void print() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("         ,r'\"7\n" +
                "r`-_   ,'  ,/\n" +
                " \\. \". L_r'\n" +
                "   `~\\/\n" +
                "      |\n" +
                "      |");
        bw.flush();
    }
}
