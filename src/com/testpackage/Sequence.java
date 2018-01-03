package com.testpackage;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Sequence {
    private String[] array;


    Sequence() {
    }

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите возрастающую последовательность:");
        String input = scanner.nextLine();
        this.array = input.split(" ");
    }

    public String[] findPalindromes() {
        String element;
        String[] result = new String[array.length];
        int index = 0;
        for (String item : array) {
            if (Integer.parseInt(item) < 10) {
                result[index] = item;
                index++;
            } else {
                element = item;
                if (isPalindrome(element)) {
                    result[index] = item;
                    index++;
                }
            }
        }
        result = removeNull(result, index);
        return result;
    }

    private String[] removeNull(String[] array, int index) {
        String[] newArray = new String[index];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void print(String[] array) {
        for (String item : array) {
            out.print(item + " ");
        }
    }

    private boolean isPalindrome(String string) {
        boolean result = false;
        String reverse;
        reverse = reverse(string);
        if (string.equals(reverse)) {
            result = true;
        }
        return result;
    }

    private String reverse(String string) {
        StringBuilder reverse = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }
        return reverse.toString();
    }

    public String[] sortOfParity() {
        String[] even = new String[array.length];
        String[] other = new String[array.length];
        int indexArray1 = 0;
        int indexArray2 = 0;
        for (String item : array) {
            if(item.equals("")){
                continue;
            }
            int sum = findSumNumbers(Integer.parseInt(item));
            if (sum % 2 == 0) {
                even[indexArray1] = item;
                indexArray1++;
            } else {
                other[indexArray2] = item;
                indexArray2++;
            }
        }
        String[] result = concat(even,indexArray1, other,indexArray2);
        return result;
    }

    private int findSumNumbers(int item) {
        int number;
        int result=0;
        while (item != 0) {
            number= item % 10;
            item-=number;
            result+=number;
            if(item!=0){
                item=item/10;
            }
        }
        return result;
    }

    private String[] concat(String[] even,int indexEven, String[] other,int indexOther) {
        String[] result = new String[array.length];
        int indexResult = 0;
        for (int i=0;i<indexEven;i++) {
            if (even[i].equals("null")) {
                continue;
            }
            result[indexResult] = even[i];
            indexResult++;
        }
        for (int i=0;i<indexOther;i++) {
            if (other[i].equals("null")) {
                continue;
            }
            result[indexResult] = other[i];
            indexResult++;
        }
        return result;

    }
}
