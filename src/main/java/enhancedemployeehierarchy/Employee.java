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

public class Employee {
  
   String firstName;
   String lastName;
   String SSN;
   CompensationModel model;

   public Employee(String string, String string2, String string3, CompensationModel commissionModel) {
       this.firstName=string;
       this.lastName=string2;
       this.SSN=string3;
       this.model=commissionModel;
   
   }

   public String getFirstName() {
       return firstName;
   
   }

   private void setFirstName(String firstName) {
       this.firstName = firstName;
   
   }

   public String getLastName() {
       return lastName;
   
   }

   private void setLastName(String lastName) {
       this.lastName = lastName;
   
   }

   public String getSSN() {
       return SSN;
   
   }

   private void setSSN(String sSN) {
       SSN = sSN;
   
   }

   public void setCompensation(CompensationModel commisionModel) {
       this.model=commisionModel;
   
   }

   public double earnings() {
       return model.earnings();
   
   }
   
   public void raise (double percent) {
       this.model.raise(percent);
   
   }
   
   @Override
   public String toString() {
      
       return firstName+" "+lastName+"\nSocial Security Number: "+SSN+"\n"
               + model.toString()+"\nEarnings: "+String.format("%.2f", earnings()) + "\n";
   
   }

}