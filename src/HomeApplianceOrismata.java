import javax.naming.Name;
import java.util.Scanner;

public class HomeApplianceOrismata
{
    private static String Name;
    private static String Address;
    private static int Employees;

    public HomeApplianceOrismata (String N, String A, int E)
    {
        N = Name;
        A = Address;
        E = Employees;
    }
    public void printOrismata()
    {
        System.out.println("||Onoma Etairias: ||"+Name+"|| Dieythynsh Etairias: ||"+Address+"|| Arithmos Ergazomenwn: ||"+Employees+ "||");
    }

    public static String getName()
    {
        return Name;
    }

    public static String getAddress()
    {
        return Address;
    }

    public static int getEmployees()
    {
        return Employees;
    }

    public static void setName()
    {
        Name = "U_shOP";
    }
    public static void setAddress()
    {
        Address = "Sparta";
    }
    public static void setEmployees()
    {
        Employees = 15;

    }
}

