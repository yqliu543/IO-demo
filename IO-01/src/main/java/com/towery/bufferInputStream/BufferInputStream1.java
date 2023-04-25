package com.towery.bufferInputStream;

import java.io.*;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 上午 10:29
 */
public class BufferInputStream1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO-01\\a.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("IO-01\\a-copy.txt"));
        int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
