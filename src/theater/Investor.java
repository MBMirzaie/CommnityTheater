/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.util.Date;

/**
 * The Investor class has the following attributes 	
 * <P>
 * Inherits data fields from person class
 * 5. Amount invested			double
 * 6. Tickets received			int
 * 7. Percentage of house		percentage
 * <P>
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 */
public class Investor extends Person
{
    private double amountInvested;
    private int ticketsRecieved;
    private double percentageOfHouse;

    public Investor(double amountInvested, int ticketsRecieved, double percentageOfHouse, String lastName, String firstName, Date dateOfBirth, Date hireDate, Address address)
    {
        super(lastName, firstName, dateOfBirth, hireDate, address);
        this.amountInvested = amountInvested;
        this.ticketsRecieved = ticketsRecieved;
        this.percentageOfHouse = percentageOfHouse;
    }

    /**
     * @return the amountInvested
     */
    public double getAmountInvested()
    {
        return amountInvested;
    }

    /**
     * @param amountInvested the amountInvested to set
     */
    public void setAmountInvested(double amountInvested)
    {
        this.amountInvested = amountInvested;
    }

    /**
     * @return the ticketsRecieved
     */
    public int getTicketsRecieved()
    {
        return ticketsRecieved;
    }

    /**
     * @param ticketsRecieved the ticketsRecieved to set
     */
    public void setTicketsRecieved(int ticketsRecieved)
    {
        this.ticketsRecieved = ticketsRecieved;
    }

    /**
     * @return the percentageOfHouse
     */
    public double getPercentageOfHouse()
    {
        return percentageOfHouse;
    }

    /**
     * @param percentageOfHouse the percentageOfHouse to set
     */
    public void setPercentageOfHouse(double percentageOfHouse)
    {
        this.percentageOfHouse = percentageOfHouse;
    }

    @Override
    public String toString()
    {
        //return "Investor{" + "amountInvested=" + amountInvested + ", ticketsRecieved=" + ticketsRecieved + ", percentageOfHouse=" + percentageOfHouse + '}';
        return super.toString() + "|" + amountInvested + "|" + ticketsRecieved + "|" + percentageOfHouse;
    }
    
    
}
