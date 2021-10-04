
package kitorobot;

import java.util.Scanner;


public class Main {

  
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Manager objMan= new Manager();
        objMan.InputInfo();
        int noOfDev=5;
        int i;
        
        Developer objDev[]=new Developer[noOfDev];

       for(i=0; i<noOfDev; i++){
           objDev[i].InputInfo();
           
       } 
       
       
       Robot objR=new Robot();
       
       objR.all();
       
       objMan.set_Robotid(objR.Robotid);
 
        System.out.println("Enter Developer no");
        
        Scanner input=new Scanner(System.in);
        
        int DevNo= input.nextInt();
        
        objR.DevNoAssaignByManger(DevNo);
        
for(i=0; i<DevNo; i++){
            System.out.println("Enter Dev id ");
            int id=input.nextInt();
            
            

        }
        
        
    }
    
}
