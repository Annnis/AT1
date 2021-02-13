package com.company;

public class Loops {
    public static void main(String[] args) {

    }
    ///1
    public static int method1() {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i < 99; i += 2) {
            sum += i;
            counter++;
        } if(sum==2401){
            System.out.println(counter);
        }
        return sum;
    }
    //2
    public static String method2(int num) {
        int var;
        boolean isTrue = true;
        for (int i = 2; i <= num / 2; i++) {
            var = num % i;
            if (var == 0) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            return num + " простое число";
        } else {
            return num + " составное число";
        }
    }
//t3
        public static int method3(int x) {
            int result = x;
            boolean finished = false;
            if (x != 0 && x != 1) {
                int start = 1, end = x / 2;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (mid == x / mid) {
                        result = mid;
                        finished = true;
                        break;
                    }
                    if (mid < x / mid) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                if (!finished) {
                    result = start - 1;
                }
            }

            return result;
        }
    public static int method4(int number){
        int result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        return result;
    }

    //t5
    public static int method5(int num) {
        int result = 0;
        while (num>0) {
            result = result + num %10;
            num = num/10;
        }
        return result;
    }
}

