package com.towery.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("IO-01\\a.txt");
        fos.write(97);
        fos.close();
    }
}
