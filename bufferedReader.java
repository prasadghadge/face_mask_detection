import java.io.*;
public class bufferedReader {
    public static void main(String args[]) throws IOException 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Employee Qualification: ");
        String empQualification = br.readLine();
        System.out.print("Employee Name: ");
        String empName = br.readLine();
        System.out.print("Employee Id: ");
        int empId = Integer.valueOf(br.readLine());
        System.out.print("Employee Salary: ");
        float empSalary = Float.valueOf(br.readLine());
        System.out.print("Employee Mobile Number: ");
        long empMobileNumber = Long.valueOf(br.readLine());
        System.out.print("Employee Marital Status: ");
        boolean isEmployeeMarried = Boolean.valueOf(br.readLine());


        System.out.println("______________________________________");
        System.out.println("Employee Qualification: "+empQualification);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee Id: "+empSalary);
        System.out.println("Employee Id: "+empMobileNumber);
        System.out.println("Employee Id: "+isEmployeeMarried);
        
    }
}
