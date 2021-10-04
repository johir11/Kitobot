
package kitorobot;
import Interface.personInterface;
import java.util.Scanner;

public class person implements personInterface {
    protected int personid;
    protected String PersonName ;
    @Override
    public void InputInfo(){
        
         Scanner input=new Scanner(System.in); 
         System.out.println("Enter person id ");
         personid=input.nextInt();
         System.out.println("Enter the person name");
         PersonName=input.nextLine();
         
     
         
         
    }
    
}
