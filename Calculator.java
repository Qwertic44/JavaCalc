package com.company;

public class Calculator {

    public int calc(String op, int n1, int n2){
        int result = 0;


        if( (n1 < 1) || (n1 > 10)) {
            throw new NumberFormatException("Invalid format");
        }

        if( (n2 < 1) || (n2 > 10)) {
            throw new NumberFormatException("Invalid format");
        }

        if (op.equals("+")) {result=n1+n2;}

        if (op.equals("-")) {result=n1-n2;}

        if (op.equals("*")) {result=n1*n2;}

        if (op.equals("/")) {result=n1/n2;}

        System.out.println(result);

        return result;
    }


    public int calc(String op, String s1, String s2){
        int result = 0;

        int n1 = RomanConvert.romanToDecimal(s1);
        int n2 = RomanConvert.romanToDecimal(s2);

        //Write the calulator

        if (op.equals("+")) {result=n1+n2;}

        if (op.equals("-")) {result=n1-n2;}

        if (op.equals("*")) {result=n1*n2;}

        if (op.equals("/")) {result=n1/n2;}

        System.out.println(RomanConvert.decimalToRoman(result));

        return result;
    }
}
