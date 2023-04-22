package com.towery.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("IO-01\\a.txt",true);
        String s="aweihaoshui";
        byte[] arr = s.getBytes();
        fos.write(arr);
        String warp="\r\n";
        byte[] bytes1 = warp.getBytes();
        fos.write(bytes1);
        String str="666!";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
