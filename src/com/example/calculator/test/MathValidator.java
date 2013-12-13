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


	public MathValidator(){
		super("com.example.calculator", MainActivity.class);
		
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
	public void test() throws Exception {
		fail("Just fail here");

	}
}
