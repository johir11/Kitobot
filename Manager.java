
package kitorobot;

import Interface.ManagerInterface;
import java .util.Scanner;
public class Manager extends person implements ManagerInterface{

protected int Robotid;
protected String status;

@Override
public void set_status(){
    
    
    
     Scanner input =new Scanner (System.in);   
     System.out.println("Enter the status");
     
     status=input.nextLine();
     
    
}

public void set_Robotid(int id ){
    Robotid=id;
    
}

    @Override
    public void set_Robotid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





    
}
