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

import java.util.Scanner;


public class SalesVsSales {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); 

        //create new object to compute compensation and  find the highest earner
        CompCalculation a = new CompCalculation();
        a.askUser();
/*
        // ask user enter number of salespersons
        System.out.print("How many salespersons do you want to compare: ");
        int SIZE = input.nextInt();

        // create an array to store names of salespersons
        String[] name = new String[SIZE];

        // create an array to store annual sale of salespersons
        double[] sale = new double[SIZE];
        
        // create an array to store total compensation of salespersons
        double[] compensation = new double[SIZE];

         
        // input data for each person and compute compensation for that one
        for (int i = 0; i < SIZE; i++)

        {
            input.nextLine();
            System.out.print("Please enter name of person " + (i+1) + ": ");
            name[i] = input.nextLine();          
            System.out.print("Please enter total annual sales of person " + (i+1) + ": $");
            sale[i] = input.nextDouble();
            //compensation[i] = a.calculation(sale[i]);
            compensation[i] = sale[i];
        }

        // find index of the highest earner in array
        int highest = a.highest_earner(compensation, SIZE);

        // display the highest earner
        System.out.println("\nThe highest earner is: \n" + name[highest] +
                           " with total sales: $" + sale[highest] +
                           " and total compensation: $" + a.calculation());

         

        //calculate and display the additional amount of sales that each salesperson
        //must achieve to match or exceed the higher of the two earners
        System.out.println("\nAdditional amount of sales needed for others to match the higgest earners:");
        System.out.format("%-25s%10s\n", "   Name", "Sale amount needed");
        for (int i = 0; i<SIZE; i++)

        {
            
            if (i==highest) {
                continue;

            } // skip the highest earner
            //System.out.println(name[i] + "\t\t$" + (sale[highest] - sale[i]));
            System.out.format("%-25s%10s\n", name[i], (sale[highest] - sale[i]));
          
            }

    }

*/
    }
}
