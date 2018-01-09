package com.testpackage;



public class Main {

    public static void main(String[] args) {
        OrderedSequence sequence=new OrderedSequence(25);
        sequence.readData();
        sequence.sortAscending();
        String[] newSequence=sequence.findAndAddNumber();
        sequence.print(newSequence);
    }
}
