package com.towery.bytestramInput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO-01\\a.txt");
        FileOutputStream fos = new FileOutputStream("IO-01\\b.txt");
        byte[] bytes = new byte[2];

        int b;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
}
