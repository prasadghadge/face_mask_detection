public class Baleno extends HierarchicalInheritance{
    int balenoPrice = 10000;
    public void acVehicle()
    {
        System.out.println("This is AC Vehicle...");

    }

    public static void main(String args[])
    {
        Baleno b = new Baleno();
        System.out.println(b.balenoPrice);
        System.out.println(b.vehicleMileage);
        System.out.println(b.vehicleTyres);
        b.engineStart();
        b.engineOff();
        b.acVehicle();
    }
}
