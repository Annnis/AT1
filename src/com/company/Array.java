package com.company;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4};
        System.out.println(reverse(arr));
            }
//1
    public static String minOfArr(int[] array) {
    int min=array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return ("Min value " +min);
    }
//2
    public static String maxOfArr(int[] array) {
        int max=array[0];
        for (int i = 1; i <array.length ; i++) {
            if(max<array[i]) {
                max = array[i];
            }
        }
        return ("Max value " +max);
    }
//3
public  static String minOfIndex(int[] array) {
    int min=array[0];
    int minIndex=0;
    for (int i = 1; i <array.length ; i++) {
             if(array[i]<min) {
            min = array[i];
                 minIndex= i;

        }
    }
    return ("Min index " +minIndex);
}
//4
    public static String maxOfIndex(int[] array) {
        int max=array[0];
        int maxInd=0;
        for (int i = 1; i <array.length ; i++) {
            if(max<array[i]) {
                max = array[i];
                maxInd = i;
            }
        }
        return ("Max index " +maxInd);
    }
    //5
    public static int sumOfOdd(int[] array) {
        int oddSum=0;
               for (int i = 0; i <array.length ; i++) {
                if(array[i] % 2 == 1) {
                    oddSum+=  array[i];
            }
        }
        return oddSum;
    }
    //6
    public static int[] reverse(int[] myArray) {
             for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        return myArray;
    }

    //7
    public static int sumOfEven(int[] array) {
        int evenSum = 0;
            for (int i = 0; i < array.length; i++) {
            if (array[i]  % 2 == 0) {
                evenSum += array[i];
            }
            }
        return evenSum;

    }
//8
    public static int[] halfReverse(int[] array){
           int midd = 0;
        if((array.length & 1) == 0) {
            midd = array.length / 2;
        }
        else {
            midd = array.length / 2 + 1;
        }
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[midd + i];
            array[midd + i] = temp;
        }
        return array;
    }


//9bubble
    public static int[] sortByBubble(int[] array) {
        {
            int[] mas = array;
            boolean isSorted = false;
            int temp;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;

                        temp = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = temp;
                    }
                }
            }
        }
        return array;
    }
//9insert
    public static int[] sortByInsert(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElem){
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = currElem;
                prevKey--;
            }
        }
        return arr;
    }
// 9select
    public static int[] sortBySelect(int[] arr) {
    	for (int start = 0; start < arr.length; start++) {
        int minIndex = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;
    }
		return arr;
}

}




