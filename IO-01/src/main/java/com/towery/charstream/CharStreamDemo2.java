package com.towery.charstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月23日 上午 10:19
 */
public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("IO-01\\a.txt");
        char[] chars=new char[2];
        int len;
        while ((len=reader.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        reader.close();
    }
}
