package com.PrimitiveDataTypes;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

		//int has a width of 32
		int myMinValue = -2_147_483_648;
		int myMaxValue = 2_147_483_647;

		//byte has a width of 8
		byte myByteValue = 10;
		byte myNewByteValue = (byte) (myByteValue / 2);

		//short has a width of 16
		short myShortvalue = 32767;
		short myNewShortValue = (short) (myShortvalue / 2);

		//long has a width of 64
		long myLongValue = 9_223_036_854_775_807L;


		//Pratice
		byte byteValue = 2;
		short shortValue = 55;
		int intValue = 1000;
		long longTotal = (50000L + (10L * (byteValue + intValue + shortValue)));
		System.out.println(longTotal);

	}
}