package ru.geekbrains.hw6;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrAfter4(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7})));

    }
    public static int[] arrAfter4(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 4){
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("массив не содержит четверок");
    }
    public static boolean arrOnly1and4(int[] arr){
        boolean num1 = false;
        boolean num4 = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1 && arr[i] != 4){
                return false;
            }
            if(arr[i] == 1){
                num1 = true;
            }
            if(arr[i] == 4){
                num4 = true;
            }
        }
        return num1 && num4;
    }
}
