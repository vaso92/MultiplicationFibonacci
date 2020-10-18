package com.multiplicationfibonacii;

import java.util.ArrayList;

import com.multiplicationfibonacii.FibonacciMultiplicationTableResult.ResultStatus;

public class FibonacciMultiplicator {
	public FibonacciMultiplicationTableResult getFibonacciMultiplicationTable(Integer n) {
		if (n <= 0) {
			return new FibonacciMultiplicationTableResult(n, null, ResultStatus.INVALID_INPUT);
		}
		
		if (n > 20) {
			return new FibonacciMultiplicationTableResult(n, null, ResultStatus.INPUT_TOO_LARGE);
		}
		
		final ArrayList<Long> fibonacciN = FibonacciMultiplicator.getFibonacci(n);
		ArrayList<ArrayList<Long>> table = new ArrayList<ArrayList<Long>>();
		ArrayList<Long> tableRow = new ArrayList<Long>();
		tableRow.add(null);
		
		for (Long i : fibonacciN) {
			tableRow.add(i);
		}
		table.add(tableRow);
		
		for (Long x: fibonacciN) {
			tableRow = new ArrayList<Long>();
			tableRow.add(x);
			for (Long y: fibonacciN) {
				tableRow.add(y * x);
			}
			table.add(tableRow);
		}
		
		return new FibonacciMultiplicationTableResult(n, table, ResultStatus.SUCCESS);
	}
	
	private static ArrayList<Long> getFibonacci(Integer n) {
        int a = 0;
        int b = 1;
        ArrayList<Long> result = new ArrayList<Long>();

        for (int i = 0; i < n; ++i) {
        	result.add(new Long(a));
            int temp = a;
            a = b;
            b = temp + b;
        }        
        return result;
	}
}
