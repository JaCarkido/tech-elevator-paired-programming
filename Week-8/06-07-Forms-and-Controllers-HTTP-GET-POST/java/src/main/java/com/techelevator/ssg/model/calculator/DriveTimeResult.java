package com.techelevator.ssg.model.calculator;

public class DriveTimeResult {

	private String planetName;
	private String transChoice;
	private double planetDistance;
	private double travelSpeed;
	private int earthAge;
	

	
	public DriveTimeResult(String planetName, int earthAge, String transChoice) {
		this.planetName = planetName;
		this.earthAge = earthAge;
		getPlanetDistance(planetName);
		getTravelSpeed(transChoice);
		
		//this.planetGravity = getPlanetGravity(planetName);
		
	}
	

	public double getTravelTime() {
		return (((this.planetDistance / this.travelSpeed) /24)/365.25);
	
		
}
	
//	public String getPlanetName() {
//		return this.planetName;
//	}
	
	public double getPlanetDistance(String planetName) {
	
	
		
		switch(planetName){
			case "mercury":
				this.planetDistance = 56974146;
				break;
			case "venus":
				this.planetDistance = 25724767;
				break;
			case "earth":
				this.planetDistance = 1;
				break;
			case "mars":
				this.planetDistance = 48678219;
				break;
			case "jupiter":
				this.planetDistance = 390674710;
				break;
			case "saturn":
				this.planetDistance = 792248270;
				break;
			case "uranus":
				this.planetDistance = 1692662530.00;
				break;
			case "neptune":
				this.planetDistance = 2703959960.00;
				break;
		}
		return this.planetDistance;
	}
	
	public double getTravelSpeed(String transChoice) {
		
	
		
		switch(transChoice){
			case "walking":
				this.travelSpeed = 3;
				break;
			case "car":
				this.travelSpeed = 100;
				break;
			case "bullet train":
				this.travelSpeed = 200;
				break;
			case "boeing 747":
				this.travelSpeed = 570;
				break;
			case "concorde":
				this.travelSpeed = 1350;
				break;
		}
		return this.travelSpeed;
	}
		
}
