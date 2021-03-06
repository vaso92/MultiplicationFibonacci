package com.multiplicationfibonacii;

import java.util.ArrayList;

public class FibonacciMultiplicationTableResult {
	public enum ResultStatus {
		SUCCESS,
		INVALID_INPUT,
		INPUT_TOO_LARGE
	}
	
	public FibonacciMultiplicationTableResult(Integer n, ArrayList<ArrayList<Long>> table, ResultStatus result) {
		this.n = n;
		this.table = table;
		this.result = result;
	}
	
	public Integer getN() {
		return n;
	}
	
	public ArrayList<ArrayList<Long>> getTable() {
		return table;
	}
	
	public ResultStatus getResult() {
		return result;
	}

	private Integer n;
	private ArrayList<ArrayList<Long>> table;
	private ResultStatus result;
}
