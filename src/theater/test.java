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
        if(Theater.getString("Would you like to load initial Theater info from file (y/n)?").startsWith("y"))
        {
            theTheater = new Theater(FromFile.readTheaterPlay());
        }
        else
        {
            System.out.println("Please complete the initial informational survey and then choose an option from the menu.");
            String tmp1;
            double tmp2;
            tmp1 = Theater.getString("Please enter your theater's name:  "); 
            tmp2 = Theater.getDouble("Please enter the monthly cost to rent your theater (include utilities):  ");
            theTheater = new Theater(tmp1,tmp2);
            theTheater.getTheaterInformation();
        }

        //Hire/Fire an actor or director
        //Add Play/Show/Item
        //Sell ticket -> Add Customer/Sell Seat
        //Accounting -> Reconcile(Date)
        //Exit
        boolean running = true;
        while(running){ running = theTheater.printMenu(); }
    }
}
    
