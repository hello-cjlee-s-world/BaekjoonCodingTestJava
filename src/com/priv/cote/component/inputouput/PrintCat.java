package com.priv.cote.component.inputouput;

import java.io.*;

public class PrintCat {
    public void printCat() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("\\    /\\").append('\n').append(" )  ( ')").append('\n').append("(  /  )").append('\n').append(" \\(__)|");
        System.out.println(sb);
    }
}
