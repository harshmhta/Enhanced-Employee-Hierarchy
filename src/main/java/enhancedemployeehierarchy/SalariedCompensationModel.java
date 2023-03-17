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

public class SalariedCompensationModel extends CompensationModel {
	private double weeklySalary;
	
	public SalariedCompensationModel(double salary) {
		this.weeklySalary = salary;
	
        }

	@Override
	public double earnings() {
		return this.weeklySalary;
	
        }

	@Override
	public void raise(double percent) {
		this.weeklySalary += percent * this.weeklySalary;
	
        }
        @Override
        public String toString() {
            return "Salaried Compensation with:\nWeek Salary of: " + String.format("%.2f", this.weeklySalary);
        
        }
}
