package com.towery.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 下午 3:37
 */
public class ObjectStreamDemo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("IO-01\\obj.txt"));
        Student o = (Student) inputStream.readObject();
        Student o2 = (Student) inputStream.readObject();
        Student o3 = (Student) inputStream.readObject();
        System.out.println(o);
        System.out.println(o2);
        System.out.println(o3);
        inputStream.close();
    }
}
