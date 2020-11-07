import javax.naming.Name;
import java.util.Scanner;

public class HomeApplianceStore
{
    public static void main(String[] args)
    {
        try {                                                                                                           //Try
            Scanner Name = new Scanner(System.in);
            System.out.println("Dwste To Onoma Tis etairias: ");
            String N = Name.nextLine();
            HomeApplianceOrismata.getName();                                                                            //Pernei Orisma Apo thn Scanner
            HomeApplianceOrismata.setName();                                                                            //Pernei Orisma Apo tin Setter Func

            if (N.equals("") || N == null) {System.out.println("Den Dwsate Orisma"); return;}                           //Elegxos Gia Keno


            Scanner Address = new Scanner(System.in);
            System.out.println("Dwste Thn dieythynsh Ths Etairias: ");
            String A = Address.nextLine();
            HomeApplianceOrismata.getAddress();                                                                         //Pernei Orisma Apo thn Scanner
        HomeApplianceOrismata.setAddress();                                                                             //Pernei Orisma Apo tin Setter Func

            if (A.equals("") || A == null) {System.out.println("Den Dwsate Orisma"); return;}                           //Elegxos Gia Keno



            Scanner Employees = new Scanner(System.in);
            System.out.println("Poios Einai O Arithmos Twn Ergazomenwn: ");
            Integer E  = Integer.parseInt(Employees.nextLine());
            HomeApplianceOrismata.getEmployees();                                                                       //Pernei Orisma Apo thn Scanner
            HomeApplianceOrismata.setEmployees();                                                                       //Pernei Orisma Apo tin Setter Func
            if (E.equals("") || E==null) {System.out.println("Den Dwsate Orisma");}                                     //Elegxos Gia Keno


            System.out.println("DONE!!!");

            HomeApplianceOrismata HomeAppliancesStore = new HomeApplianceOrismata(N,A,E);                               //Pernaei Orismata

        HomeAppliancesStore.printOrismata();                                                                            //Print Orismata

        }
        catch(Exception e)
        {                                                                                                               //Elegxos Catch
            System.out.println("ERROR!!");
        }

    }
}
