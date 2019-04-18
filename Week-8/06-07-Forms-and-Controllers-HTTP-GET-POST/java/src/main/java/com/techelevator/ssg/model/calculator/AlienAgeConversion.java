package com.techelevator.ssg.model.calculator;

public class AlienAgeConversion {

	private String planetName;
	private double planetYear;
	private int earthAge;
	

	
	public AlienAgeConversion(String planetName, int earthAge) {
		this.planetName = planetName;
		this.earthAge = earthAge;
		getPlanetYear(planetName);
		
		//this.planetGravity = getPlanetGravity(planetName);
		
	}
	

	public double getAlienAge() {
		return Math.round((this.earthAge * 365.25) / this.planetYear);
	
		
}
	
//	public String getPlanetName() {
//		return this.planetName;
//	}
	
	public double getPlanetYear(String planetName) {
	
		//double planetGravity;
		
		switch(planetName){
			case "mercury":
				this.planetYear = 87.96;
				break;
			case "venus":
				this.planetYear = 224.68;
				break;
			case "earth":
				this.planetYear = 365.25;
				break;
			case "mars":
				this.planetYear = 686.98;
				break;
			case "jupiter":
				this.planetYear = 4332.5955;
				break;
			case "saturn":
				this.planetYear = 10758.804;
				break;
			case "uranus":
				this.planetYear = 30706.5675;
				break;
			case "neptune":
				this.planetYear = 60196.8525;
				break;
		}
		return this.planetYear;
	}
}
