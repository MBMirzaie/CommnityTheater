/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.util.Date;

/**
 * The theater Staff member class has the following attributes 	
 * <P>
 Inherits data fields from person class
 5. Work position			USHER (enum with TICKETSELLER, CONCESSIONS)
 6. Pay scale per hour			$8.25
 7. Hours worked per week		22
 8. DAYS worked each week		THURSDAY, SATURDAY  (enum type of all days)
 9. Number of weeks worked this month	4.5  (one extra Thursday worked)

 The method for CalculatePay for a theater staff member is to pass in the pay 
 scale per hour, the hours worked for week, and a number of weeks worked in the 
 current month.  The theater staff member's pay monthly pay is :  
 pay per hour * hours per week * weeks worked in current month
 <P>
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 */
public class Staff extends Person
{
    private POSITION position;
    private int hrsWorkedPerWeek;
    private DAYS[] days = new DAYS[7];
    private double weeksWorkedThisMonth;
    private double payPerHour;

    public Staff(POSITION position, int hrsWorkedPerWeek, double weeksWorkedThisMonth, double payPerHour, String lastName, String firstName, Date dateOfBirth, Date hireDate, Address address)
    {
        super(lastName, firstName, dateOfBirth, hireDate, address);
        this.position = position;
        this.hrsWorkedPerWeek = hrsWorkedPerWeek;
        this.weeksWorkedThisMonth = weeksWorkedThisMonth;
        this.payPerHour = payPerHour;
        //this.manager = manager;
        
    }

    /**
     * @return the position
     */
    public POSITION getPosition()
    {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(POSITION position)
    {
        this.position = position;
    }

    /**
     * @return the hrsWorkedPerWeek
     */
    public int getHrsWorkedPerWeek()
    {
        return hrsWorkedPerWeek;
    }

    /**
     * @param hrsWorkedPerWeek the hrsWorkedPerWeek to set
     */
    public void setHrsWorkedPerWeek(int hrsWorkedPerWeek)
    {
        this.hrsWorkedPerWeek = hrsWorkedPerWeek;
    }

    /**
     * @return the days
     */
    public DAYS[] getDays()
    {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(DAYS[] days)
    {
        this.days = days;
    }

    /**
     * @return the weeksWorkedThisMonth
     */
    public double getWeeksWorkedThisMonth()
    {
        return weeksWorkedThisMonth;
    }

    /**
     * @param weeksWorkedThisMonth the weeksWorkedThisMonth to set
     */
    public void setWeeksWorkedThisMonth(double weeksWorkedThisMonth)
    {
        this.weeksWorkedThisMonth = weeksWorkedThisMonth;
    }

    @Override
    public String toString()
    {
        //return "Staff{" + "position=" + position + ", hrsWorkedPerWeek=" + hrsWorkedPerWeek + ", days=" + days + ", weeksWorkedThisMonth=" + weeksWorkedThisMonth + ", manager=" + manager + '}';
        return  position + "|" + hrsWorkedPerWeek + "|" + days + "|" + weeksWorkedThisMonth + "|" + payPerHour;
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
    
    
    
}
