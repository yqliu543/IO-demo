package com.towery.bytestramInput;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("IO-01\\a.txt");
        int b;
        while ((b=inputStream.read())!=-1){
            System.out.print((char) b);
        }
        inputStream.close();
    }
}
