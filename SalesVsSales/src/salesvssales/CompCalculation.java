/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highestearner;

/**
 *
 * @author DerekC
 */

public class CompCalculation {

    
     //method to calculate annual compensation

    public double calculation(double total_sales) {

        double fixed_salary = 30000, //fixed salary of $30,000.00 per year
                sales_target = 400000, //sales target is $400,000.00 per year
                incentive_rate = 0.8, // sales incentive start when 80% of the sales target is met
                commission_rate = 0.08, //current commission is 8% of total sales
                bonus = 1.25, //acceleration factor is 1.25
                compensation = 0; //Total compensation

 
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
