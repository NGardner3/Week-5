package salesvssales;


//package highestearner;

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

    }
}
