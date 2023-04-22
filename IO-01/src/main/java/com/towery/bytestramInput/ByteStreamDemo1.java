package com.towery.bytestramInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("IO-01\\a.txt");
        int b1 = inputStream.read();
        System.out.println(b1);
        inputStream.close();
    }
}
