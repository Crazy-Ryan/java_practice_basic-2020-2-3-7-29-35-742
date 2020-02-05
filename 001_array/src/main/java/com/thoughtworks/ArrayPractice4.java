package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int[] newArray = new int [array.length + 1];
        int oldIndex = 0;
        int newIndex = 0;
        if(number < array[0]){
            newArray[0] = number;
            newIndex++;
        }

        while(newIndex < newArray.length){
            if((newIndex == oldIndex) && (oldIndex == array.length)){
                newArray[newIndex] = number;
            }
            else if((newIndex == oldIndex) && (oldIndex != 0) && (array[oldIndex-1] <= number) && (array[oldIndex] > number)){
                newArray[newIndex] = number;
            }
            else {
                newArray[newIndex] = array[oldIndex];
                oldIndex++;
            }
            newIndex++;
        }

        return newArray;
    }
}
