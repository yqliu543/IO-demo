package com.towery.action;

import java.io.*;
import java.util.Scanner;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年05月06日 下午 4:37
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO-01\\userinfo.txt"));
        String line = br.readLine();
        br.close();
        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");
        String[] arr3 = userInfo[2].split("=");
        String rightusername=arr1[1];
        String rightpassword=arr2[1];
        int count=Integer.parseInt(arr3[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        if (rightpassword.equals(password)&&rightusername.equals(username)&&count<3){
            System.out.println("登录成功");
            writeInfo("username="+rightusername+"&password="+password+"&count=0");
        }else {
            count++;
            if (count<3){
                System.out.println("登录失败，还剩下"+(3-count)+"次机会");
            }else {
                System.out.println("用户账号被锁定");
            }
            writeInfo("username="+rightusername+"&password="+rightusername+"&count="+count);
        }

    }

    private static void writeInfo(String s) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("IO-01\\userinfo.txt"));
        bufferedWriter.write(s);
        bufferedWriter.close();
    }
}
