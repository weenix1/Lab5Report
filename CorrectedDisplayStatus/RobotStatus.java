import java.util.Observable;
import java.util.Observer;
import java.util.List;
import java.util.ArrayList;

/**
 * Abstract class RobotStatus - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */

 public class RobotStatus 
{
    Observable observable;
    private String Location;
    private int battery;
    private String JobCompleted;
    private List<Checker> checks = new ArrayList<>();
     
    public RobotStatus(){
        this.battery = battery;
        //Battery bt = new Battery();
        JobCompleted jb = new JobCompleted();
        
    }
    
    public void getBattery(){
         Battery bt;
        }
        
    public void getLocation(){
         Location loc;
        }
        
    public void update() {
        //bt.getState();
    }
   
    public void addObserver(Checker check) {
        this.checks.add(check);
    }

    public void removeObserver(Checker check) {
        this.checks.remove(check);
    }

    public void setLocation(String Location) {
        this.Location = Location;
        for (Checker check : this.checks) {
            check.update(this.Location);
        }
    }
    
    public void setBattery(int battery) {
        this.battery = battery;
        for (Checker check : this.checks) {
            check.update(this.battery);
        }
    }
    
    public void setJobCompleted(String JobCompleted) {
        this.JobCompleted = JobCompleted;
        for (Checker check : this.checks) {
            check.update(this.JobCompleted);
        }
    }
    
}
