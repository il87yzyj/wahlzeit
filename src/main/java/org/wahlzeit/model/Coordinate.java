package org.wahlzeit.model;

import java.lang.Math;
/*
 * This class discribes a coordinate in x, y and z in a cartesian coordinate system
 */
public class Coordinate {
	
	private double x, y, z;
	
	public Coordinate () {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Coordinate(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;		
	}
	
	public double getDistance(Coordinate cor) {
		return Math.sqrt(Math.pow(x-cor.x,2)+Math.pow(y-cor.y,2)+Math.pow(z-cor.z,2));
	}
	
	public boolean isEqual(Coordinate cor){
		if(x==cor.x && y==cor.y && z==cor.z) {
			return true;
		}
		return false;		
	}
}
