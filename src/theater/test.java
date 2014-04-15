/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.io.*;

/**
 *
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 * @version 1                   
 * @since   3/15/2014
 */
public class test {
    
    public static void main(String[] args)
    {
        Theater theTheater;
        
        System.out.println("Welcome to the half-baked theater management system!");
        System.out.println("Please complete the initial informational survey and then choose an option from the menu.");
        String tmp1, tmp2, tmp3;
        tmp1 = new String(); tmp2 = new String(); tmp3 = new String();
        System.out.printf("Please enter your theater's name:  ");
        BufferedReader inPut;
        inPut = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            tmp1 = inPut.readLine();
        }
        catch(IOException ioe)
        {
            System.out.println("IO error trying to read line.");
            System.exit(1);
        }
        System.out.printf("Please enter the monthly cost to rent your theater (include utilities):  ");
        try 
        {
            tmp2 = inPut.readLine();
        }
        catch(IOException ioe)
        {
            System.out.println("IO error trying to read line.");
            System.exit(1);
        }
        theTheater = new Theater(tmp1,Double.parseDouble(tmp2));
        theTheater.getTheaterInformation();
        //Hire/Fire an actor or director
        //Add Play/Show/Item
        //Sell ticket -> Add Customer/Sell Seat
        //Accounting -> Reconcile(Date)
        //Exit
        boolean running = true;
        while(running){ running = theTheater.printMenu(); }
    }
}
    
