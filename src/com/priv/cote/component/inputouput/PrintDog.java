package com.priv.cote.component.inputouput;

import com.priv.cote.main.BasicInterface;

import java.io.IOException;

public class PrintDog implements BasicInterface {
    public void print() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("|\\_/|").append('\n')
            .append("|q p|   /}").append('\n')
            .append("( 0 )\"\"\"\\").append('\n')
            .append("|\"^\"`    |").append('\n')
            .append("||_/=\\\\__|");
        System.out.println(sb);
    }
}
