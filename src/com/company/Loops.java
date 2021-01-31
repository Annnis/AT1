package com.company;

public class Loops {
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
    //t5
    public static int method5(int num) {
        int result = 0;
        while (num>0) {
            result = result + num %10;
            num = num/10;
        }
        return result;
    }
    //6
    public static int[] method6(int[] array) {
        int middle;
        if(array.length % 2 == 0){
            middle=array.length/2;
        }else{
            middle=array.length/22+1;
        }
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i]=array[middle + i];
            array[middle+i]=temp;
        }
        return array;
    }

}

