/*
Tony Nassar
CIS 2151
Prof. John P. Baugh
Summer 2016
Programming Assignment2
*/
public abstract class GenericShip 
{
    private int crew;
    private int cost;
    private String shipName;
    /*
    *perameterless GenericShip constructor
    */
    public GenericShip()
    {
        crew = 10;
        cost = 5000;
        shipName = "S.S. Default";
    }
    /*
    *perameterized GenericShip consctructor
    */
    public GenericShip(int crew, int cost, String shipName)
    {
        this.crew = crew;
        this.cost = cost;
        this.shipName = shipName;
    }
    /**
     * @return the Crew
     */
    public int getCrew() 
    {
        return crew;
    }
    /**
     * @param crew the crew to set
     */
    public void setCrew(int crew) 
    {
        this.crew = crew;
    }
    /**
     * @return the Cost
     */
    public int getCost() 
    {
        return cost;
    }
    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) 
    {
        this.cost = cost;
    }
        /**
     * @return the shipName
     */
    public String getShipName() 
    {
        return shipName;
    }
    /**
     * @param shipName the shipName to set
     */
    public void setShipName(String shipName) 
    {
        this.shipName = shipName;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        String str;
        
        str = "Crew: " + crew +
              "\nCost: " + cost +
              "\nship Name: " + shipName;
        
        return str;
    }
}
