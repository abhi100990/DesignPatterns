package com.structural.pattern.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter{

	private Socket socket = new  Socket();
	
	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt volt = socket.getVolt();// TODO Auto-generated method stub
		
		return convertVolt(volt, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = socket.getVolt();// TODO Auto-generated method stub
		
		return convertVolt(volt, 10);
	}

	private Volt convertVolt(Volt volt, int i) {
		// TODO Auto-generated method stub
		return new Volt(volt.getVolts() / i);
	}
}
