package com.towery.charstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月23日 上午 10:19
 */
public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("IO-01\\a.txt");
        int ch;
        while ((ch=reader.read())!=-1){
            System.out.print((char)ch);
        }
        reader.close();
    }
}
