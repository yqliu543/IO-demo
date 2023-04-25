package com.towery.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 上午 9:25
 */
public class Test01 {
    public static void main(String[] args) {
        File src = new File("D:\\aaa\\src");
        File dest = new File("D:\\aaa\\dest");
        try {
            copydir(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()){
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes=new byte[1024];
                int len;
                while ((len=fileInputStream.read(bytes))!=-1){
                    fileOutputStream.write(bytes,0,len);
                }
                fileOutputStream.close();
                fileInputStream.close();
            }else {
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
