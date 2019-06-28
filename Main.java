package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        String statement;
        int n1 = 0, n2 = 0;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        statement = reader.readLine();

        String[] subStr;

        String delimeter = " "; // Разделитель
        subStr = statement.split(delimeter);

        if(subStr.length < 2 && subStr.length > 2) {
           throw new NumberFormatException("Invalid format");
        }


        String op = subStr[1];

        if ( isDigit(subStr[0]) && isDigit(subStr[2])){
            n1 = Integer.parseInt(subStr[0]);
            n2 = Integer.parseInt(subStr[2]);
            Calculator c = new Calculator();
            c.calc(op, n1, n2);
        }
        else {
            String s1 = subStr[0];
            String s2 = subStr[2];
            Calculator c = new Calculator();
            c.calc(op, s1, s2);


        }




    }

    private static boolean isNumber(String str) {
        return str.matches("[-+]?[\\d]+([.][\\d]+)?");
    }

    private static boolean isDigit(String s){
            if(isNumber(s)) {
                return true;
            }
            else {
                return false;
            }




    }


/*
        System.out.println("please enter the two two integer values that you want"
                + " to vomplete the operation with ");
        Scanner sc = new Scanner(System.in);
        int first = scan.nextInt();
        int sec = scan.nextInt();
        System.out.println(" please enter the operation you want preformed");
        String opera = scan.next();
        System.out.println(" Here is the answer");
        int value = Acalc(opera, first, sec);
        String roman = Roman(value);
        System.out.println(" Here is the answer in roman numerals ");
        System.out.println(roman);

*/








    }

