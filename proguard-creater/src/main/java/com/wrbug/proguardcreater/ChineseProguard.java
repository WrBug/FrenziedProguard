package com.wrbug.proguardcreater;

import java.util.ArrayList;
import java.util.List;

//随机中文
public class ChineseProguard {
    private static int start = '\u4e00';
    private static int end = '\u9fa5';
    private static List<String> list = new ArrayList<>();

    public static void start() {
        for (int i = 0; i < 8000; i++) {
            int len = (int) (2 + Math.random() * 11);
            StringBuilder k = new StringBuilder();
            for (int i1 = 0; i1 < len; i1++) {
                k.append(getRadomChar());
            }
            String s = k.toString();
            if (list.contains(s)) {
                System.out.println("包含" + s);
                continue;
            }
            list.add(s);
            FileUtils.appendFile("proguard-chinese.txt", s);
        }
    }


    private static char getRadomChar() {
        return (char) (start + Math.random() * (end - start));
    }


}
