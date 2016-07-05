
public class GalaticRidgeWarriors 
{
    public static void main(String[] args)
    {
        Transport trs = new Transport();
        Warship wrs = new Warship();
        ScienceVessel scv = new ScienceVessel();
        Transport trs2 = new Transport(15,10000,"S.S Wasp", 75);
        Warship wrs2 = new Warship(100,20000,"S.S Washington", 5 , 3, 75.8,
                                    "Denny");
        ScienceVessel scv2 = new ScienceVessel(25, 50000, "S.S. Lincoln", 20, 
                                                30, "Nassar");
        
        System.out.println(trs);
        System.out.println(wrs);
        wrs.Fire();
        System.out.println(scv);
        System.out.println(trs2);
        trs2.HelpMe();
        System.out.println(wrs2);
        System.out.println(scv2);
        scv2.LaunchProbes();
    }
}
