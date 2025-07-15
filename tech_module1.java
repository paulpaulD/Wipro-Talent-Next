import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] empno={1001,1002,1003,1004,1005,1006,1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
        System.out.println("Enter the employee id:");
        int id=sc.nextInt();
        int index=-1;
        for(int i=0;i<empno.length;i++){
            if(empno[i]==id) index=i;
        }
        if(index==-1) System.out.println("There is no employee with empid:"+id);
        else{
            String Drs="";
            int da=0;
            switch(designationCode[index]){
                case 'e':
                    Drs="Engineer";
                    da=20000;
                    break;
                case 'c':
                    Drs="Consuitant";
                    da=32000;
                    break;
                case 'k':
                    Drs="Clerk";
                    da=12000;
                    break;
                case 'r':
                    Drs="Receptionist";
                    da=15000;
                    break;
                case 'm':
                    Drs="Manager";
                    da=40000;
                    break;
            }
            int salary=basic[index]+hra[index]+da-it[index];
            System.out.printf("%-8s %-10s %-12s %-15s %-10s%n", "Emp No", "Emp Name", "Department", "Designation", "Salary");
            System.out.printf("%-8d %-10s %-12s %-15s %-10d%n",empno[index],empName[index],department[index],Drs,salary);
        }
	}
}
