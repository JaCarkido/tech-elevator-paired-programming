package com.techelevator.ssg.model.calculator;

public class AlienWeightConversion {

	private String planetName;
	private double planetGravity;
	private int earthWeight;

	
	public AlienWeightConversion(String planetName, int earthWeight) {
		this.planetName = planetName;
		this.earthWeight = earthWeight;
		getPlanetGravity(planetName);
		
		//this.planetGravity = getPlanetGravity(planetName);
		
	}
	

	public double getAlienWeight() {
		return (this.earthWeight * this.planetGravity);
	
		
}
	
//	public String getPlanetName() {
//		return this.planetName;
//	}
	
	public double getPlanetGravity(String planetName) {
	
		//double planetGravity;
		
		switch(planetName){
			case "mercury":
				this.planetGravity = .37;
				break;
			case "venus":
				this.planetGravity = .9;
				break;
			case "earth":
				this.planetGravity = 1;
				break;
			case "mars":
				this.planetGravity = .38;
				break;
			case "jupiter":
				this.planetGravity = 2.65;
				break;
			case "saturn":
				this.planetGravity = 1.13;
				break;
			case "uranus":
				this.planetGravity = 1.09;
				break;
			case "neptune":
				this.planetGravity = 1.43;
				break;
		}
		return this.planetGravity;
	}
}
