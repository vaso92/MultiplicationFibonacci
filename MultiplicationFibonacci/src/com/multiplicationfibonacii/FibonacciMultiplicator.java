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
		ArrayList<Long> table = new ArrayList<Long>();
		table.add(null);
		
		for (Long i : fibonacciN) {
			table.add(i);
		}
		
		for (Long row: fibonacciN) {
			table.add(row);
			for (Long col: fibonacciN) {
				table.add(col * row);
			}
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
