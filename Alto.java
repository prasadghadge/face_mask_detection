public class Alto extends HierarchicalInheritance{
  int altoPrice = 50000;

  public void nonAcVehicle()
  {
    System.out.println("This is Non Ac Vehicle...");
  }

  public static void main(String args[])
  {
    Alto a = new Alto();
    System.out.println(a.vehicleMileage);
    System.out.println(a.vehicleTyres);
    a.engineStart();
    a.engineOff();
    a.nonAcVehicle();
  }
}
