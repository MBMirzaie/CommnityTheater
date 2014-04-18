/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.util.Date;

/**
 * The Director class has the following attributes
 * <P>
 *                                                      EXAMPLE
 * Inherits data fields from person class
 * 5. Hired for which play				Cabaret
 * 6. Pay scale per hour				$30.00
 * 7. Actor's Equity?					boolean
 * 8.  Up front fee					$450.00
 * 9.  Percentage of house				15%
 * 10.  Hours worked per week                           50
 * 
 * The method for CalculatePay for a director is to pass in the up front fee, the pay 
 * scale per hour, and a 1 if the Actor's Equity boolean is true or 0 if false.  The 
 * pay is then calculated one of two ways based on the boolean value.  
 * If the Actor's Equity boolean was false then the 
 * actor's pay equals up front fee
 * If the Actor's Equity boolean was true then the pay calculation is:
 * actor's pay equals up front fee PLUS
 * 	the greater of ((hours per week – 40) * pay per hour)  OR 0 (zero)
 * [ There is extra pay for over 40 hours a week if the director is part of Equity]
 * 
 * Directors will also have a method for PerformancePay which will be based on the 
 * total ticket sales for all shows taking the gross revenue for ticket sales and 
 * determining 15% of the gross revenue.  This percentage of the house is the pay 
 * the director receives for the complete run of the play and all performances.
 * <P>
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 */
public class Director extends Person implements CalculatePay
{
	private int hiredWhichPlay;		// Which play was this theater person hired on?
        private double payPerHour;
        private boolean actorsEquity;
        private double upFrontFee;
        private double percentageOfHouse;
        private int hoursWorkedPerWeek;

    public Director(int hiredWhichPlay, double payPerHour, boolean actorsEquity, double upFrontFee, double percentageOfHouse, int hoursWorkedPerWeek, String lastName, String firstName, Date dateOfBirth, Date hireDate, Address address)
    {
        super(lastName, firstName, dateOfBirth, hireDate, address);
        this.hiredWhichPlay = hiredWhichPlay;
        this.payPerHour = payPerHour;
        this.actorsEquity = actorsEquity;
        this.upFrontFee = upFrontFee;
        this.percentageOfHouse = percentageOfHouse;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    /**
     * @return the hiredWhichPlay
     */
    public int getHiredWhichPlay()
    {
        return hiredWhichPlay;
    }

    /**
     * @param hiredWhichPlay the hiredWhichPlay to set
     */
    public void setHiredWhichPlay(int hiredWhichPlay)
    {
        this.hiredWhichPlay = hiredWhichPlay;
    }

    /**
     * @return the payPerHour
     */
    public double getPayPerHour()
    {
        return payPerHour;
    }

    /**
     * @param payPerHour the payPerHour to set
     */
    public void setPayPerHour(double payPerHour)
    {
        this.payPerHour = payPerHour;
    }

    /**
     * @return the actorsEquity
     */
    public boolean isActorsEquity()
    {
        return actorsEquity;
    }

    /**
     * @param actorsEquity the actorsEquity to set
     */
    public void setActorsEquity(boolean actorsEquity)
    {
        this.actorsEquity = actorsEquity;
    }

    /**
     * @return the upFrontFee
     */
    public double getUpFrontFee()
    {
        return upFrontFee;
    }

    /**
     * @param upFrontFee the upFrontFee to set
     */
    public void setUpFrontFee(double upFrontFee)
    {
        this.upFrontFee = upFrontFee;
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

    /**
     * @return the hoursWorkedPerWeek
     */
    public int getHoursWorkedPerWeek()
    {
        return hoursWorkedPerWeek;
    }

    /**
     * @param hoursWorkedPerWeek the hoursWorkedPerWeek to set
     */
    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek)
    {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public String toString()
    {
        //return "Director{" + "hiredWhichPlay=" + hiredWhichPlay + ", payPerHour=" + payPerHour + ", actorsEquity=" + actorsEquity + ", upFrontFee=" + upFrontFee + ", percentageOfHouse=" + percentageOfHouse + ", hoursWorkedPerWeek=" + hoursWorkedPerWeek + '}';
        return super.toString() + "|" + hiredWhichPlay + "|" + payPerHour + "|" + actorsEquity + "|" + upFrontFee + "|" + percentageOfHouse + "|" + hoursWorkedPerWeek;
    }

    @Override
    public double CalculatePay(double amt1, double amt2, double amt3)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
