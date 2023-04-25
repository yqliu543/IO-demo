package com.towery.objectstream;

import java.io.*;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 下午 3:37
 */
public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("IO-01\\obj.txt"));
        Student o = (Student) inputStream.readObject();
        System.out.println(o);
        inputStream.close();
    }
}
