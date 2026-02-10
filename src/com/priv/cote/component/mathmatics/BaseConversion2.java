package com.priv.cote.component.mathmatics;

import com.priv.cote.main.BasicInterface;

import java.io.*;

public class BaseConversion2 implements BasicInterface {
    @Override
    public void print() throws IOException {
      var s = new java.util.Scanner(System.in);
      System.out.print(Integer.toString(s.nextInt(), s.nextInt()).toUpperCase());
    }
}
