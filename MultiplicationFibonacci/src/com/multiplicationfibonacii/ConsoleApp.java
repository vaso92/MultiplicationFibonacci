package com.multiplicationfibonacii;

import java.util.ArrayList;

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
		if (result.getResult() == ResultStatus.SUCCESS) {
			for (ArrayList<Long> row : result.getTable()) {
				for (Long item : row) {
					if (null == item) {
						System.out.print("  ");
					} else {
						System.out.print(item + " ");
					}
				}
				System.out.println();
			}
		} else {
			// TODO
		}
	}
}
