

package firstproject;

import java.util.*;

public class LoginEmailMo {
    public static void main(String[]args){
    String user;
    Scanner sc=new Scanner(System.in);
    user=sc.next();
    
    int i=-1;
    i=user.indexOf('@');
    if(i>=0)
    {
        System.out.println("Thank You for login By Email");
    
    }
    else
    {
        System.out.println("Thank You for login By Mobile");
    
    
    }
    
    
    }
    
}
