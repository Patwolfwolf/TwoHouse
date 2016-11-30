package com.example.ruiwen.onehouse;



public class Mechanics {
	
	public double getMoments(double force, double distance){
		return force*distance;
	}
	
	public double getForce(double moments, double distance){
		return moments/distance;
	}
	
	public double getDistance(double moments, double force){
		return moments/force;
	}
	
	public double getVeloctiy(double changeDistance, double changeTime){
		return changeDistance/ changeTime;
	}
	
	public double getChangeDistance(double velocity, double changeTime){
		return velocity * changeTime;
	}
	
	public double getChangeTime(double velocity, double changeDistance){
		return changeDistance/velocity;
	}
	
	public double getVelocity(double acceleration, double time, double initialVelocity){
		return initialVelocity + (acceleration * time);
	}
	
	public double getAcceleration(double velocity, double time, double initialVelocity){
		return (velocity - initialVelocity)/time;
	}
	
	public double getTime(double velocity, double acceleration, double initialVelocity){
		return (velocity-initialVelocity)/acceleration;
	}
	
	public double getInitialVelocity(double velocity, double time, double acceleration){
		return velocity - acceleration*time;
	}
	
	public double getAcceleration(double changeVelocity, double changeTime){
		return changeVelocity/changeTime;
	}
	
	public double getChangeVelocity(double acceleration, double changeTime){
		return acceleration * changeTime;
	}
	
	public double getChangeTime2(double acceleration, double changeVelocity){
		return changeVelocity /acceleration;
	}
	
	public double getDistance(double initialVelocity, double velocity, double time){
		return (initialVelocity + velocity) * time /2;
	}
	
	public double getInitalVelocity(double distance, double velocity, double time){
		return distance * 2/time - velocity;
	}
	
	public double getVelocity2(double distance, double initialVelocity, double time){
		return distance*2/time - initialVelocity;
	}
	
	public double getTime2(double distance, double initialVelocity, double velocity){
		return distance * 2/(initialVelocity + velocity);
	}
	
	public double getDistance1(double initialVelocity, double time, double acceleration){
		return initialVelocity + acceleration * time * time/2;
	}
	
	public double getInitialVelocity2(double distance, double time, double acceleration){
		return distance - acceleration * time * time /2;
	}
	
	public double getTime3(double distance, double initialVelocity, double acceleration){
		return Math.sqrt((distance-initialVelocity) * 2/acceleration);
	}
	
	public double getAcceleration2(double distance, double initialVelocity, double time){
		return (distance-initialVelocity) *2/time/time;
	}
	
	public double getForce2(double mass, double acceleration){
		return mass*acceleration;
	}
	
	public double getMass(double force, double acceleration){
		return force/acceleration;
	}
	
	public double getAcceleration3(double force, double mass){
		return force/mass;
	}
	
	public double getWork(double force, double distance, double theta){
		return force * distance*Math.cos(theta);
	}
	
	public double getForce(double work, double distance, double theta){
		return work/distance/Math.cos(theta);
	}
	
	public double getDistance2(double work, double force, double theta){
		return work/force/Math.cos(theta);
	}
	
	public double getTheta(double work, double force, double distance){
		return Math.acos(work / force/distance);
	}
	
	public double getEnergyOfKinetic(double mass, double velocity){
		return mass * velocity * velocity /2;
	}
	
	public double getMass2(double energyOfKinetic, double velocity){
		return energyOfKinetic *2/velocity/velocity;
	}
	
	public double getVelocity(double energyOfKinetic, double mass){
		return Math.sqrt(energyOfKinetic * 2/mass);
	}
	
	public double getEnergyOfPotential(double mass, double changeHeight, double gravitation){
		return mass*gravitation * changeHeight;
	}
	
	public double getMass(double energyOfPotential, double changeHeight, double gravitation){
		return energyOfPotential / gravitation/changeHeight;
	}
	
	public double getChangeHeight(double energyOfPotential, double mass, double gravitaion){
		return energyOfPotential / mass/gravitaion;
	}
	
	public double getGravitaion(double energyOfPotential, double mass, double changeHeight){
		return energyOfPotential/mass/changeHeight;
	}
	
	public double getPower(double force, double velocity){
		return force*velocity;
	}
	
	public double getForce3(double power, double velocity){
		return power/velocity;
	}
	
	public double getVelocity3(double power, double force){
		return power/force;
	}
	
	public double getPower1(double changeWork, double changeTime){
		return changeWork/changeTime;
	}
	
	public double getChangeWork(double power, double changeTime){
		return power/changeTime;
	}
	
	public double getChangeTime3(double power, double changeWork){
		return power/changeWork;
	}
	
	public double getEfficient(double usefulOutputPower, double inputPower){
		return usefulOutputPower/inputPower;
	}
	
	public double getusefulOutputPower(double efficient, double inputPower){
		return efficient * inputPower;
	}
	
	public double getInputPower(double efficient, double usefulOutputPower){
		return usefulOutputPower/efficient;
	}

}
