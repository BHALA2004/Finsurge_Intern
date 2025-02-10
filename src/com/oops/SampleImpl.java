package com.oops;

public class SampleImpl {
    public static void main(String[] args) {
        SampleDefn sampleDefn = new SampleDefn();
        boolean result = sampleDefn.oddOrEven(10);
        System.out.println(result);
        sampleDefn.print(100);
    }
}
