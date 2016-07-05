/*
Tony Nassar
CIS 2151
Prof. John P. Baugh
Summer 2016
Programming Assignment2
*/
public class Transport extends GenericShip
{
    private int mats;
    /*
    *perameterless Transport constructor
    */
    public Transport()
    {
        super();
        mats = 100;
    }
    /*
    *perameterized Transport constructor
    */
    public Transport(int crew, int cost, String shipName, int mats)
    {
        super(crew, cost, shipName);
        this.mats = mats;
    }
    /*
    *@return the mats
    */
    public int getMats() 
    {
        return mats;
    }
    /**
     * @param mats the mats to set
     */
    public void setMats(int mats) 
    {
        this.mats = mats;
    }
    /*
    *Helpme method
    */
    public String HelpMe()
    {
        String str = "Help! We are under attack!";
        
        return str;
    }
    @Override
    public String toString()
    {
        String str;
        
        str = super.toString() + "\nYou have " + getMats() + 
                " materials left.";
        
        return str;
    }
}
