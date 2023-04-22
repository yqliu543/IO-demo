package com.towery.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("IO-01\\a.txt");
        String s="aweihaoshui";
        byte[] arr = s.getBytes();
        fos.write(arr);
        fos.close();
    }
}
