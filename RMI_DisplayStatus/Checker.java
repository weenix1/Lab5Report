import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import java.io.Serializable;
/**
 * Abstract class Checker - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
 public abstract class Checker extends Observable implements Serializable//implements DisplayData
{
    private ArrayList<Observer> observes;
    private String Location;
    private int Battery;
    private String JobCompleted;
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Checker() {
     
    }
    
    public void update(Object o){
       
    }
    
    public void setLocation(String location){
        this.Location = Location;
        setChanged();
        notifyObservers(Location);
    }
    
    public void setBattery(int Battery){
        this.Battery = Battery;
        setChanged();
        notifyObservers(Location);
    }
    
    public void setJobCompleted(String Battery){
        this.JobCompleted = JobCompleted;
        setChanged();
        notifyObservers(Location);
    }
    
    public void attach(Observer obs){
        //observers.add(obs);
    }
    
    //@Override
    public void getLocation(){
    }
     
    public boolean getJobCompleted(){
      return true;
    }
    
    public void detach(Observer obs){
       //observers.remove(obs);
    }
    
   public void getUpdate(){
       
    }
    
}