/*
Tony Nassar
CIS 2151
Prof. John P. Baugh
Summer 2016
Programming Assignment2
*/
public class ScienceVessel extends GenericShip 
{
    private int probes;
    private int sciAboard;
    private String chiefResearcher;
    /*
    *perameterless ScienceVessel constructor
    */
    public ScienceVessel()
    {
        probes = 10;
        sciAboard = 25;
        chiefResearcher = "Cochane";
    }
    /*
    *perameterized ScienceVessel constructor
    */
    public ScienceVessel(int crew, int cost, String shipName, int probes, 
            int sciAboard, String chiefResearcher)
    {
        super(crew, cost, shipName);
        this.probes = probes;
        this.sciAboard = sciAboard;
        this.chiefResearcher = chiefResearcher;
    }
    /**
     * @return the Probes
     */
    public int getProbes() 
    {
        return probes;
    }
    /**
     * @param probes the probes to set
     */
    public void setProbes(int probes) 
    {
        this.probes = probes;
    }
        /**
     * @return the sciAboard
     */
    public int getSciAboard() 
    {
        return sciAboard;
    }
    /**
     * @param sciAboard the sciAbaord to set
     */
    public void setSciAboard(int sciAboard) 
    {
        this.sciAboard = sciAboard;
    }
    /**
     * @return the chiefResearcher
     */
    public String getChiefResearcher() 
    {
        return chiefResearcher;
    }
    /**
     * @param chiefResearcher the chiefResearcher to set
     */
    public void setChiefResearcher(String chiefResearcher) 
    {
        this.chiefResearcher = chiefResearcher;
    }
    
    public int LaunchProbes()
    {
        while(probes > 0)
        {
            System.out.println("We are lauching the probe sir");
            probes--;
            System.out.println("You have " + probes + " probes left.");
        }
        System.out.println("Sorry sir, there are no more probes left.");
        return probes;
    }
    @Override
    public String toString()
    {
        String str;
        
        str = super.toString() + "\nYou have " + sciAboard + " scientist "
                + "aboard the ship.\nThe chief researcher is " +
                chiefResearcher + "."+ "\nyou have " + probes + 
                " Probes.";
        
        return str;
    }
    
}
