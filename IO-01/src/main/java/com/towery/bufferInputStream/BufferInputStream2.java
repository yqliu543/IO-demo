package com.towery.bufferInputStream;

import java.io.*;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 上午 10:29
 */
public class BufferInputStream2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO-01\\a.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("IO-01\\a-copy.txt"));
        int len;
        byte[] c=new byte[1024];
        while ((len=bis.read(c))!=-1){
            bos.write(c,0,len);
        }
        bos.close();
        bis.close();
    }
}
