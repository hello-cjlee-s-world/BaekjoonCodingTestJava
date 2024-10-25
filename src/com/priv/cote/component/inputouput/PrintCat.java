package com.priv.cote.component.inputouput;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class PrintCat implements BasicInterface {
    public void print() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("\\    /\\").append('\n').append(" )  ( ')").append('\n').append("(  /  )").append('\n').append(" \\(__)|");
        System.out.println(sb);
    }
}
