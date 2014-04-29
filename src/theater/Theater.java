/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theater;

import java.io.*;
import java.text.*;
import java.util.*;

/**
 *
 * @author Marcus Mirzaie <marcus.mirzaie@mavs.uta.edu>
 * @version 1                   
 * @since   3/15/2014
 */
public class Theater extends Account
{
    
    private String theaterName;             // The name of your theater
    private double rentalCost;              // If the theater is rented, the monthly cost to rent
    private List<Play> plays;               // List of plays
    private String currentlyPlaying;        // The play that is currently playing
    private String upComing;                // Upcoming plays
    private int boxSeats;                   // How many box seats in the theater
    private int regSeats;                   // How many regular seats in the theater
    private double yearlyOperatingBudget;   // Yearly operating budget
    private List<Show> shows;               // The shows on the schedule
    private List<Customer> attendees;       // List of paying customers
    private List<Actor> actors;             // List of actors
    private List<Director> directors;       // List of directors
    private List<Manager> managers;         // List of managers
    private List<Staff> staff;              // List of staff members
    private List<Investor> investors;       // List of investors
    private int currentMenu;                // Which menu to display options for
    private List<RentalItem> rentItems;     // Items rented for shows

    public List<Actor> getActors()
    {
        return actors;
    }

    public void setActors(List<Actor> actors)
    {
        this.actors = actors;
    }

    public List<Director> getDirectors()
    {
        return directors;
    }

    public void setDirectors(List<Director> directors)
    {
        this.directors = directors;
    }

    public List<Manager> getManagers()
    {
        return managers;
    }

    public void setManagers(List<Manager> managers)
    {
        this.managers = managers;
    }

    public List<Staff> getStaff()
    {
        return staff;
    }

    public void setStaff(List<Staff> staff)
    {
        this.staff = staff;
    }

    public List<Investor> getInvestors()
    {
        return investors;
    }

    public void setInvestors(List<Investor> investors)
    {
        this.investors = investors;
    }

    public List<RentalItem> getRentItems()
    {
        return rentItems;
    }

    public void setRentItems(List<RentalItem> rentItems)
    {
        this.rentItems = rentItems;
    }
    private double friSatEvePrice;
    private double sunEvePrice;
    private double satSunMatPrice;


    /**
     * 
     * @param theaterName set the theater name
     * @param rentalCost set the rental cost (include utilities)
     */
    public Theater(String theaterName, double rentalCost)
    {
        this.theaterName            = theaterName;
        this.rentalCost             = rentalCost;
        this.plays                  = new ArrayList();
        this.currentlyPlaying       = "";
        this.upComing               = "";
        this.boxSeats               = 0;
        this.regSeats               = 0;
        this.yearlyOperatingBudget  = 0;
        this.shows                  = new ArrayList();
        this.attendees              = new ArrayList();
        this.actors                 = new ArrayList();
        this.directors              = new ArrayList();
        this.managers               = new ArrayList();
        this.staff                  = new ArrayList();
        this.investors              = new ArrayList();
        this.currentMenu            = 0;
        this.rentItems              = new ArrayList();
    }
    public Theater(Theater theter)
    {
        this.theaterName            = theter.getTheaterName();
        this.rentalCost             = theter.getRentalCost();
        this.plays                  = theter.getPlays();
        this.currentlyPlaying       = theter.getCurrentlyPlaying();
        this.upComing               = theter.getUpComing();
        this.boxSeats               = theter.getBoxSeats();
        this.regSeats               = theter.getRegSeats();
        this.yearlyOperatingBudget  = theter.getYearlyOperatingBudget();
        this.shows                  = theter.getShows();
        this.attendees              = theter.getAttendees();
        this.actors                 = theter.getActors();
        this.directors              = theter.getDirectors();
        this.managers               = theter.getManagers();
        this.staff                  = theter.getStaff();
        this.investors              = theter.getInvestors();
        this.currentMenu            = 0;
        this.rentItems              = theter.getRentItems();
    }
    /**
     * @return the theater name
     */
    public String getTheaterName()
    {
        return theaterName;
    }

    /**
     * @param theaterName set the theater name
     */
    public void setTheaterName(String theaterName)
    {
        this.theaterName = theaterName;
    }

    /**
     * @return the cost to rent the theater (includes utilities)
     */
    public double getRentalCost()
    {
        return rentalCost;
    }

    /**
     * @param rentalCost the cost to rent the theater (include utilities)
     */
    public void setRentalCost(double rentalCost)
    {
        this.rentalCost = rentalCost;
    }

    /**
     * @return what plays will be showing
     */
    public List<Play> getShowingPlay()
    {
        return getPlays();
    }

    /**
     * @param plays set what play will be showing
     */
    public void setPlays(List<Play> plays)
    {
        this.plays = plays;
    }

    /**
     * @return the paying customers array
     */
    public List<Customer> getAttendees()
    {
        return attendees;
    }

    /**
     * @param attendees set the paying customers away
     */
    public void setAttendees(List<Customer> attendees)
    {
        this.attendees = attendees;
    }

    // Information gathering functions
    
    public void getTheaterInformation()
    {
        this.setBoxSeats(Theater.getInt("How many box seats does your theater have?  "));
        this.setRegSeats(Theater.getInt("How many regular seats does your theater have?  "));
        this.setYearlyOperatingBudget(Theater.getDouble("How much is the theater's yearly operating budget?  "));
    }
    public void addPlay()
    {
        String name;
        String author;
        int yearPublished;
        boolean WorldPremier;
        double playRental;
        Date openingDate, closingDate;
        name = Theater.getString("Please enter the play name:  ");
        author = Theater.getString("Please enter the play author:  ");
        yearPublished = Theater.getInt("Please enter the year the play was published (yyyy):  ");
        WorldPremier = Theater.getString("Please enter the if this the play's world premier(y/n):  ").startsWith("y");
        playRental = Theater.getDouble("Please enter the cost to rent the play (####.##):  ");
        openingDate = Theater.getDate("Please enter the opening date of he play:  ");
        closingDate = Theater.getDate("Please enter the closeing date of he play:  ");
        this.getPlays().add(new Play(name, author, yearPublished, WorldPremier, playRental, openingDate, closingDate));
        this.setCurrentMenu(2);
    }
    
    // Menus
    public void printMenu(int myMenu)
    {
        this.setCurrentMenu(myMenu);
        this.printMenu();
    }
    public boolean printMenu()
    {
        switch(currentMenu)
        {
            case 0:     // mainMenu
                this.mainMenu();
                break;
            case 1:     // mainMenu 1
                this.empMenu();
                break;
            case 2:     // mainMenu 2
                this.addPSIMenu();
                break;
            case 3:     // mainMenu 3
                this.reserveMenu();
                break;
            case 4:     // mainMenu 4
                this.acctMenu();
                break;
            case 5:     // mainMenu 5
                this.reportsMenu();
                break;
            case 6:     // exit program
                return false;               
            case 7:     // empMenu 1 
                this.hireActor();
                break;
            case 8:     // empMenu 2
                this.hireDirector();
                break;
            case 9:     // empMenu 3
                this.fireActor();
                break;
            case 10:     // empMenu 4
                this.setCurrentMenu(0);
                break;
            case 11:    // psiMenu 1
                this.addPlay();
                break;
            case 12:    // psiMenu 2
                this.addShow();
                break;
            case 13:    // psiMenu 3
                this.addItem();
                break;
            case 14:    // psiMenu 4
                this.setCurrentMenu(0);
                break;
            case 15:    // reserveMenu 1
                this.addCustomer();
                break;
            case 16:    // reserveMenu 2
                this.reserveSeat();
                break;
            case 17:    // reserveMenu 3
                this.setCurrentMenu(0);
                break;
            default:
                this.setCurrentMenu(0);
        }
        return true;
    }
    public void mainMenu()
    {
        String menu;
        menu = "MAIN: Please choose from the follwoing options:\n" +
                "  1) Manage Employees\n" +
                "  2) Manage Play/Show/Item\n" +
                "  3) Manage Customers/Reservations\n" +
                "  4) Accounting\n" +
                "  5) Reports\n" +
                "  6) Exit\n";
        this.setCurrentMenu(Theater.getInt(menu));
    }
    public void empMenu()
    {
        String menu;
        menu = "Please choose from one of the following options:\n" +
                "  1) Hire an Employee\n" +
                "  2) Fire an Employee\n" +
                "  3) Pay an Employee\n" +
                "  4) Main Menu\n";
        int tmp1 = Theater.getInt(menu);
        this.setCurrentMenu((tmp1 <= 0)?1:tmp1+6);
    }
    public void addPSIMenu()
    {
        String menu;
        menu = "Please choose from one of the following options:\n" +
                "  1) Add a Play\n" +
                "  2) Add a Show\n" +
                "  3) Add a Rental Item\n" +
                "  4) Main Menu\n";
        int tmp1 = Theater.getInt(menu);
        this.setCurrentMenu((tmp1 <= 0)?1:tmp1+10);
    }
    public void reserveMenu()
    {
        String menu;
        menu = "Please choose from one of the following options:\n" +
               "  1) Add Customer\n" +
               "  2) Make Reservation\n" +
               "  3) Main Menu\n";
        int tmp1 = Theater.getInt(menu);
        this.setCurrentMenu((tmp1 <= 0)?1:tmp1+14);
    }
    public void reportsMenu()
    {
        String menu;
        menu = "Please choose from one of the following options:\n" +
               "  1) A Customer\n" +
               "  2) An Employee\n" +
               "  3) A Play\n" +
               "  4) All Customers\n" +
               "  5) All Employees\n" +
               "  6) All Play\n" +
               "  7) Theater";
        int tmp1 = Theater.getInt(menu);
        this.setCurrentMenu((tmp1 <= 0)?1:tmp1+14);       
    }
    public void hireEmployeeMenu()
    {
        String menu;
        menu = "Please choose from one of the following options:\n" +
               "  1) Hire Actor\n" +
               "  2) Hire Director\n" +
               "  3) Hire Manager\n" +
               "  4) Hire Staff\n" +
               "  5) Main Menu\n";
        int tmp1 = Theater.getInt(menu);
        this.setCurrentMenu((tmp1 <= 0)?1:tmp1+14);
    }
    public void fireEmployeeMenu()
    {
        String menu;
        menu = "Please choose from one of the following options:\n" +
               "  1) Fire Actor\n" +
               "  2) Fire Director\n" +
               "  3) Fire Manager\n" +
               "  4) Fire Staff\n" +
               "  5) Main Menu\n";
        int tmp1 = Theater.getInt(menu);
        this.setCurrentMenu((tmp1 <= 0)?1:tmp1+14);
    }   
    public void payEmployeeMenu()
    {
        String menu;
        menu = "Please choose from one of the following options:\n" +
               "  1) Pay Actor\n" +
               "  2) Pay Director\n" +
               "  3) Pay Manager\n" +
               "  4) Pay Staff\n" +
               "  5) Pay Employees\n" +
               "  6) Main Menu\n";
        int tmp1 = Theater.getInt(menu);
        this.setCurrentMenu((tmp1 <= 0)?1:tmp1+14);
    }        
    public void addItem()
    {
        String tmp; double tmp2;
        tmp = Theater.getString("Please enter the name of the item to add.");
        tmp2 = Theater.getDouble("Please enter the cost per show to rent this item.");
        this.rentItems.add(new RentalItem(tmp,tmp2));
        this.setCurrentMenu(2);
    }
    public void acctMenu()
    {
       System.out.println("Not yet implemented.");
       this.setCurrentMenu(0);
    }
    public void hireActor()
    {
        if(this.getPlays().isEmpty())
        {
            System.out.println("Please enter a play before trying to hire an actor.");
            this.setCurrentMenu(1);
            return;
        }
        String roleName, hiredWhichPlay, lastName, firstName, street, city, stateZip; 
        int hoursWorkedPerWeek;
        double payScalePerHour;
        boolean actorsEquity; Date dateOfBirth, hireDate; Address address;
        firstName = Theater.getString("Please enter the Actor/Actress's first name:  ");
        lastName = Theater.getString("Please enter the Actor/Actress's last name:  ");
        dateOfBirth = Theater.getDate("Please enter the Actor/Actress's date of birth (mm-dd-yyyy):  ");
        hireDate = Theater.getDate("Please enter the Actor/Actress's hire date (mm-dd-yyyy):  ");
        street = Theater.getString("Please enter the Actor/Actress's street address:  ");
        city = Theater.getString("Please enter the Actor/Actress's city:  "      );
        stateZip = Theater.getString("Please enter the Actor/Actress's state and zip code ('NY 11001'):  ");
        address = new Address(street, city, stateZip);
        actorsEquity = Theater.getString("Does this Actor/Actress's have actor's equity (y/n)?  ").startsWith("y");
        payScalePerHour = Theater.getDouble("Please enter the Actor/Actress's pay per hour:  ");
        hiredWhichPlay = Theater.getString("Please enter which play the Actor/Actress's was hired:  ");
        roleName = Theater.getString("Please enter the Actor/Actress's role name:  ");
        hoursWorkedPerWeek = Theater.getInt("Please enter number of hours the Actor/Actress works per week:  ");

        actors.add(new Actor(hoursWorkedPerWeek, hiredWhichPlay, roleName, payScalePerHour, actorsEquity, lastName, firstName, dateOfBirth, hireDate, address));
        this.setCurrentMenu(1);
    }
    public void hireDirector()
    {
        System.out.println("Directors no implemented yet.");
        this.setCurrentMenu(1);
    }
    public void fireManager()
    {
        System.out.printf("Please confirm which Manager to fire:\n");
        for(Manager d:managers)
        {
            if(Theater.getString(String.format("%s %s(y/n):  ",d.getFirstName(),d.getLastName())).startsWith("y")) 
            {   
                
                managers.remove(d);
                break;
            }   
        }
        this.setCurrentMenu(1);
    }
    public void fireStaff()
    {
        System.out.printf("Please confirm which actor/actress to fire:\n");
        for(Staff d:staff)
        {
            if(Theater.getString(String.format("%s %s(y/n):  ",d.getFirstName(),d.getLastName())).startsWith("y")) 
            {
                staff.remove(d);
                break;
            }   
        }
        this.setCurrentMenu(1);
    }
    public void fireActor()
    {
        System.out.printf("Please confirm which actor to fire:\n");
        for(Actor d:actors)
        {
            if(Theater.getString(String.format("%s %s(y/n):  ",d.getFirstName(),d.getLastName())).startsWith("y")) 
            {
                actors.remove(d);
                break;
            }   
        }
        this.setCurrentMenu(1);
    }
    public void fireDirector()
    {
        System.out.printf("Please confirm which director to fire:\n");
        for(Director d:directors)
        {
            if(Theater.getString(String.format("%s %s(y/n):  ",d.getFirstName(),d.getLastName())).startsWith("y")) 
            {
                directors.remove(d);
                break;
            }   
        }
        this.setCurrentMenu(1);
    }

    
    static public String getString(String question)
    {
        String tmp = null;
        BufferedReader inPut;
        inPut = new BufferedReader(new InputStreamReader(System.in));
        while (tmp == null)
        {
            System.out.printf(question);
            try
            {
                tmp = inPut.readLine();
            }
            catch(IOException ioe)
            {
                System.out.println("Error reading line.");
                tmp = null;
            }
        }
        
        return tmp;
    }
    static public Date getDate(String question)
    {
        Date tmpDate = null;
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy"); 
        while (tmpDate == null)
        {
            try
            {
                tmpDate = ft.parse(Theater.getString(question));
            }
            catch(ParseException e)
            {
                System.out.println("Bad date entered.");
                tmpDate = null;
            }
        }
        return tmpDate;
    }
    static public int getInt(String question)
    {
        int tmp2 = -1;
        while(tmp2 < 0)
        {
            try
            {
                tmp2 = Integer.parseInt(Theater.getString(question));
            }
            catch(NumberFormatException e)
            { 
                System.out.println("Invalid choice.");
            }
        }
        return tmp2;
    }
    static public double getDouble(String question)
    {
        double tmp2 = -1;
        while(tmp2 < 0)
        {
            try
            {
                tmp2 = Double.parseDouble(Theater.getString(question));
            }
            catch(NumberFormatException e)
            { 
                System.out.println("Invalid choice.");
                tmp2 = -1;
            }
        }
        return tmp2;
    }
    public String findPlayByID(int id)
    {
        if(this.getPlays().isEmpty()) 
        {
            System.out.println("No plays to find.");
            return null;
        }

        for(int i=0;i<this.getPlays().size();i++) 
        {
            if(this.getPlays().get(i).getpID() == id) 
            {
                return this.getPlays().get(i).getName();
            }
        }
        System.out.println("Play not found.");
        return null;
    }
    public int findPlayByName(String name)
    {
        if(this.getPlays().isEmpty()) 
        {
            System.out.println("No plays to find.");
            return 0;
        }

        for(int i=0;i<this.getPlays().size();i++) 
        {
            if(this.getPlays().get(i).getName().contentEquals(name)) 
            {
                return this.getPlays().get(i).getpID();
            }
        }
        System.out.println("Play not found.");
        return 0;
    }
    public int findCustomerByName(String name)
    {
        if(this.attendees.isEmpty()) 
        {
            System.out.println("No customers to find.");
            return 0;
        }

        for(int i=0;i<this.attendees.size();i++) 
        {
            if((this.attendees.get(i).getFirstName() + " " + this.attendees.get(i).getLastName()).contentEquals(name)) 
            {
                return this.attendees.get(i).getpID();
            }
        }
        System.out.println("Customer not found.");
        return 0;
    }
    public Customer findCustomerByID(int id)
    {
        if(this.attendees.isEmpty()) 
        {
            System.out.println("No customers to find.");
            return null;
        }

        for(int i=0;i<this.attendees.size();i++) 
        {
            if(this.attendees.get(i).getpID() == id) 
            {
                return this.attendees.get(i);
            }
        }
        System.out.println("Customer not found.");
        return null;
    }
    public void hireManager()
    {
        String lastName, firstName, street, city, stateZip; 
        int vacationWeeksTakenInMonth;
        double weeklyPayRate, totalWeeksThisMonth;
        Date dateOfBirth, hireDate; Address address;
        firstName = Theater.getString("Please enter the Manager's first name:  ");
        lastName = Theater.getString("Please enter the Manager's last name:  ");
        dateOfBirth = Theater.getDate("Please enter the Manager's date of birth (mm-dd-yyyy):  ");
        hireDate = Theater.getDate("Please enter the Manager's hire date (mm-dd-yyyy):  ");
        street = Theater.getString("Please enter the Manager's street address:  ");
        city = Theater.getString("Please enter the city:  "      );
        stateZip = Theater.getString("Please enter the state and zip code ('NY 11001'):  ");
        address = new Address(street, city, stateZip);
        weeklyPayRate = Theater.getDouble("Please enter the Manager's weekly pay rate:  ");
        totalWeeksThisMonth = Theater.getDouble("Please enter the number of weeks this month:  ");
        vacationWeeksTakenInMonth = Theater.getInt("Please enter number vacation weeks the Manager has taken this month:  ");
        DAYS[] days = new DAYS[7];
        for(DAYS d:DAYS.values())
        {
            if(Theater.getString("Do they work on " + d + " (y/n)?  ").startsWith("y"))
            {
                for(int i = 0;i < days.length;i++)
                {
                    if (days[i] == null)
                    {
                        days[i] = d;
                        break;
                    }
                }
            }
        }
        managers.add(new Manager(weeklyPayRate, vacationWeeksTakenInMonth, totalWeeksThisMonth, days, lastName, firstName, dateOfBirth, hireDate, address));

        this.setCurrentMenu(1);
    }
    public POSITION getPos()
    {
        for(POSITION p:POSITION.values())
        {
            if(Theater.getString("Hire for the " + p + " position(y/n)?  ").startsWith("y"))
            {
                return p;
            }
        }
        return null;
    }
    public void hireStaff()
    {
        String lastName, firstName, street,city, stateZip; 
        int hrsWorkedPerWeek;
        double weeksWorkedThisMonth, payPerHour;
        Date dateOfBirth, hireDate; Address address;
        firstName = Theater.getString("Please enter first name:  ");
        lastName = Theater.getString("Please enter last name:  ");
        dateOfBirth = Theater.getDate("Please enter date of birth (mm-dd-yyyy):  ");
        hireDate = Theater.getDate("Please enter hireDate (mm-dd-yyyy):  ");
        payPerHour = Theater.getDouble("Please enter the pay per hour:  ");
        street = Theater.getString("Please enter street address:  ");
        city = Theater.getString("Please enter the city:  "      );
        stateZip = Theater.getString("Please enter the state and zip code ('NY 11001'):  ");
        address = new Address(street, city, stateZip);
        weeksWorkedThisMonth = Theater.getDouble("Please enter the number of weeks worked this month:  ");
        hrsWorkedPerWeek = Theater.getInt("Please enter number hours worked per week:  ");
        DAYS[] days = new DAYS[7];
        for(DAYS d:DAYS.values())
        {
            if(Theater.getString("Do they work on " + d + " (y/n)?  ").startsWith("y"))
            {
                for(int i = 0;i < days.length;i++)
                {
                    if (days[i] == null)
                    {
                        days[i] = d;
                        break;
                    }
                }
            }
        }
        staff.add(new Staff(this.getPos(), hrsWorkedPerWeek, weeksWorkedThisMonth, payPerHour, lastName, firstName, dateOfBirth, hireDate, address));
        this.setCurrentMenu(1);
    }

    public void addCustomer()
    {
        String lastName, firstName, street, city, stateZip; 
        Date dateOfBirth, hireDate; Address address;
        firstName = Theater.getString("Please enter the customer's first name:  ");
        lastName = Theater.getString("Please enter the customer's last name:  ");
        dateOfBirth = Theater.getDate("Please enter the customer's date of birth (mm-dd-yyyy):  ");
        hireDate = Theater.getDate("Please enter the customer's hire date (mm-dd-yyyy):  ");
        street = Theater.getString("Please enter the customer's street address:  ");
        city = Theater.getString("Please enter the Actor/Actress's city:  "      );
        stateZip = Theater.getString("Please enter the Actor/Actress's state and zip code ('NY 11001'):  ");
        address = new Address(street, city, stateZip);
        this.attendees.add(new Customer(lastName, firstName, dateOfBirth, hireDate, address));
        this.setCurrentMenu(1);
    }
    public void reserveSeat()
    {
        int play = 0;
        int customer = 0;
        if(this.attendees.isEmpty())
        {
            System.out.println("Please add some customers before making reservations.");
            this.setCurrentMenu(2);
            return;
        }
        if(this.getPlays().isEmpty())
        {
            System.out.println("Please add at least one play before making reservations.");
            this.setCurrentMenu(2);
            return;
        }
        if(this.shows.isEmpty())
        {
            System.out.println("Please add some shows before making reservations.");
            this.setCurrentMenu(2);
            return;
        }
        // Get who
        System.out.printf("Please confirm which attendee is reserving:\n");
        for(Customer c:attendees)
        {
            if(Theater.getString(String.format("%s %s(y/n):  ",c.getFirstName(),c.getLastName())).startsWith("y")) 
            {
                customer = c.getpID();
                break;
            }
        }
        if(customer == 0) 
        {
            this.setCurrentMenu(0);
            return;
        }
        // Get which play
        System.out.printf("Please confirm which Play:\n");
        for(Play p:getPlays())
        {
            if(Theater.getString(String.format("%s (y/n):  ",p.getName())).startsWith("y")) 
            {
                play = p.getpID();
                break;
            }
        }
        if(play == 0) 
        {
            this.setCurrentMenu(0);
            return;
        }

        // Get which show seat
        System.out.printf("Please choose a showing:\n");
        for(Show s:shows)
        {
            if(s.getWhichPlay() == play) 
            {
                if(Theater.getString(String.format("%s %s (y/n):  ",s.getShowDate(),s.getShowTime())).startsWith("y")) 
                {
                    // Box or regular
                    if(Theater.getString("Would you like a box seat (y/n)?  ").startsWith("y")) 
                    {
                        s.reserveBoxSeat(customer);
                        this.setCurrentMenu(0);
                    }
                    else
                    {
                        s.reserveRegSeat(customer);
                        this.setCurrentMenu(0);
                    }
                }
            }
        }
        this.setCurrentMenu(0);
    }
    public boolean rentItem()
    {
        // Get item info
        // return if added
        return false;
    }

    /**
     * @return the yearly operating budget
     */
    public double getYearlyOperatingBudget()
    {
        return yearlyOperatingBudget;
    }

    /**
     * @param yearlyOperatingBudget set the yearly operating budget
     */
    public void setYearlyOperatingBudget(double yearlyOperatingBudget)
    {
        this.yearlyOperatingBudget = yearlyOperatingBudget;
    }

    /**
     * @return the shows
     */
    public List<Show> getShows()
    {
        return shows;
    }

    /**
     * @param shows the shows to set
     */
    public void setShows(List<Show> shows)
    {
        this.shows = shows;
    }

    /**
     * @return the number of box seats in the theater
     */
    public int getBoxSeats()
    {
        return boxSeats;
    }

    /**
     * @param boxSeats set the number of box seats in the theater
     */
    public void setBoxSeats(int boxSeats)
    {
        this.boxSeats = boxSeats;
    }

    /**
     * @return the number of regular seats in the theater
     */
    public int getRegSeats()
    {
        return regSeats;
    }

    /**
     * @param regSeats set the number of regular seats in the theater
     */
    public void setRegSeats(int regSeats)
    {
        this.regSeats = regSeats;
    }
    
    public void addShow()
    {
        int play = 0;
        Date tmpDate;
        boolean tmpMatinee;

       // Get which play
        System.out.printf("Please confirm which Play:\n");
        for(Play p:getPlays())
        {
            if(Theater.getString(String.format("%s (y/n):  ",p.getName())).startsWith("y")) 
            {
                play = p.getpID();
                break;
            }
        }
        if(play == 0) 
        {
            System.out.println("Failed to add show.  No play selected.");
            this.setCurrentMenu(2);
            return;
        }

        tmpDate = Theater.getDate("Please enter date of the show (mm-dd-yyyy):  ");      
        tmpMatinee = Theater.getString("Is this a matinee(y/n):  ").startsWith("y");        
        this.shows.add(new Show(tmpDate,this.getBoxSeats(),this.getRegSeats(),play,tmpMatinee?SHOWTIME.MATINEE:SHOWTIME.EVENING));
        this.setCurrentMenu(2);
    }

    /**
     * @return the currentMenu
     */
    public int getCurrentMenu()
    {
        return currentMenu;
    }

    /**
     * @param currentMenu the currentMenu to set
     */
    public void setCurrentMenu(int currentMenu)
    {
        this.currentMenu = currentMenu;
    }

    /**
     * @return the friSatEvePrice
     */
    public double getFriSatEvePrice()
    {
        return friSatEvePrice;
    }

    /**
     * @param friSatEvePrice the friSatEvePrice to set
     */
    public void setFriSatEvePrice(double friSatEvePrice)
    {
        this.friSatEvePrice = friSatEvePrice;
    }

    /**
     * @return the sunEvePrice
     */
    public double getSunEvePrice()
    {
        return sunEvePrice;
    }

    /**
     * @param sunEvePrice the sunEvePrice to set
     */
    public void setSunEvePrice(double sunEvePrice)
    {
        this.sunEvePrice = sunEvePrice;
    }

    /**
     * @return the satSunMatPrice
     */
    public double getSatSunMatPrice()
    {
        return satSunMatPrice;
    }

    /**
     * @param satSunMatPrice the satSunMatPrice to set
     */
    public void setSatSunMatPrice(double satSunMatPrice)
    {
        this.satSunMatPrice = satSunMatPrice;
    }

    /**
     * @return the currentlyPlaying
     */
    public String getCurrentlyPlaying()
    {
        return currentlyPlaying;
    }

    /**
     * @param currentlyPlaying the currentlyPlaying to set
     */
    public void setCurrentlyPlaying(String currentlyPlaying)
    {
        this.currentlyPlaying = currentlyPlaying;
    }

    /**
     * @return the upComing
     */
    public String getUpComing()
    {
        return upComing;
    }

    /**
     * @param upComing the upComing to set
     */
    public void setUpComing(String upComing)
    {
        this.upComing = upComing;
    }

    /**
     * @return the plays
     */
    public List<Play> getPlays()
    {
        return plays;
    }
}
