package com.testpackage;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Sequence {
    private String [] array ;


    Sequence() {
    }

    public void fillArray() {
        Scanner scanner=new Scanner(System.in);
        out.println("Введите возрастающую последовательность:");
        String input=scanner.nextLine();
        this.array=input.split(" ");
    }

    public String[] findPalindromes() {
        String element;
        String []result=new String[array.length];
        int index=0;
        for (String item : array) {
            if (Integer.parseInt(item) < 10) {
                result[index]=item;
                index++;
            } else {
                element = item;
                if (isPalindrome(element)) {
                    result[index]=item;
                    index++;
                }
            }
        }
        result=removeNull(result,index);
        return result;
    }

    private String [] removeNull(String[] array, int index) {
        String [] newArray= new String[index];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=array[i];
        }
        return newArray;
    }

    public void print(String []array){
        for(String item:array) {
            out.print(item+" ");
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
       StringBuilder reverse= new StringBuilder();
       for(int i=string.length()-1;i>=0;i--){
           reverse.append(string.charAt(i));
       }
        return reverse.toString();
    }
}
