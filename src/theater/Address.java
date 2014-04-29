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
public class Address 
{
	private String street;		// Street of Address
	private String city;		// State of Address
	private String stateZip;	// Zip Code of Address

    public Address(String street, String city, String stateZip) {
        this.street = street;
        this.city = city;
        this.stateZip = stateZip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return street + "|" + city + "|" + stateZip;
    }

    /**
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * @return the stateZip
     */
    public String getStateZip()
    {
        return stateZip;
    }

    /**
     * @param stateZip the stateZip to set
     */
    public void setStateZip(String stateZip)
    {
        this.stateZip = stateZip;
    }
       
}
