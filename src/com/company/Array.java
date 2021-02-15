package com.company;

public class Array {

    public static void main(String[] args) {
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
        int middle = 0;
		if((array.length) == 0) {
                middle = array.length / 2;
                }
                else {
                middle = array.length / 2 + 1;
                }
                for(int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[middle + i];
        array[middle + i] = temp;
        }
        return array;
        }

//9bubble
    public void sortByBubble(int[] array) {
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
    }
//9insert
    public static void sortByInsert(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElem){
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = currElem;
                prevKey--;
            }
        }
    }
}




