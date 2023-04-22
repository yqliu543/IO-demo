package com.towery.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("IO-01\\a.txt");
//        fos.write(97);
//        fos.write(98);
        byte[] bytes={97,98,99,100};
         /*fos.write(bytes);*/
        fos.write(bytes,1,2);
        fos.close();
    }
}
