package com.structural.pattern.adapter;

public class Volt {
	private int volts;
	
	public Volt(int v){
		this.volts = v;
	}
	
	public void setVolt(int v)
	{
		this.volts = v;
	}
	
	public int getVolts()
	{
		return this.volts;
	}
}
