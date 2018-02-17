/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highestearner;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DerekC
 */

public class CompCalculation {
      public void askUser()
    {
        int length = 2;
        int amount = 2;
         
         Scanner input = new Scanner(System.in);
 //Create Array and input elements from askUser input
         ArrayList<String> names = new ArrayList<>(length);
           
           for(int counter = 0; counter<length; counter++){
               System.out.print("Enter First Name of Salesperson  " + (counter+1)+"  ");
               names.add(input.next());
           }
  //Create Array and input elements from askUser input
        ArrayList<Double> saleList = new ArrayList<>(amount); 
            
     for (int i= 0; i<amount; i++){       
          
        try
           
        {
            
            System.out.print("Enter Sale Amount for:\t  " + names.get(i) + " ");
            saleList.add(input.nextDouble());
      
        }
        catch (Exception e)
        {
            System.out.println("Invalid data type entered.");
            System.exit(0);
        }
        
       }
     
     //Iterate through saleList ArrayList and call calculate()
     {
         Iterator iterator = saleList.iterator(); 
         Iterator iterator1 = names.iterator(); 
         
           while(iterator.hasNext()&& iterator1.hasNext()){
             Double sales = (Double) iterator.next();
             String salesPerson = (String) iterator1.next();
               double calculate = calculation();
             DecimalFormat dollar = new DecimalFormat("$###,###.##");
               System.out.println("The total annual compensation earned for " + salesPerson + " is:"); 
               System.out.println(""+ dollar.format(calculate));
           }
     
     }
     
     //Calculation for the lowest earner.
          
                double firstInt = saleList.get(0);
                double secInt = saleList.get(1);
          DecimalFormat total = new DecimalFormat("$###,###.##");
            
            if(firstInt>secInt)
            {
                double diffSum = firstInt - secInt;
                System.out.println("\t The lesser earner needs to earn->\t " + total.format(diffSum) + " more in sales.");
            }
           
            
            else if(secInt > firstInt)
            {
                double diffSum = secInt - firstInt ;
                System.out.println("\t The lesser earner needs to earn ->\t "+ total.format(diffSum)+ " more in sales.");
            }
            else
            {
                System.out.println("You are both equal earners.");
            }       
             
    }
 

    
     //method to calculate annual compensation

    public double calculation() {

        double fixed_salary = 30000, //fixed salary of $30,000.00 per year
                sales_target = 400000, //sales target is $400,000.00 per year
                incentive_rate = 0.8, // sales incentive start when 80% of the sales target is met
                commission_rate = 0.08, //current commission is 8% of total sales
                bonus = 1.25, //acceleration factor is 1.25
                compensation = 0; //Total compensation
          double total_sales = 0;

 
        //If total sales is less than 80% of sales target
        if (total_sales < (sales_target * incentive_rate)) {
            compensation = fixed_salary;
        } //If total sales meet 80% of the sales target
        else if (total_sales <= sales_target) {
            compensation = fixed_salary + (total_sales * commission_rate);
        } //If total sales exceed the sales target
        else if (total_sales > sales_target) {
            compensation = fixed_salary + (total_sales * commission_rate * bonus);
        }
       return compensation;
    }


   // method to find the highest earner
    // take array of compensation and its size as parameter
    public int highest_earner(double[] compensation_array, int size) {
        int index = 0; // index of highest earner in array
        double max = 0;
        // loop all array and find highest earner
        for (int i = 0; i < size; i++) {
            if (compensation_array[i] > max) {
                max = compensation_array[i];
                index = i;
            }
        }
        return index;
    }

}
