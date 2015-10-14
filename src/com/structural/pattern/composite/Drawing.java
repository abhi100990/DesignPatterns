package com.structural.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

	private List<Shape> shapes = new ArrayList<Shape>();
	
	@Override
	public void draw(String fillColor) {
		// TODO Auto-generated method stub
		
		for(Shape shape : shapes)
		{
			shape.draw(fillColor);
		}
	}
	
	//adding shape to drawing
    public void add(Shape s){
        this.shapes.add(s); 
    }
     
    //removing shape from drawing
    public void remove(Shape s){
        shapes.remove(s);
    }
     
    //removing all the shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }


}
