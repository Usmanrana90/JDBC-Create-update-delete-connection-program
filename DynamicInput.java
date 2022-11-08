    
import java.util.*;
    public class DynamicInput {
    public static void main(String[]args){
        Scanner sc= new  Scanner(System.in);
        System.out.println("Enter The Employee No");
        int eno=sc.nextInt();
        System.out.println("Enter The Employee Name");
        String ename=sc.next();
        
        System.out.println("Enter The Employee Sallry");
        Double esal=sc.nextDouble();
        
        System.out.println("Enter The Employee Address");
        String eaddr=sc.next();
        
        System.out.println(eno+"\t"+ename+"\t"+esal+"\t"+eaddr);
        
        
        System.out.println("Thank you for share your Infomation");
    }
    
}
