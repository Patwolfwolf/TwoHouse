package com.example.ruiwen.onehouse;

import java.util.Scanner;

public class Electricity {
//	double current, resistance, voltage, time, charge, power, work, energy; 
	
	public double getCurrent(double changeTime, double changeCharge){
		return changeCharge/changeTime;
	}
	
	public double getChangeCharge(double current, double changeTime){
		return current * changeTime;
	}
	
	public double getChangeTime(double current, double changeCharge){
		return changeCharge/current;
	}
	
	public double getVoltage(double work, double charge){
		return work/charge;
	}
	
	public double getWork(double voltage, double charge){
		return voltage * charge;
	}
	
	public double getCharge(double voltage, double work){
		return work/voltage;
	}
	
	public double getResistence(double voltage, double current){
		return voltage/current;
	}
	
	public double getvoltage2(double resistence, double current){
		return resistence * current;
	}
	
	public double getCurrent2(double resistence, double voltage){
		return voltage/resistence;
	}
	
	public double getEMF(double energy, double charge){
		return energy/charge;
	}
	
	public double getEnergy(double EMF, double  charge){
		return EMF * charge;
	}
	
	public double getCharge2(double EMF, double energy){
		return energy/EMF;
	}
	
	public double getEMF(double current, double resistance, double innerResistance){
		return current *(resistance + innerResistance);
	}
	
	public double getCurrent3(double EMF, double resistence, double innerResistence){
		return EMF/(resistence + innerResistence);
	}
	
	public double getResistence2(double EMF, double current, double innerResistence){
		return EMF/current - innerResistence;
	}
	
	public double getInnerResistence(double EMF, double current, double resistence){
		return EMF/current - resistence;
	}
	
	public double getPower(double voltage, double current){
		return voltage * current;
	}
	
	public double getVoltage3(double power, double  current){
		return power/current;
	}
	
	public double getCurrent3(double power, double voltage){
		return power/voltage;
	}
	
	public double getPower2(double current, double resistance){
		return current*current*resistance;
	}
	
	public double getCurrent4(double power, double resistence){
		return Math.sqrt(power/resistence);
	}
	
	public double getResistence3(double power, double current){
		return power/current/current;
	}
	
	public double getPower3(double voltage, double resistance){
		return voltage*voltage*resistance;
	}
	
	public double getAlternatingCurrent(double current){
		return current/Math.sqrt(2);
	}
	
	public double getCurrent(double alternatingCurrent){
		return alternatingCurrent * Math.sqrt(2);
	}
	
	public double getAlternatingVoltage(double voltage){
		return voltage/Math.sqrt(2);
	}
	
	public double getVoltage(double alternatingVoltage){
		return alternatingVoltage * Math.sqrt(2);
	}
	
//	public double getSeriesResistance(double resistance){
//		Scanner in = new Scanner(System.in);
//		int i = in.nextInt();
//		
//	}

}
