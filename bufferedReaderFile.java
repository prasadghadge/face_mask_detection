import java.io.*;
public class bufferedReaderFile {
    public static void main(String args[]) throws IOException
    {
        FileReader file = new FileReader("C:\\Users\\Prasad\\Desktop\\java\\File\\data.txt");
        BufferedReader br = new BufferedReader(file);

        String data;
        while((data = br.readLine()) != null)
        {
            System.out.println(data);
        }
    }
}
