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
 * Inherits data fields from person class
 * 5. Work position			USHER (enum with TICKETSELLER, CONCESSIONS)
 * 6. Pay scale per hour			$8.25
 * 7. Hours worked per week		22
 * 8. Days worked each week		THURSDAY, SATURDAY  (enum type of all days)
 * 9. Number of weeks worked this month	4.5  (one extra Thursday worked)
 *
 * The method for CalculatePay for a theater staff member is to pass in the pay 
 * scale per hour, the hours worked for week, and a number of weeks worked in the 
 * current month.  The theater staff member's pay monthly pay is :  
 * pay per hour * hours per week * weeks worked in current month
 * <P>
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 */
public class Staff extends Person
{
    private Position position;
    private int hrsWorkedPerWeek;
    private Days[] days = new Days[7];
    private double weeksWorkedThisMonth;
    private int manager;

    public Staff(Position position, int hrsWorkedPerWeek, double weeksWorkedThisMonth, String hiredWhichPlay, double payScalePerHour, boolean actorsEquity, String lastName, String firstName, Date dateOfBirth, Address address, int manager)
    {
        super(lastName, firstName, dateOfBirth, address);
        this.position = position;
        this.hrsWorkedPerWeek = hrsWorkedPerWeek;
        this.weeksWorkedThisMonth = weeksWorkedThisMonth;
        this.manager = manager;
        
    }

    /**
     * @return the position
     */
    public Position getPosition()
    {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position)
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
    public Days[] getDays()
    {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(Days[] days)
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

    /**
     * @return the manager
     */
    public int getManager()
    {
        return manager;
    }

    /**
     * @param manager the manager to set
     */
    public void setManager(int manager)
    {
        this.manager = manager;
    }

    @Override
    public String toString()
    {
        //return "Staff{" + "position=" + position + ", hrsWorkedPerWeek=" + hrsWorkedPerWeek + ", days=" + days + ", weeksWorkedThisMonth=" + weeksWorkedThisMonth + ", manager=" + manager + '}';
        return  position + "|" + hrsWorkedPerWeek + "|" + days + "|" + weeksWorkedThisMonth + "|" + manager;
    }
    
    
    
}
