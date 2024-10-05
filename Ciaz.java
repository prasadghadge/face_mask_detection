public class Ciaz extends HierarchicalInheritance{
        int ciazPrice = 500000;
        public void acVehicle()
        {
            System.out.println("This is AC Vehicle...");
        }

        public void powerWindows()
        {
            System.out.println("This is Power Windows Vehicle...");
        }
        public static void main(String args[])
        {
            Ciaz c = new Ciaz();
            System.out.println(c.ciazPrice);
            System.out.println(c.vehicleMileage);
            System.out.println(c.vehicleTyres);
            c.engineStart();
            c.engineOff();
            c.acVehicle();
            c.powerWindows();
        }
    }
