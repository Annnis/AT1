package com.company;

class ConditionalStatement {
//5
    public static String markByRate(int mark) {
        String score = null;
        if (mark< 0 || mark>100){
            throw new IllegalArgumentException("Your mark should be more than 0 and less than 100") ;
        }else if (mark >= 0 && mark <= 19) {
            score= "Your mark is F";
        } else if (mark >= 20 && mark <= 39) {
            score="Your mark is E";
        } else if (mark >= 40 && mark <= 59) {
            score="Your mark is D";
        } else if (mark >= 60 && mark <= 74) {
            score="Your mark is C";
        } else if (mark >= 75 && mark <= 89) {
            score="Your mark is B";
        } else if (mark >= 90 && mark <= 100) {
            score="Your mark is A";
        }
        return score;
    }

    //1
    public static int sumOrMultyply(int num1, int num2) {
        if (num1 % 2 == 0) {
            return num1 * num2;
        } else {
            return num1 + num2;
        }
    }

    //2
    public static String findDot(int dot1, int dot2) {

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
    public static int sumOfPositive(int numb1, int numb2, int numb3){
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

    //4
    public static int countSumOrMultypyly( int a, int b, int c){
        int result;
        int sum = a+ b+ c;
        int multiply = a * b * c;
        if (sum > multiply) {
            result = sum + 3;
        } else {
            result = multiply + 3;
        }
        return result;
    }

}



