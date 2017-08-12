package com.srivastava.models;

import java.io.PrintStream;

public class Test1 {

	public static void main(String[] arr) throws Exception{
		int sum = 0;
		System.setOut(new PrintStream("/Users/amit/Documents/FileOutput/message.txt"));
		for(String a : arr){
		sum+=Integer.parseInt(a);
		}
		/*for(int i = 0 ; i<arr.length; i++){
		sum+=Integer.parseInt(arr[i]);
		}*/
		System.out.println("Sum is "+sum);

	}

}
