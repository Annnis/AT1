package com.company;

public class Loops {
    public static void main(String[] args) {
        System.out.println(mirrored(987));
    }
    //1
    public static String SumOfEven() {
        int sum = 0;
        int counter = 0;
        String result;
        for (int i = 2; i < 99; i += 2) {
            sum += i;
            counter++;
        }
        result = sum+" "+counter;

        return result;
    }
    //2
    public static String isPrime(int num) {
        int var;
        boolean isTrue = true;
        for (int i = 2; i <= num / 2; i++) {
            var = num % i;
            if (var == 0) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {return num + " простое число";

        } else {
            return num + " составное число";
        }
    }
//t3
        public static int sqrtBinary(int x) {
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
//4
    public static int factorial(int number){
        if(number < 0|| number>20) {
            throw new IllegalArgumentException("Number must be between 0 & 20!");
        }
        int result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        return result;
    }
//t5
    public static int sumOfnum(int num) {
        int result = 0;
        while (num>0) {
            result = result + num %10;
            num = num/10;
        }
        return result;
    }
//6
public static String mirrored(int number) {
    String mirroredNumber = "";
    if(number < 0) {
        mirroredNumber = "-";
        number *= -1;
    }
    while(number != 0) {
        mirroredNumber += number % 10;
        number /= 10;
    }
    return mirroredNumber;
}
}

