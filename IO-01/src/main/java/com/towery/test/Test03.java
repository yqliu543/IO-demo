package com.towery.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 上午 9:41
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("IO-01\\c.txt");
        StringBuffer stringBuffer = new StringBuffer();
        int ch;
        while ((ch=fileReader.read())!=-1){
            stringBuffer.append((char) ch);
        }
        fileReader.close();
        String s = stringBuffer.toString();
        String[] arrStr = s.split("-");
        //ArrayList<Integer> list = new ArrayList<>();
        //for (String s1 : arrStr) {
        //    int i = Integer.parseInt(s1);
        //    list.add(i);
        //}
        //Collections.sort(list);
        Integer[] list = Arrays.stream(arrStr).map(Integer::parseInt).sorted().toArray(Integer[]::new);

        FileWriter fileWriter = new FileWriter("IO-01\\c.txt");
        //for (int i = 0; i < list.size(); i++) {
        //    if (i==list.size()-1){
        //        fileWriter.write(list.get(i)+"");
        //    }else {
        //        fileWriter.write(list.get(i)+"-");
        //    }
        //}
        String s1 = Arrays.toString(list).replace(",","-");
        String result = s1.substring(1, s1.length() - 1);
        fileWriter.write(result);
        fileWriter.close();
    }
}
