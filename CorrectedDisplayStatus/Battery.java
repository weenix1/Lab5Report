import java.util.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 * Write a description of class Battery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battery extends Checker 
{
    private Battery battery;
    private int batteryLevel;
    private int duration;
    private ArrayList<Observer> observes;
    
    /**
     * Constructor for objects of class Battery
     */
    public Battery()//int batteryLevel,int duration)
    {
        this.batteryLevel = batteryLevel;
        this.duration = duration;
        this.battery = battery;
    }
    
    public int getState()
    {
        return batteryLevel;
    }
    
    public int getDuration(){
       System.out.println();
       return duration; 
    }
    
    public boolean getBatteryLevel(){
        //return batteryLevel;
        return true;
    }
    
    public boolean update(){
       Battery bt = battery;
       if((batteryLevel + duration) < 30){
           System.out.println("Battery is enough to work");
          return true;
        }else{
            System.out.println("Battery needs to be charged");
            return false;
        }
      //System.out.println("Battery needs to be charged");
    }
  
    @Override
    public void update(Object battery){
       this.setBattery((int) battery);
      
    }
}
