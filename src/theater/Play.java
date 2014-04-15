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

public class Play 
{
	private String name;			// Name of the Play
	private String author;			// Author of Play
	private int yearPublished;		// Year Play was published
	private boolean WorldPremier;		// Is this the world premier for the play?
	private double playRental;		// Cost per show to rent play
        private int pID;                        // Unique ID for the play
        private static int iDPool = 0;          // Play ID Pool
        

    /**
     * Play constructor
     * <P>
     * Create a play using the constructor.
     * ID is automatically generated.
     * <P>
     * @param name set the name of the play
     * @param playRental set the cost per show to rent the play
     * @param WorldPremier set whether or not this it the play's World Premier
     * @param yearPublished set the year the play was published
     * @param author set the author of the play
     */
    public Play(String name, String author, int yearPublished, boolean WorldPremier, double playRental) 
    {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.WorldPremier = WorldPremier;
        this.playRental = playRental;
        Play.iDPool++;
        pID = iDPool;
        
    }
    
    /**
     * Play copy constructor
     * @param play 
     */
    public Play(Play play)
    {
        this.name = play.getName();
        this.author = play.getAuthor();
        this.yearPublished = play.getYearPublished();
        this.WorldPremier = play.isWorldPremier();
        this.playRental = play.getPlayRental();
        this.pID = play.getpID();
    }

    /**
     * @return the name of the play
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name set the name of the play
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the author of the play
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * @param author set the author of the play
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }

    /**
     * @return the year the play was published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * @param yearPublished set the year the play was published
     */
    public void setYearPublished(int yearPublished)
    {
        this.yearPublished = yearPublished;
    }

    /**
     * @return whether or not this it the play's World Premier
     */
    public boolean isWorldPremier()
    {
        return WorldPremier;
    }

    /**
     * @param WorldPremier set whether or not this it the play's World Premier
     */
    public void setWorldPremier(boolean WorldPremier)
    {
        this.WorldPremier = WorldPremier;
    }

    /**
     * @return the cost per show to rent the play
     */
    public double getPlayRental()
    {
        return playRental;
    }

    /**
     * @param playRental set the cost per show to rent the play
     */
    public void setPlayRental(double playRental)
    {
        this.playRental = playRental;
    }

    @Override
    public String toString()
    {
        return pID + "|" + name + "|" + author + "|" + yearPublished + "|" + WorldPremier + "|" + playRental;
    }

    /**
     * @return the unique play ID
     */
    public int getpID()
    {
        return pID;
    }

    
}
