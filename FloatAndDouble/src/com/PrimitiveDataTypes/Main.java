package com.PrimitiveDataTypes;

public class Main {

    public static void main(String[] args) {

        //width of int = 32 (4 bytes)
        int myIntValue = 5;

        //(float) is casting(forcing the value to be a float
        //can also be done as 5.4f
        //width of float = 32 (4 bytes)
        float myFloatValue = (float) 5.4;

        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double pounds = 200d;
        double kilograms = pounds * 0.45359237;

        System.out.println(kilograms);
    }
}
