package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int size ;
    int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập một kích thước: ");
            size=scanner.nextInt();
            if (size>20)
                System.out.println("Kích thước không quá 20");
        }while (size>20);
        array=new int[size];
        int i = 0;
        while (i<array.length){
            System.out.print("Nhập phần tử " + (i+1) + " : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách tài sản: ");
        for (int j = 0;j < array.length;j++){
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max){
                max = array[j];
                index = j ;
            }
        }
        System.out.println("Giá trị tài sản lớn nhất trong danh sách là " + max + ",ở vị trí " + index);
    }
}
