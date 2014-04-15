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
 */
public class Seat 
{
    private double price;   // Price of the seat
    private int customer;   // Who reserved this seat
    private boolean paid;   // Has it been paid for

    /**
     * 
     * @param price set the price of the seat
     */
    public Seat(double price)
    {
        this.price = price;
        this.customer = 0;
        this.paid = false;
    }

    /**
     * @return the seat price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * @param price set the seat price
     */
    public void setPrice(double price)
    {
        this.price = price;
    }

    /**
     * @return the customer who reserved this seat
     */
    public int getCustomer()
    {
        return customer;
    }

    /**
     * @param customer set the customer who reserved this seat
     */
    public void setCustomer(int customer)
    {
        this.customer = customer;
    }

    /**
     * @return whether the seat has been paid for
     */
    public boolean isPaid()
    {
        return paid;
    }

    /**
     * @param paid set whether the seat has been paid for
     */
    public void setPaid(boolean paid)
    {
        this.paid = paid;
    }
    
    
}
