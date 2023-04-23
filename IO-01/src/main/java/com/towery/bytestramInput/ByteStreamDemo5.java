package com.towery.bytestramInput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\454.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\天气预报.mp4");
        int len;
        byte[] bytes = new byte[1024*1024*5];

        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start+" ms");
    }
}
