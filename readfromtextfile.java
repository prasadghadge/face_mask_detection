import java.util.*;
import java.io.*;
public class readfromtextfile {
    public static void main(String args[]) throws Exception
    {
        File file = new File("C:\\Users\\Prasad\\Desktop\\java\\File\\data.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){

            System.out.println(sc.nextLine());
        }
    }
}
