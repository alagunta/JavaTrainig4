package com.stackroute.basics;
import java.util.Scanner;


	public class RectanglePerimeter {
	    public static void main(String[] args) {
	        new RectanglePerimeter().getValues();

	    }

	    public void getValues() {
	       try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter length");
			double length=sc.nextDouble();
			System.out.println("enter breadth");
			double breadth=sc.nextDouble();
			double obj=perimeterCalculator(length,breadth);
			System.out.println(obj);
		}
	    }

	   
	    public double perimeterCalculator(double length, double breadth) {
	                return 2*(length+breadth);
	    }
	}


