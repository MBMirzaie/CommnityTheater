/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.io.*;
import java.util.*;

/**
 * Class to read files in specified format
 * 
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 */
public class fileReader {

    static public Theater readTheaterPlay()
    {
        /**
        Data in file is for an Theater and Play.  Items are in the following order:

        TheaterName
        TheaterCurrentPlay
        TheaterSeatFriSatEvePrice
        TheaterSeatSatSunMatPercentOfFSEPrice
        TheaterSeatSunEvePercentOfFSEPrice
        TheaterNumberOfRegSeats
        TheaterNumberOfBoxSeats
        TheaterYearlyOperatingBudget
        TheaterRentedItems //a list of items separated by commas on one line
        TheaterBankAccountNumber
        TheaterStaffIDs  //a list of staff and mgrs IDs separated by commas on one line
        TheaterUpcomingShows  //a list of names separated by commas on one line
        PlayTitle
        PlayAuthor
        PlayPubYear
        PlayOpeningDay
        PlayOpeningMonth
        PlayOpeningYear
        PlayIsWorldPremiere  //boolean
        PlayRentalCost
        PlayEndDay
        PlayEndMonth
        PlayEndYear
        PlayTotalShows
        PlayActorIDs  //a list of actor IDs separated by commas on one line
        PlayDirectorID

        You may remove this commented header from the test file when you use it with your program.
        */
        Theater tmpTheater = null;
        try{
            File file = new File("TheaterPlay");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String TheaterName = br.readLine();
            String TheaterCurrentPlay = br.readLine();
            String TheaterSeatFriSatEvePrice = br.readLine();
            String TheaterSeatSatSunMatPercentOfFSEPrice = br.readLine();
            String TheaterSeatSunEvePercentOfFSEPrice = br.readLine();
            String TheaterNumberOfRegSeats = br.readLine();
            String TheaterNumberOfBoxSeats = br.readLine();
            String TheaterYearlyOperatingBudget = br.readLine();
            String TheaterRentedItems = br.readLine();
            String TheaterBankAccountNumber = br.readLine();
            String TheaterStaffIDs = br.readLine();
            String TheaterUpcomingShows = br.readLine();
            String PlayTitle = br.readLine();
            String PlayAuthor = br.readLine();
            String PlayPubYear = br.readLine();
            String PlayOpeningDay = br.readLine();
            String PlayOpeningMonth = br.readLine();
            String PlayOpeningYear = br.readLine();
            String PlayIsWorldPremiere = br.readLine();
            String PlayRentalCost = br.readLine();
            String PlayEndDay = br.readLine();
            String PlayEndMonth = br.readLine();
            String PlayEndYear = br.readLine();
            String PlayTotalShows = br.readLine();
            String PlayActorIDs = br.readLine();
            String PlayDirectorID = br.readLine();

            tmpTheater = new Theater(TheaterName,0);
            tmpTheater.setBoxSeats(Integer.parseInt(TheaterNumberOfBoxSeats));
            tmpTheater.setRegSeats(Integer.parseInt(TheaterNumberOfRegSeats));
            tmpTheater.setYearlyOperatingBudget(Double.parseDouble(TheaterYearlyOperatingBudget));
            tmpTheater.setFriSatEvePrice(Double.parseDouble(TheaterSeatFriSatEvePrice));
            tmpTheater.setSatSunMatPrice(tmpTheater.getFriSatEvePrice()*Double.parseDouble(TheaterSeatSatSunMatPercentOfFSEPrice));
            tmpTheater.setSunEvePrice(tmpTheater.getFriSatEvePrice()*Double.parseDouble(TheaterSeatSunEvePercentOfFSEPrice));
            List<RentalItem> rentItems = new ArrayList<RentalItem>();
            String[] items = TheaterRentedItems.split(", ");
            rentItems.add(new RentalItem(items[0],0));
            rentItems.add(new RentalItem(items[1],0));
            tmpTheater.setRentItems(rentItems);
            
            
            
        }
        catch(Exception e)
        {
            System.out.println("Error reading file into program, aborting.");
        }
        return tmpTheater;
    }
}
