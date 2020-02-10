package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    /**
     * 倒序打印给定数组,打印格式为: [3,2,1]
     */
    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
        int arrLength = array.length;
        int[] reverseArray = new int[arrLength];
        for (int index = 0; index < arrLength; index++) {
            reverseArray[index] = array[arrLength - index - 1];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
