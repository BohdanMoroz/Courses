package com.courses.homework;

import java.util.Arrays;

public class Main {

    public static void swap(int[] array, int fst, int snd) {
        int tmp = array[fst];
        array[fst] = array[snd];
        array[snd] = tmp;
    }


    public static void swap2(int[] array, int fst, int snd) {
        if (array[fst] > array[snd]) {
            int tmp = array[fst];
            array[fst] = array[snd];
            array[snd] = tmp;
        }
    }


    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            swap(array, k, k + 1);
        }
    System.out.println(Arrays.toString(array));


//        int[] arr = {0, 1, 2, 3, 4};

//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr.length -i; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        ------------------------------------------------------------------

//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr.length -i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        ------------------------------------------------------------------

//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr.length -i; j++){
//                System.out.print(j+i + " ");
//            }
//            System.out.println();
//        }

    }
}
