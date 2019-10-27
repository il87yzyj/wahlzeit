package org.wahlzeit.model;
/*
 * This class defines the place a picture was taken.
 */
public class Location {

	private Coordinate coordinates;

	public Location () {
		this.coordinates = new Coordinate();
	} 
	
	public Location (Coordinate coordinates) {
		this.coordinates = coordinates;
	}
}
