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
 * @since   3/20/2014
 * 
 * E.  Class for BankAccount has the following attributes:
 * 1.  Current total 					double 
 * 2.  List of last three payment transactions made
 * 3.  List of last three deposit transactions received 
 * 4.  Receiving direct deposit?				Boolean
 * 5.  Account number
 * 
 */
public class Account 
{
    private double curTotal;     // Current contribution(-)/pay(+)
    private String[] lastThreePayments = new String[3];
    private String[] lastThreeDeposits = new String[3];
    private boolean directDeposit;
    private int accountNumber;
    
    static private int accountPool = 0;
    
    public void recieveDeposit(double amt, String reason)
    {
        curTotal = curTotal + amt;
        lastThreeDeposits[2] = lastThreeDeposits[1];
        lastThreeDeposits[1] = lastThreeDeposits[0];
        lastThreeDeposits[0] = reason;
    }
    public void givePayment(double amt, String reason)
    {
        curTotal = curTotal - amt;
        lastThreePayments[2] = lastThreePayments[1];
        lastThreePayments[1] = lastThreePayments[0];
        lastThreePayments[0] = reason;
    }
    /**
     * Default constructor
     * <P>
     * Default constructor with no arguments to give
     * members and methods to child classes.
     * <P>
     */
    public Account()
    {
        accountPool++;
        accountNumber = accountPool;
    }

    /**
     * @return the directDeposit
     */
    public boolean isDirectDeposit()
    {
        return directDeposit;
    }

    /**
     * @param directDeposit the directDeposit to set
     */
    public void setDirectDeposit(boolean directDeposit)
    {
        this.directDeposit = directDeposit;
    }

    /**
     * @return the curTotal
     */
    public double getCurTotal()
    {
        return curTotal;
    }

    /**
     * @param curTotal the curTotal to set
     */
    public void setCurTotal(double curTotal)
    {
        this.curTotal = curTotal;
    }

    /**
     * @return the lastThreePayments
     */
    public String[] getLastThreePayments()
    {
        return lastThreePayments;
    }

    /**
     * @return the lastThreeDeposits
     */
    public String[] getLastThreeDeposits()
    {
        return lastThreeDeposits;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
}
