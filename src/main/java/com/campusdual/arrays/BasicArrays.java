package com.campusdual.arrays;

public class BasicArrays {
    public static void main(String[] args) {
        int[] firstInArray = new int [3];
        firstInArray[0] = 15;
        firstInArray[1] = 17;
        firstInArray[2] = 19;

        String[] firstStringArray = {"A", "B", "C", "D"};

        System.out.println("First int array lenght: " + firstInArray.length);
        System.out.println("First String array lenght: " + firstStringArray.length);

        System.out.println("First int array position value: " + firstInArray[0]);
        System.out.println("First String array position value: " + firstStringArray[0]);

        System.out.println("Last int array position value: " + firstInArray[firstInArray.length - 1]);
        System.out.println("Last String array position value: " + firstStringArray[firstStringArray.length - 1]);

        System.out.println("Loop through first int array");
        for (int i = 0; i < firstInArray.length; i++) {
            System.out.print(firstInArray[i] + " ");
        }
        System.out.println();
        System.out.println("Loop through first String array");
        for (int i = 0; i < firstStringArray.length; i++) {
            System.out.print(firstStringArray[i] + " ");
        }

        System.out.println("\n");

        int maxi = 3;
        int maxj = 3;
        int value = 0;
        int [][] secondIntArray = new int[maxi][maxj];
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                value++;
                secondIntArray[i][j] = value;
            }
        }
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                System.out.print(secondIntArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        String[][] secondStringArray = {{"A", "B", "C", "D"},{"E", "F", "G", "H"},{"I", "J", "K", "L"}};

        for (int i = 0; i < secondStringArray.length; i++) {
            for (int j = 0; j < secondStringArray[i].length; j++) {
                System.out.print(secondStringArray[i][j] + " ");
            }
            System.out.println();

        }
    }
}
