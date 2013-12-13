package com.example.calculator.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.calculator.MainActivity;

import android.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MathValidator extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private TextView result;
	private MainActivity mainActivity;

	public MathValidator() {
		super(MainActivity.class);

	};

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		mainActivity = getActivity();
		// result = (TextView) mainActivity.findViewById(R.id.result_text);
	}

	@Test
	public void testAddPositiveInts() {
		int x = 10;
		int y = 2;
		int sum = 12;
		assertEquals(sum, mainActivity.add(x, y));

	}

	@Test
	public void testAddNegativeInts() {
		int x = -10;
		int y = -2;
		int sum = -12;
		assertEquals(sum, mainActivity.add(x, y));

	}

	@Test
	public void testAddPosNegInts() {
		int x = 10;
		int y = -2;
		int sum = 8;
		assertEquals(sum, mainActivity.add(x, y));

	}

	@Test
	public void testSubtractPositiveInts() {
		int x = 10;
		int y = 2;
		int diff = 8;
		assertEquals(diff, mainActivity.subtract(x, y));

	}

	@Test
	public void testSubtractNegativeInts() {
		int x = -10;
		int y = -2;
		int diff = -8;
		assertEquals(diff, mainActivity.subtract(x, y));

	}

	@Test
	public void testSubtractPosNegInts() {
		int x = 10;
		int y = -2;
		int diff = 12;
		assertEquals(diff, mainActivity.subtract(x, y));

	}

	@Test
	public void testMultiplyPositiveInts() {
		int x = 10;
		int y = 2;
		int prod = 20;
		assertEquals(prod, mainActivity.multiply(x, y));

	}

	@Test
	public void testMultiplyNegativeInts() {
		int x = -10;
		int y = -2;
		int prod = 20;
		assertEquals(prod, mainActivity.multiply(x, y));

	}

	@Test
	public void testMultiplyPosNegInts() {
		int x = 10;
		int y = -2;
		int prod = -20;
		assertEquals(prod, mainActivity.multiply(x, y));

	}

	@Test
	public void testDividePositiveInts() {
		int x = 10;
		int y = 2;
		float quot = 5;
		assertEquals(quot, mainActivity.divide(x, y));

	}
	
	@Test
	public void testDivideNonIntResult() {
		int x = 5;
		int y = 2;
		float quot = 2.5f;
		assertEquals(quot, mainActivity.divide(x, y));

	}

	@Test
	public void testDivideNegativeInts() {
		int x = -10;
		int y = -2;
		float quot = 5;
		assertEquals(quot, mainActivity.divide(x, y));

	}

	@Test
	public void testDividePosNegInts() {
		int x = 10;
		int y = -2;
		float quot = -5;
		assertEquals(quot, mainActivity.divide(x, y));

	}

}
