/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.util.Date;

/**
 *
 * @author  Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 * @version 1                   
 * @since   3/15/2014
 */
public class Person extends Account
{
	private String lastName;		// Last name of Person
	private String firstName;		// First name of Person
	private int pID;			// ID for Person
	static private int IDPool;		// Incremented each time a Person is created, then assigned to its ID.
	private Date dateOfBirth;		// Date of Birth of Person
        private Date hireDate;                  // Hard to say really...
	private Address address;		// Address of Person


    /**
     * @param firstName Set the First name of Person
     * @param dateOfBirth Set the Date of Birth of Person
     * @param address Set the Address of Person
     * @param lastName Set the Last name of Person
     */
    public Person(String lastName, String firstName, Date dateOfBirth, Date hireDate, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.address = address;
        
        IDPool++;
        pID = IDPool;
    }

    /**
     * @return Last name of Person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName Set the Last name of Person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return First name of Person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName Set the First name of Person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Date of Birth of Person
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth Set the Date of Birth of Person
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the Address of Person
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address Set the Address of Person
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return lastName + "|" + firstName + "|" + pID + "|" + dateOfBirth + "|" + address;
    }

    /**
     * @return The unique person ID
     */
    public int getpID() {
        return pID;
    }

    public Date getHireDate()
    {
        return hireDate;
    }

    public void setHireDate(Date hireDate)
    {
        this.hireDate = hireDate;
    }

    /**
     * @param pID the pID to set
     */
    public void setpID(int pID)
    {
        this.pID = pID;
    }

}
