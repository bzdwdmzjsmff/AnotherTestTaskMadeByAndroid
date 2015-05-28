package com.letben.task_test;

public class Calculate {
	private boolean isError=false;
	public void setIsError(){
		isError=true;
	}
	public boolean getIsError(){
		return isError;
	}
	public double add(double a,double b){
		return a+b;
	}
	public double minus(double a,double b){
		return a-b;
	}
	public double multiple(double a,double b){
		return a*b;
	}
	public double divide(int a,int b){
		if(b==0){
			setIsError();
			return b;
		}else{
			return (double)a/b;
		}
		
	}

}
