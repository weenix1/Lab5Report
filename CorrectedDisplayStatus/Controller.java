import java.util.*;
/**
 * Abstract class Controller - write a description of the class here
 *
 * @author (your name here)
 */
public  class Controller {
    
    public static void main(String[] args) {
        System.out.printf("JobCompleted:", +'\n');
        JobCompleted jb = new JobCompleted();
        System.out.println();
        jb.getJobCompleted();
        
        System.out.printf('\n'+"BatteryStatus:", +'\n');
        Battery bt = new Battery();
        System.out.println();
        bt.update();
        
        System.out.printf('\n'+"CurrentLocation:" + "\n");
        Location loc1 = new Location("LivingRoom",+ 40.366633, 74.640832);
        Location loc2 = new Location("Bedroom",  +  42.443087, 76.488707);  
        double distance = loc1.distanceTo(loc2);
        System.out.printf("%6.3f miles from", + distance);
        System.out.println(loc1 + " to " + loc2);
        
        
        RobotStatus observable = new RobotStatus();
        JobCompleted observer = new JobCompleted();

        System.out.println();
        observable.update();
        
        observable.addObserver(observer);
        observable.setJobCompleted("JobCompleted");
        //assertEquals(observer.getJobCompleted(),"Location");
     }
 
    
    
}
