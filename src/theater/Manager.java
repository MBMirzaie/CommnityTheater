/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.util.Date;

/**
 * The theater Manager class has the following attributes 	
 * Inherits data fields from person class
 * <P>
 * 5. Number of staff members		14
 * 6. Weekly pay rate			$800.00
 * 7. Vacation weeks taken in month 	1  (this will often be 0)
 * 8. Days worked each week		THURSDAY, FRIDAY, SUNDAY  (enum type of all days)
 * 9. Total weeks in this month	4.5  (indicates 31 days in month)
 *
 * The method for CalculatePay for a theater manger is to pass in the weekly pay rate, 
 * the number of vacation weeks taken in the month and the total number of weeks in 
 * the current month.  The manager pay is then :  
 * weekly pay rate * (total weeks in month – vacation weeks taken in month)
 * <P>
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 */
public class Manager extends Person
{
    private double weeklyPayRate;
    private int vacationWeeksTakenInMonth;
    private Days[] days = new Days[7];
    private double totalWeeksThisMonth;

    public Manager(double weeklyPayRate, int vacationWeeksTakenInMonth, double totalWeeksThisMonth, String hiredWhichPlay, double payScalePerHour, boolean actorsEquity, String lastName, String firstName, Date dateOfBirth, Address address)
    {
        super(lastName, firstName, dateOfBirth, address);
        this.weeklyPayRate = weeklyPayRate;
        this.vacationWeeksTakenInMonth = vacationWeeksTakenInMonth;
        this.totalWeeksThisMonth = totalWeeksThisMonth;
    }

    /**
     * @return the weeklyPayRate
     */
    public double getWeeklyPayRate()
    {
        return weeklyPayRate;
    }

    /**
     * @param weeklyPayRate the weeklyPayRate to set
     */
    public void setWeeklyPayRate(double weeklyPayRate)
    {
        this.weeklyPayRate = weeklyPayRate;
    }

    /**
     * @return the vacationWeeksTakenInMonth
     */
    public int getVacationWeeksTakenInMonth()
    {
        return vacationWeeksTakenInMonth;
    }

    /**
     * @param vacationWeeksTakenInMonth the vacationWeeksTakenInMonth to set
     */
    public void setVacationWeeksTakenInMonth(int vacationWeeksTakenInMonth)
    {
        this.vacationWeeksTakenInMonth = vacationWeeksTakenInMonth;
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
     * @return the totalWeeksThisMonth
     */
    public double getTotalWeeksThisMonth()
    {
        return totalWeeksThisMonth;
    }

    /**
     * @param totalWeeksThisMonth the totalWeeksThisMonth to set
     */
    public void setTotalWeeksThisMonth(double totalWeeksThisMonth)
    {
        this.totalWeeksThisMonth = totalWeeksThisMonth;
    }
    
    

}
