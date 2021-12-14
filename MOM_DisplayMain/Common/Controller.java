package Common;

import java.util.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Abstract class Controller - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
 public  class Controller {
    
     
        public static void main(String[] args) throws RemoteException {
        JobCompleted jb = new JobCompleted();
        System.out.println();
        jb.getJobCompleted();
        
        Location loc1 = new Location("LivingRoom",+ 40.366633, 74.640832);
        Location loc2 = new Location("Bedroom",  +  42.443087, 76.488707);  
        double distance = loc1.distanceTo(loc2);
        System.out.printf("%6.3f miles from", + distance);
        System.out.println(loc1 + " to " + loc2);
        
        Battery bt = new Battery();
        System.out.println();
        bt.update();
        
        //ViewerGui viewer = new ViewerGui();
        RobotStatus robotStatus = new RobotStatus();
        
        //System.out.println();
        //viewer.update();
        
        System.out.println();
        robotStatus.update();
        
        
     }

}
