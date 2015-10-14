package com.structural.pattern.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt volt = getVolt();// TODO Auto-generated method stub
		
		return convertVolt(volt, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = getVolt();// TODO Auto-generated method stub
		
		return convertVolt(volt, 10);
	}

	private Volt convertVolt(Volt volt, int i) {
		// TODO Auto-generated method stub
		return new Volt(volt.getVolts() / i);
	}

}
