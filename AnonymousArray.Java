package com.array;

public class AnonymousArray {

	public static void main(String[] args) {
		// For instance usage no need to create array jus use it like this way ..new int[]{10,20,30}

		System.out.println(sum(new int [] {10,20,30,40}));
		
	}
	public static int sum(int[] x) {
		int total=0;
		for(int x1:x) {
			total=total+x1;
	}
		return total;
	}

}
