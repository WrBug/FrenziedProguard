package com.wrbug.proguardcreater;

public class Main {

    public static void main(String[] args) {
        ChineseProguard.start();
        new SpecificCharacterProguard("proguard-o0O.txt", '0', 'o', 'O', '8', '〇').start();
        new SpecificCharacterProguard("proguard-1il.txt", '1', 'i', 'l', 'L', 'I', '丨').start();
        new SpecificCharacterProguard("proguard-socialism.txt", "富强民主文明和谐自由平等公正法治爱国敬业诚信友善".toCharArray()).start();
    }
}
