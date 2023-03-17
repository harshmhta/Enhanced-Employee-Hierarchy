/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedemployeehierarchy;

/**
 *
 * @author harsh
 */

public class BasePlusCommissionCompensationModel extends CompensationModel {
  
   private double base;
   private double grossSales;
   private double commissionRate;
   
   public BasePlusCommissionCompensationModel(double s, double r,double x) {
    
       this.grossSales=s;
       this.commissionRate=r;
       this.base = x;
   
   }
 
  
   
    @Override
    public double earnings() {
	return (grossSales*commissionRate)+base;
   
    }

    @Override
    public void raise(double percent) {
        this.commissionRate += percent;
        this.base += this.base * percent;
   
    }
  
   @Override
   public String toString() {
       return "Base Plus Commission Compensation with:\nGross Sales of: " +String.format("%.2f", grossSales)+"\nCommission Rate of: "+String.format("%.3f", commissionRate)+"\nBase Salary of: "+String.format("%.2f", base);
   
   }

}