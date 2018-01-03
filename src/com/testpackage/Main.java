package com.testpackage;



public class Main {

    public static void main(String[] args) {
        Sequence numbers=new Sequence();
        numbers.readData();
        String[] even=numbers.sortOfParity();  //задача отсортировать последовательность сначала четные, поом все остальные.
        numbers.print(even);
    }
}
