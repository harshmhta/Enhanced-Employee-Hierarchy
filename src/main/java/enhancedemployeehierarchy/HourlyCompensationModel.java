package enhancedemployeehierarchy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */

public class HourlyCompensationModel extends CompensationModel {

	private double wage;
	private double hours;
	
	public HourlyCompensationModel(double wage, double hour) {
		this.wage = wage;
		this.hours = hour;
	
        }

	@Override
	public double earnings() {
		if (hours > 40) {
			return this.wage *1.5 * (hours - 40) + this.wage * 40;
		
                }
		else {
			return this.wage * hours;
		
                }
		
	}

	@Override
	public void raise(double percent) {
		this.wage += this.wage * percent;
	
        }
        
        @Override
        public String toString() {
            return "Hourly Compensation with:\nWage of: " + String.format("%.2f", this.wage) + "\nHours Worked of: " + String.format("%.2f", this.hours);
        
        }
	
}
