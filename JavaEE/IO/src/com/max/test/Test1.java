package com.max.test;

import java.io.*;
import java.util.Scanner;

/**
 * ClassName: Test1
 * Package: com.max.test
 * Description: 扫描指定目录，并找到名称或者内容中包含指定字符的所有普通文件（不包含目录）
 *
 * @Author MaxSun
 * @Create 2024/2/22 19:10
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查找的根目录：");
        File rootDir = new File(sc.next());

        if(!rootDir.isDirectory()) {
            // 没有该目录
            System.out.println("不存在此目录");
            return;
        }

        System.out.print("请输入要查找的关键词：");
        String word = sc.next();

        find(rootDir, word);
    }
    public static void find(File rootDir, String word) {
        File[] files = rootDir.listFiles();

        if(files == null) {
            // 目录中没有东西，返回
            return;
        }
        for (File file : files) {
            System.out.println("查找了" + file.getAbsolutePath());
            if(file.isFile()) {
                // 是一个普通文件
                String read = getRead(file);
                if(read.contains(word)) {
                    System.out.println(file.getAbsolutePath() + "找到关键字" + word);
                }
            } else if(file.isDirectory()) {
                // 是一个目录
                find(file, word);
            } else {
                continue;
            }
        }
    }
    public static String getRead(File file) {
        StringBuilder sb = new StringBuilder();

        try(Reader reader = new FileReader(file)) {
            while(true) {
                int read = reader.read();
                if(read == -1) {
                    break;
                }
                sb.append((char)read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }
}
