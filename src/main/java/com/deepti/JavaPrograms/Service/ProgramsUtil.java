package com.deepti.JavaPrograms.Service;

import java.math.BigInteger;

public class ProgramsUtil {

    public static String fibonnaci(int num) {

        BigInteger num1 = BigInteger.valueOf(1);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger sum;
        int i = 1;
        StringBuilder str = new StringBuilder("1 1");

        while (i < num) {
            sum = num1.add(num2);
            str.append(" " + sum);
            num1 = num2;
            num2 = sum;
            i++;

        }
        return str.toString();
    }


    public static int fibonnacirecursive(int num){
         if(num==1 ||num==2)
             return 1;
             return fibonnacirecursive(num-1)+fibonnacirecursive(num-2);

    }


    public static String countCharsInWord(String line){
        StringBuilder str=new StringBuilder();
        int characterCount[] = new int[26];

        for(int i=0;i<line.length();i++){

            if(line.charAt(i)>=65&& line.charAt(i)<=90)
                characterCount[(line.charAt(i)-65)]++;
            else  if(line.charAt(i)>=97&& line.charAt(i)<=122)
                characterCount[line.charAt(i)-97]++;

        }

        for(int i=0;i<26;i++){
            if(characterCount[i]>0)
                str.append((char)(i+97)+"-->"+characterCount[i]+"\n");
        }
        return  str.toString();
    }
}
