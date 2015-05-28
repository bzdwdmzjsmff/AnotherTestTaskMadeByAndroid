package com.letben.task_test.test;

import com.letben.task_test.Calculate;

import android.test.AndroidTestCase;

public class TestCalculate extends AndroidTestCase {

	private Calculate calculate=new Calculate();
	double result=0;
	boolean flag;
	boolean isEqual;
	public void setIsEqual(){
		isEqual=true;
	}
	public boolean getIsEqual(){
		return isEqual;
	}
	public void testAdd(){
		result=calculate.add(5, 8);
		assertEquals(13.0, result);
	}
	public void testMinus(){
		double result2=calculate.minus(5,8.3);
		double expected=-3.3;
		if((expected-result2)<0.0000001){
			setIsEqual();
		}
		assertEquals(true, isEqual);
	}
	
	public void testMultiple(){
		result=calculate.multiple(5, 3.2);
		assertEquals(16.0, result);	
	}
	public void testDivide(){
		result=calculate.divide(5, 2);
		if(calculate.getIsError()){
			assertEquals(flag, true);
		}else{
			assertEquals(2.5, result);
		}
		double result1=calculate.divide(5, 0);
		if((flag=calculate.getIsError())){
			assertEquals(flag, true);
		}else{
			assertEquals(2.5, result1);
		}
		double result2=calculate.divide(0, 5);
		if(calculate.getIsError()){
			assertEquals(flag, true);
		}else{
			assertEquals(0, result2);
		}	
	}
}
