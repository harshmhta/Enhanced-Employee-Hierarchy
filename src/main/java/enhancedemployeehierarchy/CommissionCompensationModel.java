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

public class CommissionCompensationModel extends CompensationModel {

   private double grossSales;
   private double commissionRate;
   
   public CommissionCompensationModel(double s, double r) {
       
       this.grossSales=s;
       this.commissionRate=r; 
   
   }
   
   @Override
    public double earnings() {
        return (grossSales*commissionRate);
    
    }
    
    @Override
    public void raise(double percent) {
        this.commissionRate += percent;
    
    }

   public String toString() {
       return "Commission Compensation with:\nGross Sales of: " +String.format("%.2f", grossSales)+"\nCommission Rate of: "+ String.format("%.3f", commissionRate);
   
   }
}