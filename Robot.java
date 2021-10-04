
package kitorobot;
import Interface.RobotInterface;
import java .util.Scanner;

public class Robot implements RobotInterface{
    
    protected int Robotid;
    protected String RobotName;
    protected String RobotType;
    protected int Devid[];
    protected int id,i;
    
    @Override
    public void all (){
Scanner input= new Scanner (System.in);     
        System.out.println("Enter robot id");
        Robotid= input.nextInt();
        System.out.println("Enter the robot name");
        RobotName=input.nextLine();
        System.out.println("Enter the robot type");
        RobotType=input.nextLine();
        
}
    @Override
    public int get_Robotid(){
        return Robotid;
        
    }
    public void DevNoAssaignByManger(int noOfDev){
        
        Devid = new int [noOfDev];
        
        
    }
    
    public void set_Devid(int devid){
        
        Devid[i]=devid;
        i++;
    }
    public int get_id(){
        return id;
    }

    @Override
    public void DevNoAssaignByManger() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
