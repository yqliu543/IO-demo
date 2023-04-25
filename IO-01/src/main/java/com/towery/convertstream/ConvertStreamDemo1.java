package com.towery.convertstream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 下午 3:11
 */
public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IO-01\\gbk2.txt"), "gbk");
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.print((char) ch);
        }
        isr.close();


    }
}
