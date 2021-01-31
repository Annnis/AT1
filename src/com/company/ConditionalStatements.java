package com.company;

class ConditionalStatement {
    public static void main(String[] args) {
    }

    //1
    public static int method1(int num1, int num2) {
        if (num1 % 2 == 0) {
            return num1 * num2;
        } else {
            return num1 + num2;
        }
    }

    //2
    private static String method2(int dot1, int dot2) {

        if (dot2 > 0 && dot1 < 0) {
            return "II";
        } else if (dot2 > 0 && dot1 > 0) {
            return "I";
        } else if (dot2 < 0 && dot1 < 0) {
            return "III";
        } else if (dot2 < 0 && dot1 > 0) {
            return "IV";
        } else if (dot1 > 0 && dot2 == 0) {
            return "between I & IV";
        } else if (dot1 < 0 && dot2 == 0) {
            return "between II & III";
        } else if (dot1 == 0 && dot2 > 0) {
            return "between I & II";
        } else if (dot1 == 0 && dot2 < 0) {
            return "between III && IV";
        } else if (dot1 == 0 && dot2 == 0) {
            return "START";
        }
        return null;
    }

    //3
    public static int method3( int numb1, int numb2, int numb3){
        if (numb1 > 0 && numb2 > 0 && numb3 > 0) {
            return numb1 + numb2 + numb3;
        } else if (numb1 > 0 && numb2 > 0 && numb3 < 0) {
            return numb1 + numb2;
        } else if (numb1 > 0 && numb2 < 0 && numb3 > 0) {
            return (numb1 + numb3);
        } else if (numb1 < 0 && numb2 > 0 && numb3 > 0) {
            return (numb2 + numb3);
        }
        return 0;
    }

    ////4
    private static int method4 ( int i1, int i2, int i3){
        int result;
        int sum = i1 + i2 + i3;
        int multiply = i1 * i2 * i3;
        if (sum > multiply) {
            result = sum + 3;
        } else {
            result = multiply + 3;
        }
        return result;
    }
    //5
    private static Object method5 ( int mark){
        if (mark == 0 && mark <= 19) {
            return "Your mark is F";
        } else if (mark >= 20 && mark <= 39) {
            return "Your mark is E";
        } else if (mark >= 40 && mark <= 59) {
            return "Your mark is F";
        } else if (mark >= 60 && mark <= 74) {
            return "Your mark is C";
        } else if (mark >= 75 && mark <= 89) {
            return "Your mark is B";
        } else if (mark >= 90 && mark <= 100) {
            return "Your mark is A";
        }
        return null;
    }
}


