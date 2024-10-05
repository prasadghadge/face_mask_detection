public class AdvancedCalculator extends singleInheritance
{
    public void multiply()
    {
        System.out.println("Multiplying the Numbers...");
    }

    public void divide()
    {
        System.out.println("Dividing the numbers...");

    }

    public static void main(String args[]){
        AdvancedCalculator ac = new AdvancedCalculator();

        ac.add();
        ac.subtract();
        ac.multiply();
        ac.divide();

        System.out.println(ac.brand);
        System.out.println(ac.isSolarPowered);
    }
}
