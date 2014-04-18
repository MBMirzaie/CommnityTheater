/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

/**
 *
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 * @version 1                   
 * @since   3/15/2014
 */
import java.util.*;

public class Customer extends Person
{

    /**
     * @param firstName Set the First name of Person
     * @param dateOfBirth Set the Date of Birth of Person
     * @param address Set the Address of Person
     * @param lastName Set the Last name of Person
     */
    public Customer(String lastName, String firstName, Date dateOfBirth, Date hireDate, Address address) {
        super(lastName, firstName, dateOfBirth, hireDate, address);
    }
//	private Date dateToAttend;	// Date of Attendance
//	private int seatId;		// Which seat are they in?
//	private boolean hasPaid;	// Have they paid?
//	private int numberTickets;	// How many tickets did they buy? (seats sold in consecutive order, no exceptions)
//	private String whichPlay;	// Which play attended?
        
}
