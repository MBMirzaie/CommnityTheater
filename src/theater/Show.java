/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.io.*;
import java.util.*;

/**
 *
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 * @version 1                   
 * @since   3/20/2014
 */
public class Show 
{
	private Date showDate;          // Date of this show
        private List<Seat> boxSeats;    // Box seats for the show
        private List<Seat> regSeats;    // Regular seats for the show
	private int whichPlay;          // Which play attended by ID?
        private SHOWTIME showTime;        // Is this play a matinee?

    public Show(Date showDate, int boxSeats, int regSeats, int whichPlay, SHOWTIME showTime)
    {
        this.showDate = showDate;
        this.boxSeats = new ArrayList();
        this.regSeats = new ArrayList();
        this.whichPlay = whichPlay;
        this.showTime = showTime;
        double tmp1;
        tmp1 = this.getBoxSeatPrice();
        for(int i=0;i<boxSeats;i++)
            this.boxSeats.add(new Seat(tmp1));
        tmp1 = this.getRegSeatPrice();
        for(int i=0;i<regSeats;i++)
            this.regSeats.add(new Seat(tmp1));
        
    }
        
        /**
         * @return the regular seat price
         */
        private double getRegSeatPrice()
        {
            String tmp = new String();
            BufferedReader inPut;
            inPut = new BufferedReader(new InputStreamReader(System.in));

            System.out.printf("How much is the base price for your regular seats?  ");
            try
            {
                tmp = inPut.readLine();
            }
            catch(IOException ioe)
            {
                System.out.println("IO error trying to read line.");
                System.exit(1);
            }
            return Double.parseDouble(tmp);
        }
        /**
         * @return the box seat price
         */
        private double getBoxSeatPrice()
        {
            String tmp = new String();
            BufferedReader inPut;
            inPut = new BufferedReader(new InputStreamReader(System.in));

            System.out.printf("How much is the base price for your box seats?  ");
            try
            {
                tmp = inPut.readLine();
            }
            catch(IOException ioe)
            {
                System.out.println("IO error trying to read line.");
                System.exit(1);
            }
            return Double.parseDouble(tmp);
        }
        
        public int getBoxSeatAvailble()
        {
            int tmp = 0;
            for(Seat s:this.getBoxSeats())
            {
                if(s.getCustomer() == 0)
                    tmp++;
            }
            return tmp;
        }
        
        public boolean reserveBoxSeat(int pID)
        {
            for(Seat s:this.getBoxSeats())
            {
                if(s.getCustomer() == 0)
                {
                    s.setCustomer(pID);
                    return true;
                }
            }
            return false; 
        }
        public int getRegSeatAvailble()
        {
            int tmp = 0;
            for(Seat s:this.getRegSeats())
            {
                if(s.getCustomer() == 0)
                    tmp++;
            }
            return tmp;
        }
        
        public boolean reserveRegSeat(int pID)
        {
            for(Seat s:this.getRegSeats())
            {
                if(s.getCustomer() == 0)
                {
                    s.setCustomer(pID);
                    return true;
                }
            }
            return false; 
        }
    /**
     * @return the showDate
     */
    public Date getShowDate()
    {
        return showDate;
    }

    /**
     * @param showDate the showDate to set
     */
    public void setShowDate(Date showDate)
    {
        this.showDate = showDate;
    }

    /**
     * @return the whichPlay
     */
    public int getWhichPlay()
    {
        return whichPlay;
    }

    /**
     * @return the boxSeats
     */
    public List<Seat> getBoxSeats()
    {
        return boxSeats;
    }

    /**
     * @param boxSeats the boxSeats to set
     */
    public void setBoxSeats(List<Seat> boxSeats)
    {
        this.boxSeats = boxSeats;
    }

    /**
     * @return the regSeats
     */
    public List<Seat> getRegSeats()
    {
        return regSeats;
    }

    /**
     * @param regSeats the regSeats to set
     */
    public void setRegSeats(List<Seat> regSeats)
    {
        this.regSeats = regSeats;
    }

    /**
     * @param whichPlay the whichPlay to set
     */
    public void setWhichPlay(int whichPlay)
    {
        this.whichPlay = whichPlay;
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
}
