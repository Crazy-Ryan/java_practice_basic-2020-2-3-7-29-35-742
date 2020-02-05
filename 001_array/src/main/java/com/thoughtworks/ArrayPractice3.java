package com.thoughtworks;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
    public static int[] filterZero(int[] array) {
        int nonZeroArrayLength = array.length;
        for(int num:array){
            if(0 == num){
                nonZeroArrayLength--;
            }
        }
        int[] nonZeroArray = new int[nonZeroArrayLength];
        int nonZeroArrayIndex = 0;
        for(int num:array){
            if(0 != num){
                nonZeroArray[nonZeroArrayIndex] = num;
                nonZeroArrayIndex++;
            }
        }

        return nonZeroArray;
    }
}
