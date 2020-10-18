package com.multiplicationfibonacii;

import com.multiplicationfibonacii.FibonacciMultiplicationTableResult.ResultStatus;

public class ConsoleApp {	
	public static void main(String args[]) {
		if (args[0].equals("-n")) {
			FibonacciMultiplicator multiplicator = new FibonacciMultiplicator();
			Integer n = Integer.parseInt(args[1]);
			// TODO no arg validation
			print(n, multiplicator.getFibonacciMultiplicationTable(n));
		}
	}
	
	private static void print(Integer n, FibonacciMultiplicationTableResult result) {
		Integer rowCounter = 0;
		
		if (result.getResult() == ResultStatus.SUCCESS) {
			for (Long item : result.getTable()) {
				rowCounter++;
				if (null == item) {
					System.out.print("  ");
				} else {
					System.out.print(item + " ");
				}
				
				if (rowCounter == n + 1) {
					System.out.println();
					rowCounter = 0;
				}
			}
		} else {
			// TODO
		}
	}
}
