package com.thoughtworks;

public class ArrayPractice2 {

    /**
     * 把给定数组中的最大值保存到数组中的第1个元素且原第一个数换到最大值的位置
     */
    public static int[] exchange() {
        int[] array = new int[]{10, 8, 1, 7, 0, 20, 16, 19};
        int maxNumIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > array[maxNumIndex]) {
                maxNumIndex = index;
            }
        }
        int temp;
        temp = array[0];
        array[0] = array[maxNumIndex];
        array[maxNumIndex] = temp;
        return array;
    }
}
