/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.util.Date;

/**
 *
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 */
public class Actor extends Person implements CalculatePay
{
	private String hiredWhichPlay;		// Which play was this person hired for?
	private String roleName;		// Role name the actor plays
        private double payScalePerHour;
        private boolean actorsEquity;
        private int hoursWorkedPerWeek;
        
    /**
     * @param firstName Set the First name of Person
     * @param dateOfBirth Set the Date of Birth of Person
     * @param address Set the Address of Person
     * @param lastName Set the Last name of Person
     * @param hiredWhichPlay Set which play they were hired
     * @param payScalePerHour Set their hourly wage
     * @param actorsEquity Set the Actor's Equity
     * @param roleName Set the role the Actor/Actress plays
     * @param hoursWorkedPerWeek Set the hours worked per week
     */    
    public Actor(int hoursWorkedPerWeek, String hiredWhichPlay, String roleName, double payScalePerHour, boolean actorsEquity, String lastName, String firstName, Date dateOfBirth, Date hireDate, Address address)
    {
        super(lastName, firstName, dateOfBirth,  hireDate, address);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
        this.hiredWhichPlay = hiredWhichPlay;
        this.roleName = roleName;
        this.payScalePerHour = payScalePerHour;
        this.actorsEquity = actorsEquity;
        
    }

        
    /**
     * @return the role the Actor/Actress plays
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName Set the role the Actor/Actress plays
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return the hiredWhichPlay
     */
    public String getHiredWhichPlay()
    {
        return hiredWhichPlay;
    }

    /**
     * @param hiredWhichPlay the hiredWhichPlay to set
     */
    public void setHiredWhichPlay(String hiredWhichPlay)
    {
        this.hiredWhichPlay = hiredWhichPlay;
    }
           
    @Override
    public String toString() {
        return super.toString()+ "|" + roleName + "|" + hiredWhichPlay + "|" + payScalePerHour + "|" + actorsEquity + "|" + hoursWorkedPerWeek;
    }

    /**
     * @return the payScalePerHour
     */
    public double getPayScalePerHour()
    {
        return payScalePerHour;
    }

    /**
     * @param payScalePerHour the payScalePerHour to set
     */
    public void setPayScalePerHour(double payScalePerHour)
    {
        this.payScalePerHour = payScalePerHour;
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
    public double CalculatePay(double amt1, double amt2, double amt3)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
