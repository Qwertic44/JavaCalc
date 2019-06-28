package com.company;

import java.util.TreeMap;

public class RomanConvert {

    public static int romanToDecimal(java.lang.String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        /* operation to be performed on upper cases even if user
           enters roman values in lower case chars */
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        return decimal;
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }


    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static String decimalToRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + decimalToRoman(number-l);
    }
        public static int letterToNumber(String letter)
        {

            switch (letter) {
                case "I":    return 1;
                case "II":   return 2;
                case "III":  return 3;
                case "IV":   return 4;
                case "V":    return 5;
                case "VI":   return 6;
                case "VII":  return 7;
                case "VIII": return 7;
                case "IX":   return 9;
                case "X":    return 10;
                default:     throw new NumberFormatException("Invalid format");
            }
        }


    public static String numberToletter(int letter)
    {

        switch (letter) {
            case 1:    return "I";
            case 2:   return "II";
            case 3:  return "III";
            case 4:   return "IV";
            case 5:    return "V";
            case 6:   return "VI";
            case 7:  return "VII";
            case 8: return "VIII";
            case 9:   return "IX";
            case 10:    return "X";
            default:     throw new NumberFormatException("Invalid format");
        }
    }


}
