package com.wrbug.proguardcreater;

import java.util.ArrayList;
import java.util.List;


public class SpecificCharacterProguard {

    private char[] chars;
    private String fileName;
    private int len;

    private List<String> list = new ArrayList<>();


    /**
     * @param fileName 文件名
     * @param chars    混淆字符
     */
    public SpecificCharacterProguard(String fileName, char... chars) {
        this.chars = chars;
        this.fileName = fileName;
        len = Math.max(8, (int) (Math.log(8000) / Math.log(chars.length) * 1.5));
        System.out.println("最大长度：" + len);
    }

    public void start() {
        for (int i = 0; i < 8000; i++) {
            int len = (int) (2 + Math.random() * this.len);
            StringBuilder k = new StringBuilder();
            for (int i1 = 0; i1 < len; i1++) {
                k.append(getRadomChar(i1 == 0));
            }
            String s = k.toString();
            if (list.contains(s)) {
                i--;
                continue;
            }
            list.add(s);
            FileUtils.appendFile(fileName, s);
        }
    }

    private char getRadomChar(boolean firstChar) {
        char aChar = chars[(int) (Math.random() * chars.length)];
        if (firstChar && (aChar >= '0' && aChar <= '9')) {
            return getRadomChar(firstChar);
        }
        return aChar;
    }
}
