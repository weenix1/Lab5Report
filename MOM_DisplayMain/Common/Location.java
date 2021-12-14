package Common;

import Server.*;

import java.util.Vector;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 * Write a description of class Location here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Location extends Checker implements ILocation
{
    // instance variables - replace the example below with your own
    private String location;
    private double longitude;
    private double latitude;
    /**
     * Constructor for objects of class Location
     */
    public Location(String location, double latitude, double longitude) {
        this.location = location;
        this.latitude  = latitude;
        this.longitude = longitude;
    }

    public double distanceTo(Location that) {
        double STATUTE_MILES_PER_NAUTICAL_MILE = 1.15077945;
        double lat1 = Math.toRadians(this.latitude);
        double lon1 = Math.toRadians(this.longitude);
        double lat2 = Math.toRadians(that.latitude);
        double lon2 = Math.toRadians(that.longitude);
        // great circle distance in radians, using law of cosines formula
        double angle = Math.acos(Math.sin(lat1) * Math.sin(lat2)
                               + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        // each degree on a great circle of Earth is 60 nautical miles
        double nauticalMiles = 60 * Math.toDegrees(angle);
        double statuteMiles = STATUTE_MILES_PER_NAUTICAL_MILE * nauticalMiles;
        return statuteMiles;
    }
    
    @Override
    public void update(Object location){
        this.setLocation((String) location);
        
    }
    // return string representation of this point
    
    public String toString() {
        return location + " (" + latitude + ", " + longitude + ")";
    }
    
    public void getLocation(){
        this.location = location;
    }
    
    public void setLocation(){
        this.location = location;
    }
    
}
