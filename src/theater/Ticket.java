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
public class Ticket 
{
    private double price;
    private Date date;
    private SHOWTIME showTime;
    private int seatNumber;

    public Ticket(double price, Date date, SHOWTIME showTime, int seatNumber)
    {
        this.price = price;
        this.date = date;
        this.showTime = showTime;
        this.seatNumber = seatNumber;
    }

    /**
     * @return the price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price)
    {
        this.price = price;
    }

    /**
     * @return the date
     */
    public Date getDate()
    {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date)
    {
        this.date = date;
    }

    /**
     * @return the showTime
     */
    public SHOWTIME getShowTime()
    {
        return showTime;
    }

    /**
     * @param showTime the showTime to set
     */
    public void setShowTime(SHOWTIME showTime)
    {
        this.showTime = showTime;
    }

    /**
     * @return the seatNumber
     */
    public int getSeatNumber()
    {
        return seatNumber;
    }

    /**
     * @param seatNumber the seatNumber to set
     */
    public void setSeatNumber(int seatNumber)
    {
        this.seatNumber = seatNumber;
    }
    
}
