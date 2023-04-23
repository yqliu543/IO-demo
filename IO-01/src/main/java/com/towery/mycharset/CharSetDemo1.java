package com.towery.mycharset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月23日 上午 10:07
 */
public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="机房ID";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = s.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));
        String gbk = new String(gbks, "GBK");
        System.out.println(gbk);
    }
}
