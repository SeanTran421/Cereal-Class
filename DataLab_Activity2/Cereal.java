public class Cereal
{
    private String cerealName = "";
    private double cerealWeight = 0.00;

    public Cereal(String cName, double cWeight)
    {
        cerealName = cName;
        cerealWeight = cWeight;
    }

    public String getName()
    {
        return cerealName;
    }

    public double getWeight()
    {
        return cerealWeight;
    }

    public String toString()
    {
        return cerealName;
    }

    public static void main(String[] args)
    {
        Cereal cocoaPuffs = new Cereal("Cocoa Puffs", 1.00);
        System.out.println(cocoaPuffs);
    }

}