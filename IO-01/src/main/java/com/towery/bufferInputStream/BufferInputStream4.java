package com.towery.bufferInputStream;

import java.io.*;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 上午 10:29
 */
public class BufferInputStream4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("IO-01\\d.txt"));
        br.write(97);
        br.write("今天是个好日子！");
        br.close();
    }
}
