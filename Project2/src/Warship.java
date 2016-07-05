import java.util.Random;
/*
Tony Nassar
CIS 2151
Prof. John P. Baugh
Summer 2016
Programming Assignment2
*/
public class Warship extends GenericShip
{
    private int photonTorpedos;
    private int phaserBanks;
    private double percentShield;
    private String captainVessel;
    /*
    *perameterless Warship constructor
    */
    public Warship()
    {
        photonTorpedos = 2;
        phaserBanks = 2;
        percentShield = 100.0;
        captainVessel = "Snuggles";
    }
    /*
    *perameterized Warship constructor
    */
    public Warship(int crew, int cost, String shipName, int photonTorpedos, 
            int phaserBanks, double percentShield, String captainVessel)
    {
        super(crew, cost, shipName);
        this.photonTorpedos = photonTorpedos;
        this.phaserBanks = phaserBanks;
        this.percentShield = percentShield;
        this.captainVessel = captainVessel;
    }
    /**
     * @return the photonTorpedos
     */
    public int getPhotonTorpedos() {
        return photonTorpedos;
    }
    /**
     * @param photonTorpedos the photonTorpedos to set
     */
    public void setPhotonTorpedos(int photonTorpedos) {
        this.photonTorpedos = photonTorpedos;
    }
    /**
     * @return the phaserBanks
     */
    public int getPhaserBanks() {
        return phaserBanks;
    }
    /**
     * @param phaserBanks the phaserBanks to set
     */
    public void setPhaserBanks(int phaserBanks) {
        this.phaserBanks = phaserBanks;
    }
    /**
     * @return the percentShield
     */
    public double getPercentShield() {
        return percentShield;
    }
    /**
     * @param percentShield the percentShield to set
     */
    public void setPercentShield(double percentShield) {
        this.percentShield = percentShield;
    }
    /**
     * @return the captainVessel
     */
    public String getCaptainVessel() {
        return captainVessel;
    }
    /**
     * @param captainVessel the captainVessel to set
     */
    public void setCaptainVessel(String captainVessel) {
        this.captainVessel = captainVessel;
    }
    
    public int Fire()
    {
        int damage;
        double health;
        Random rand = new Random();
        damage = rand.nextInt(101);
        health = percentShield - damage;
        System.out.println("You have taken " + damage + 
                            " damage to your shields\nYou have "
                            + health + " percent shield left.");
        return damage;
    }
    
    @Override
    public String toString()
    {
        String str;
        
        str = super.toString() + "\nPhoton Torpedos: " + photonTorpedos +
               "\nphaserBanks: " + phaserBanks +
               "\npercentShield: " + percentShield +
               "\ncaptain of the Vessel: " + captainVessel;
              
        
        return str;
    }
}
