public class ScientificCalculator extends multilevelInheritance1{
    public void calculus()
    {
        System.out.println("Calculus Functions...");
    }

    public void statistics()
    {
        System.out.println("Statistics Functions...");
    }

    public static void main(String args[])
    {
        ScientificCalculator sc = new ScientificCalculator();

        sc.add();
        sc.subtract();
        sc.multiply();
        sc.divide();
        sc.calculus();
        sc.statistics();
    }
}
