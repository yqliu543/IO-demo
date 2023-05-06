package com.towery.action;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年05月06日 下午 2:28
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        String familyNameNet="https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet="http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet="http://www.haoming8.cn/baobao/7641.html";
        String familyNameNetStr = webCrawler(familyNameNet);
        String boyNameNetStr = webCrawler(boyNameNet);
        String girlNameNetStr = webCrawler(girlNameNet);
        ArrayList<String> familyNameTempList=getData(familyNameNetStr,"(.{4})(，|。)",1);
        ArrayList<String> boyNameTempList=getData(boyNameNetStr,"([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTempList=getData(girlNameNetStr,"(.. ){4}..",0);
        ArrayList<String> familyNameList=new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c+"");
            }
        }
        ArrayList<String> boyNameList=new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)){
                boyNameList.add(str);
            }
        }
        ArrayList<String> girlNameList=new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] s = str.split(" ");
            for (String s1 : s) {
                girlNameList.add(s1);
            }
        }
        ArrayList<String> list=getInfo(familyNameList,boyNameList,girlNameList,50,10);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("IO-01\\names.txt"));
        for (String s : list) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }

    private static ArrayList<String> getInfo(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        HashSet<String> boysh = new HashSet<>();
        while (true){
            if (boysh.size()==boyCount){
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boysh.add(familyNameList.get(0)+boyNameList.get(0));

        }
        HashSet<String> girlsh = new HashSet<>();
        while (true){
            if (girlsh.size()==girlCount){
                break;
            }
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlsh.add(familyNameList.get(0)+girlNameList.get(0));
        }
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();

        for (String s : boysh) {
            int age = random.nextInt(10)+18;
            list.add(s+"-男-"+age);
        }
        for (String s : girlsh) {
            int age = random.nextInt(8)+18;
            list.add(s+"-女-"+age);
        }
        return list;
    }

    private static ArrayList<String> getData(String str, String regex,int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            String group = matcher.group(index);
            list.add(group);
        }
        return list;
    }

    public static String webCrawler(String web) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        URL url = new URL(web);
        URLConnection urlConnection = url.openConnection();
        InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
        int ch;
        while ((ch= isr.read())!=-1){
            stringBuilder.append((char)ch);
        }
        isr.close();
        return stringBuilder.toString();
    }
}
