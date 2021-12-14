import java.util.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 * Write a description of class Jobcompleted here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JobCompleted extends Checker
{
    
    private ArrayList<Observer> observes;
    private JobCompleted completes;
    private int condition = 1;
    private int currentJob;

    /**
     * Constructor for objects of class Jobcompleted
     */
    public JobCompleted()
    {
        this.condition = condition;
        this.completes = completes;
        this.currentJob = currentJob;
    }

    public boolean getJobCompleted()
    { 
        if(currentJob == condition){
           System.out.println("New Job completed");
           return true;
           
        } else{
            System.out.println("Job still in process...");
        return false;
         
        }
        
    }
     
    @Override
    public void update(Object JobCompleted){
       this.setJobCompleted((String) JobCompleted);
      
    }
}
