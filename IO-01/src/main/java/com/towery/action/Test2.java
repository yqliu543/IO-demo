package com.towery.action;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年05月06日 下午 4:12
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("IO-01\\names.txt"));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            String[] arr = line.split("-");
            Student student = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            list.add(student);
        }
        bufferedReader.close();
        double weight=0;
        for (Student student : list) {
            weight=weight+ student.getWeight();
        }
        double[] arr = new double[list.size()];
        int index=0;
        for (Student student : list) {
            arr[index]=student.getWeight()/weight;
            index++;
        }
        for (int i = 1; i < arr.length; i++) {
                arr[i]=arr[i]+arr[i-1];
        }
        double number = Math.random();
        int index2 = -Arrays.binarySearch(arr, number)-1;
        Student student = list.get(index2);
        double weight1 = student.getWeight()/2;
        student.setWeight(weight1);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("IO-01\\names.txt"));
        for (Student student1 : list) {
            bufferedWriter.write(student1.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
