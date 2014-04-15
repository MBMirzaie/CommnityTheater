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
public class RentalItem extends Account
{
	private String itemName;		// Rental item name
	private double costToRent;		// How much it costs to rent per show

    /**
     * Items rented for the play
     * <P>
     * Create items to rent for the play and 
     * help keep track of costs.
     * <P>
     * @param itemName Set the item name
     * @param costToRent Set the cost to rent the item
     */
    public RentalItem(String itemName, double costToRent) {
        this.itemName = itemName;
        this.costToRent = costToRent;
    }

    /**
     * @return the item name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName Set the item name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the cost to rent the item
     */
    public double getCostToRent() {
        return costToRent;
    }

    /**
     * @param costToRent Set the cost to rent the item
     */
    public void setCostToRent(double costToRent) {
        this.costToRent = costToRent;
    }

    @Override
    public String toString()
    {
        return itemName + "|" + costToRent;
    }

}
