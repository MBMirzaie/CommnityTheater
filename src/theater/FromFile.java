/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Class to read files in specified format
 * 
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 */
public class FromFile 
{
    static private boolean Debug = true;
     /**
      * Data in file is for an Theater and Play.  Items are in the following order:
      * <P>
      * TheaterName
      * TheaterCurrentPlay
      * TheaterSeatFriSatEvePrice
      * TheaterSeatSatSunMatPercentOfFSEPrice
      * TheaterSeatSunEvePercentOfFSEPrice
      * TheaterNumberOfRegSeats
      * TheaterNumberOfBoxSeats
      * TheaterYearlyOperatingBudget
      * TheaterRentedItems //a list of items separated by commas on one line
      * TheaterBankAccountNumber
      * TheaterStaffIDs  //a list of staff and mgrs IDs separated by commas on one line
      * TheaterUpcomingShows  //a list of names separated by commas on one line
      * PlayTitle
      * PlayAuthor
      * PlayPubYear
      * PlayOpeningDay
      * PlayOpeningMonth
      * PlayOpeningYear
      * PlayIsWorldPremiere  //boolean
      * PlayRentalCost
      * PlayEndDay
      * PlayEndMonth
      * PlayEndYear
      * PlayTotalShows
      * PlayActorIDs  //a list of actor IDs separated by commas on one line
      * PlayDirectorID
      *
      * <P>
      * @return returns an newly initialized theater.
      */
    static public Theater readTheaterPlay()
    {

        Theater tmpTheater = null;
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Master\\Documents\\School\\2014 Spring CSE 1325-001\\Projects\\CommunityTheater\\src\\theater\\TheaterPlayIn"));
            String TheaterName = br.readLine();
            //if(Debug) System.out.printf("Theater name read: %s\n", TheaterName);
            String TheaterCurrentPlay = br.readLine();
            String TheaterSeatFriSatEvePrice = br.readLine();
            String TheaterSeatSatSunMatPercentOfFSEPrice = br.readLine();
            String TheaterSeatSunEvePercentOfFSEPrice = br.readLine();
            String TheaterNumberOfRegSeats = br.readLine();
            String TheaterNumberOfBoxSeats = br.readLine();
            String TheaterYearlyOperatingBudget = br.readLine();
            String TheaterRentedItems = br.readLine();
            String TheaterBankAccountNumber = br.readLine();
            String TheaterStaffIDs = br.readLine();                       // Skipped
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
            //if(Debug) System.out.printf("Theater created: %s\n", tmpTheater.getTheaterName());
            tmpTheater.setCurrentlyPlaying(TheaterCurrentPlay);
            tmpTheater.setUpComing(TheaterUpcomingShows);
            tmpTheater.setBoxSeats(Integer.parseInt(TheaterNumberOfBoxSeats));
            tmpTheater.setRegSeats(Integer.parseInt(TheaterNumberOfRegSeats));
            tmpTheater.setYearlyOperatingBudget(Double.parseDouble(TheaterYearlyOperatingBudget));
            tmpTheater.setFriSatEvePrice(Double.parseDouble(TheaterSeatFriSatEvePrice));
            tmpTheater.setSatSunMatPrice(tmpTheater.getFriSatEvePrice()*Double.parseDouble(TheaterSeatSatSunMatPercentOfFSEPrice));
            tmpTheater.setSunEvePrice(tmpTheater.getFriSatEvePrice()*Double.parseDouble(TheaterSeatSunEvePercentOfFSEPrice));
            //if(Debug) System.out.printf("Added Prices.\n");
            List<RentalItem> rentItems = new ArrayList();
            String[] items = TheaterRentedItems.split(", ");
            rentItems.add(new RentalItem(items[0],0));
            rentItems.add(new RentalItem(items[1],0));
            tmpTheater.setRentItems(rentItems);
            //if(Debug) System.out.printf("Added Rental Items.\n");
            tmpTheater.setAccountNumber(Integer.parseInt(TheaterBankAccountNumber));
            if(Debug) System.out.printf("Set Account Number.\n");
            Play tmpPlay = new Play(PlayTitle, PlayAuthor, Integer.parseInt(PlayPubYear), Boolean.parseBoolean(PlayIsWorldPremiere), Double.parseDouble(PlayRentalCost), ft.parse(PlayOpeningDay+"-"+PlayOpeningMonth+"-"+PlayOpeningYear),ft.parse(PlayEndDay+"-"+PlayEndMonth+"-"+PlayEndYear));
            if(Debug) System.out.printf("Initialized Play.\n");
            List<Play> plays = new ArrayList();
            if(Debug) System.out.printf("Made Plays.\n");
            plays.add(tmpPlay);
            if(Debug) System.out.printf("Added Play.\n");
            tmpTheater.setPlays(plays);
            if(Debug) System.out.printf("Added Plays.\n");
            tmpTheater.setManagers(FromFile.readManagers());
            tmpTheater.setStaff(FromFile.readStaff());
            tmpTheater.setActors(FromFile.readActors());
            tmpTheater.setInvestors(FromFile.readInvestors());
            tmpTheater.setDirectors(FromFile.readDirectors());
            tmpTheater.setAttendees(FromFile.readAttendees());
        }
        
        catch(Exception e)
        {
            System.out.printf("Error reading file into program, aborting.\n%s %s %s\n",e.getCause(),e.getMessage(),e.getStackTrace());
        }
        
        return tmpTheater;
    }
    /**
     * Data in file is for an TheaterManager.  
     * <P>
     * Items are one per line and are in the following order:
     * LastName
     * FirstName
     * IDNumber
     * Address
     * DayOfBirth
     * MonthOfBirth
     * YearOfBirth
     * DayOfHire
     * MonthOfHire
     * YearOfHire
     * BankAccountNumber
     * NumberOfStaffMembers
     * WeeklyPayRate
     * VacationWeeksTaken
     * DaysWorkedEachWeek
     * TotalWeeksInCurrentMonth
     * <P>
     * @return an array list of Managers
     */
    static public List<Manager> readManagers()
    {
        List<Manager> tmpList = new ArrayList();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Master\\Documents\\School\\2014 Spring CSE 1325-001\\Projects\\CommunityTheater\\src\\theater\\TheaterManagerIn"));
            String lastName = br.readLine();
            String firstName = br.readLine();
            int iDNumber = Integer.parseInt(br.readLine());
            String[] addr = br.readLine().split(", ");
            Address address = new Address(addr[0],addr[1],addr[2]);
            String dayOfBirth = br.readLine();
            String monthOfBirth = br.readLine();
            String yearOfBirth = br.readLine();
            Date dateOfBirth = ft.parse(dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
            String dayOfHire = br.readLine();
            String monthOfHire = br.readLine();
            String yearOfHire = br.readLine();
            Date dateOfHire = ft.parse(dayOfHire+"-"+monthOfHire+"-"+yearOfHire);
            int bankAccountNumber = Integer.parseInt(br.readLine());
            int numberOfStaffMembers = Integer.parseInt(br.readLine());
            double weeklyPayRate = Double.parseDouble(br.readLine());
            int vacationWeeksTaken = Integer.parseInt(br.readLine());
            String[] days = br.readLine().split(" ");
            DAYS[] DaysWorkedEachWeek = new DAYS[days.length];
            for(int i = 0;i<days.length;i++)
            {
                DaysWorkedEachWeek[i] = DAYS.valueOf(days[i]);
            }
            int totalWeeksInCurrentMonth = Integer.parseInt(br.readLine());
            Manager tmpMgr = new Manager(weeklyPayRate, vacationWeeksTaken, totalWeeksInCurrentMonth, DaysWorkedEachWeek, lastName, firstName, dateOfBirth, dateOfHire, address);
            tmpMgr.setAccountNumber(bankAccountNumber);
            tmpMgr.setpID(iDNumber);
            tmpMgr.setNumberOfStaffMembers(numberOfStaffMembers);
            tmpList.add(tmpMgr);
        }
        catch(Exception E)
        {
            System.out.println("Error reading Theater Managers file.");
            tmpList = new ArrayList();
            return tmpList;
        }
        
        return tmpList;
    }
    /**
     * Data in file is for Theater Staff.   
     * 
     * Items are one per line and are in the following order:
     * LastName
     * FirstName
     * IDNumber
     * Address
     * DayOfBirth
     * MonthOfBirth
     * YearOfBirth
     * DayOfHire
     * MonthOfHire
     * YearOfHire
     * BankAccountNumber
     * WorkPosition
     * PayPerHour
     * HoursWorkedPerWeek
     * DaysWorkedEachWeek
     * WeeksWorkedPerMonth
     * 
     * @return an array list of Staff Members
     */
    static public List<Staff> readStaff()
    {
        List<Staff> tmpList = new ArrayList();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Master\\Documents\\School\\2014 Spring CSE 1325-001\\Projects\\CommunityTheater\\src\\theater\\TheaterStaffIn"));
            String lastName;
            while((lastName=br.readLine())!=null && lastName.length()!=0)
            {
                String firstName = br.readLine();
                int iDNumber = Integer.parseInt(br.readLine());
                String[] addr = br.readLine().split(", ");
                Address address = new Address(addr[0],addr[1],addr[2]);
                String dayOfBirth = br.readLine();
                String monthOfBirth = br.readLine();
                String yearOfBirth = br.readLine();
                Date dateOfBirth = ft.parse(dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
                String dayOfHire = br.readLine();
                String monthOfHire = br.readLine();
                String yearOfHire = br.readLine();
                Date dateOfHire = ft.parse(dayOfHire+"-"+monthOfHire+"-"+yearOfHire);
                int bankAccountNumber = Integer.parseInt(br.readLine());
                POSITION workPosition = POSITION.valueOf(br.readLine());
                double payPerHour = Double.parseDouble(br.readLine());
                int hoursWorkedPerWeek = Integer.parseInt(br.readLine());
                String[] days = br.readLine().split(" ");
                DAYS[] DaysWorkedEachWeek = new DAYS[days.length];
                for(int i = 0;i<days.length;i++)
                {
                    DaysWorkedEachWeek[i] = DAYS.valueOf(days[i]);
                }
                double weeksWorkedPerMonth = Double.parseDouble(br.readLine());
                Staff tmpStaff = new Staff(workPosition, hoursWorkedPerWeek, weeksWorkedPerMonth, payPerHour, lastName, firstName, dateOfBirth, dateOfHire, address);
                tmpStaff.setAccountNumber(bankAccountNumber);
                tmpStaff.setpID(iDNumber);
                tmpStaff.setDays(DaysWorkedEachWeek);
                tmpList.add(tmpStaff);
            }
        }
        catch(Exception E)
        {
            System.out.println("Error reading Theater Managers file.");
            tmpList = new ArrayList();
            return tmpList;
        }
        
        return tmpList;
    }
    /**
     * Data in file is for an Actor.  
     * <P>
     * Items are one per line and are in the following order:
     * LastName
     * FirstName
     * IDNumber
     * Address
     * DayOfBirth
     * MonthOfBirth
     * YearOfBirth
     * DayOfHire
     * MonthOfHire
     * YearOfHire
     * BankAccountNumber
     * PlayName
     * PayPerHour
     * MemberOfActorsEquity  // boolean
     * Role
     * HoursWorkedPerWeek
     * <P>
     * @return an array list of Actors
     */
    static public List<Actor> readActors()
    {
        List<Actor> tmpList = new ArrayList();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Master\\Documents\\School\\2014 Spring CSE 1325-001\\Projects\\CommunityTheater\\src\\theater\\ActorsIn"));
            String lastName;
            while((lastName=br.readLine())!=null && lastName.length()!=0)
            {
                String firstName = br.readLine();
                int iDNumber = Integer.parseInt(br.readLine());
                String[] addr = br.readLine().split(", ");
                Address address = new Address(addr[0],addr[1],addr[2]);
                String dayOfBirth = br.readLine();
                String monthOfBirth = br.readLine();
                String yearOfBirth = br.readLine();
                Date dateOfBirth = ft.parse(dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
                String dayOfHire = br.readLine();
                String monthOfHire = br.readLine();
                String yearOfHire = br.readLine();
                Date dateOfHire = ft.parse(dayOfHire+"-"+monthOfHire+"-"+yearOfHire);
                int bankAccountNumber = Integer.parseInt(br.readLine());
                String playName = br.readLine();
                double payPerHour = Double.parseDouble(br.readLine());
                boolean memberOfActorsEquity = Boolean.parseBoolean(br.readLine());
                String role = br.readLine();
                int hoursWorkedPerWeek = Integer.parseInt(br.readLine());
                Actor tmpAct = new Actor(hoursWorkedPerWeek, playName, role, payPerHour, memberOfActorsEquity, lastName, firstName, dateOfBirth, dateOfHire, address);
                tmpAct.setpID(iDNumber);
                tmpAct.setAccountNumber(bankAccountNumber);
                tmpList.add(tmpAct);
            }
        }
        catch(Exception E)
        {
            System.out.println("Error reading Theater Managers file.");
            tmpList = new ArrayList();
            return tmpList;
        }
        
        return tmpList;
    }
    /**
     * Data in file is for a Director.  
     * <P>
     * Items are one per line and are in the following order:
     * LastName
     * FirstName
     * IDNumber
     * Address
     * DayOfBirth
     * MonthOfBirth
     * YearOfBirth
     * DayOfHire
     * MonthOfHire
     * YearOfHire
     * BankAccountNumber
     * PlayName
     * PayPerHour
     * MemberOfActorsEquity  // boolean
     * UpfrontFee
     * PercentageOfHours
     * HoursWorkedPerWeek
     * 
     * @return an array list of Directors
     */
    static public List<Director> readDirectors()
    {
        List<Director> tmpList = new ArrayList();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Master\\Documents\\School\\2014 Spring CSE 1325-001\\Projects\\CommunityTheater\\src\\theater\\DirectorsIn"));
            String lastName = br.readLine();
            String firstName = br.readLine();
            int iDNumber = Integer.parseInt(br.readLine());
            String[] addr = br.readLine().split(", ");
            Address address = new Address(addr[0],addr[1],addr[2]);
            String dayOfBirth = br.readLine();
            String monthOfBirth = br.readLine();
            String yearOfBirth = br.readLine();
            Date dateOfBirth = ft.parse(dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
            String dayOfHire = br.readLine();
            String monthOfHire = br.readLine();
            String yearOfHire = br.readLine();
            Date dateOfHire = ft.parse(dayOfHire+"-"+monthOfHire+"-"+yearOfHire);
            int bankAccountNumber = Integer.parseInt(br.readLine());
            String playName = br.readLine();
            double payPerHour = Double.parseDouble(br.readLine());
            boolean memberOfActorsEquity = Boolean.parseBoolean(br.readLine());
            double upfrontFee = Double.parseDouble(br.readLine());
            double percentageOfHours = Double.parseDouble(br.readLine())/100;
            int hoursWorkedPerWeek = Integer.parseInt(br.readLine());
            Director tmpDir = new Director(playName, payPerHour, memberOfActorsEquity, upfrontFee, percentageOfHours, hoursWorkedPerWeek, lastName, firstName, dateOfBirth, dateOfHire, address);
            tmpDir.setAccountNumber(bankAccountNumber);
            tmpDir.setpID(iDNumber);
            tmpList.add(tmpDir);
            
        }
        catch(Exception E)
        {
            System.out.println("Error reading Theater Managers file.");
            tmpList = new ArrayList();
            return tmpList;
        }
        
        return tmpList;
    }
    /**
     * Data in file is for an Investor.  
     * <P>
     * Items are one per line and are in the following order:
     * LastName
     * FirstName
     * IDNumber
     * Address
     * DayOfBirth
     * MonthOfBirth
     * YearOfBirth
     * DayOfHire
     * MonthOfHire
     * YearOfHire
     * BankAccountNumber
     * AmountsInvested
     * TicketsReceived
     * PercentageOfHouse
     * <P>
     * @return an array list of Investors
     */
    static public List<Investor> readInvestors()
    {
        List<Investor> tmpList = new ArrayList();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Master\\Documents\\School\\2014 Spring CSE 1325-001\\Projects\\CommunityTheater\\src\\theater\\InvestorsIn"));
            String lastName = br.readLine();
            String firstName = br.readLine();
            int iDNumber = Integer.parseInt(br.readLine());
            String[] addr = br.readLine().split(", ");
            Address address = new Address(addr[0],addr[1],addr[2]);
            String dayOfBirth = br.readLine();
            String monthOfBirth = br.readLine();
            String yearOfBirth = br.readLine();
            Date dateOfBirth = ft.parse(dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
            String dayOfHire = br.readLine();
            String monthOfHire = br.readLine();
            String yearOfHire = br.readLine();
            Date dateOfHire = ft.parse(dayOfHire+"-"+monthOfHire+"-"+yearOfHire);
            int bankAccountNumber = Integer.parseInt(br.readLine());
            double amountsInvested = Double.parseDouble(br.readLine());
            int ticketsReceived = Integer.parseInt(br.readLine());
            double percentageOfHouse = Double.parseDouble(br.readLine());
            Investor tmpInv = new Investor(amountsInvested, ticketsReceived, percentageOfHouse, lastName, firstName, dateOfBirth, dateOfHire, address);
            tmpInv.setAccountNumber(bankAccountNumber);
            tmpInv.setpID(iDNumber);
            tmpList.add(tmpInv);
        }
        catch(Exception E)
        {
            System.out.println("Error reading Investors file.");
            tmpList = new ArrayList();
            return tmpList;
        }
        
        return tmpList;
    }
    /**
     * Data in file is for an Attendee.  
     * 
     * Items are one per line and are in the following order:
     * LastName
     * FirstName
     * IDNumber
     * Address
     * DayOfBirth
     * MonthOfBirth
     * YearOfBirth
     * DayOfHire
     * MonthOfHire
     * YearOfHire
     * BankAccountNumber
     * AttendingWhichPlay
     * TicketPriceCategory  //Cost of one ticket in the chosen type of seats
     * NumberOfTickets
     * DayOfShow
     * MonthOfShow
     * YearOfShow
     * ShowLetter    //E for evening or M for matinee
     * 
     * 
     * @return an array list of Attendees
     */
    static public List<Customer> readAttendees()
    {
        List<Customer> tmpList = new ArrayList();
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Master\\Documents\\School\\2014 Spring CSE 1325-001\\Projects\\CommunityTheater\\src\\theater\\AttendeesIn"));
            String lastName = br.readLine();
            String firstName = br.readLine();
            int iDNumber = Integer.parseInt(br.readLine());
            String[] addr = br.readLine().split(", ");
            Address address = new Address(addr[0],addr[1],addr[2]);
            String dayOfBirth = br.readLine();
            String monthOfBirth = br.readLine();
            String yearOfBirth = br.readLine();
            Date dateOfBirth = ft.parse(dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
            String dayOfHire = br.readLine();
            String monthOfHire = br.readLine();
            String yearOfHire = br.readLine();
            Date dateOfHire = ft.parse(dayOfHire+"-"+monthOfHire+"-"+yearOfHire);
            int bankAccountNumber = Integer.parseInt(br.readLine());
            Customer tmpCust = new Customer(lastName,firstName,dateOfBirth,dateOfHire,address);
            tmpCust.setpID(iDNumber);
            tmpCust.setAccountNumber(bankAccountNumber);
            tmpList.add(tmpCust);
        }
        catch(Exception E)
        {
            System.out.println("Error reading Attendees file.");
            tmpList = new ArrayList();
            return tmpList;
        }
        
        return tmpList;
    }
}
