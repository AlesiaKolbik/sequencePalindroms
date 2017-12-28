package com.testpackage;



public class Main {

    public static void main(String[] args) {
        Sequence numbers=new Sequence();
        numbers.readData();
        String [] palindromes=numbers.findPalindromes();
        numbers.print(palindromes);
    }
}
