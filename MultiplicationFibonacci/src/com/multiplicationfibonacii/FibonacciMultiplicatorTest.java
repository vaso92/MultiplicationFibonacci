package com.multiplicationfibonacii;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.multiplicationfibonacii.FibonacciMultiplicationTableResult.ResultStatus;

class FibonacciMultiplicatorTest {
	
	private FibonacciMultiplicator multiplicator = new FibonacciMultiplicator();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNegativesReturnInvalidInput() {
		FibonacciMultiplicationTableResult result = multiplicator.getFibonacciMultiplicationTable(-2);
		
		assertEquals(null, result.getTable());
		assertEquals(ResultStatus.INVALID_INPUT, result.getResult());
	}

	@Test
	void testSuccessfulMultiplicationFibonacciTable4() {
		FibonacciMultiplicationTableResult result = multiplicator.getFibonacciMultiplicationTable(4);
				
		final ArrayList<Long> expected = new ArrayList<Long>() {
			{ 
            	add(null); add(0L); add(1L); add(1L); add(2L);
            	add(0L); add(0L); add(0L); add(0L); add(0L);
            	add(1L); add(0L); add(1L); add(1L); add(2L);
            	add(1L); add(0L); add(1L); add(1L); add(2L);
            	add(2L); add(0L); add(2L); add(2L); add(4L);
            } 
		};
		
		assertEquals(expected, result.getTable());
		assertEquals(ResultStatus.SUCCESS, result.getResult());
	}

	@Test
	void testSuccessfulMultiplicationFibonacciTable5() {
		FibonacciMultiplicationTableResult result = multiplicator.getFibonacciMultiplicationTable(5);
		
		final ArrayList<Long> expected = new ArrayList<Long>() {
			{ 
            	add(null); add(0L); add(1L); add(1L); add(2L); add(3L);
            	add(0L); add(0L); add(0L); add(0L); add(0L); add(0L);
            	add(1L); add(0L); add(1L); add(1L); add(2L); add(3L);
            	add(1L); add(0L); add(1L); add(1L); add(2L); add(3L);
            	add(2L); add(0L); add(2L); add(2L); add(4L); add(6L);
            	add(3L); add(0L); add(3L); add(3L); add(6L); add(9L);
            } 
		};
		
		assertEquals(expected, result.getTable());
		assertEquals(ResultStatus.SUCCESS, result.getResult());
	}
}
