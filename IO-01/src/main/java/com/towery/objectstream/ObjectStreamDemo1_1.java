package com.towery.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 下午 3:37
 */
public class ObjectStreamDemo1_1 {
    public static void main(String[] args) throws IOException {
        Student z = new Student("张三", 23);
        Student ls = new Student("李四", 27);
        Student ww = new Student("王五", 24);
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("IO-01\\obj.txt"));
        outputStream.writeObject(z);
        outputStream.writeObject(ls);
        outputStream.writeObject(ww);
        outputStream.close();
    }
}
