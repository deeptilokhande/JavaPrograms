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
}
