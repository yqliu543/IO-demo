package com.towery.bufferInputStream;

import java.io.*;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 上午 10:29
 */
public class BufferInputStream3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO-01\\a.txt"));
        String s = br.readLine();
        System.out.println(s);

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
