import java.rmi.Naming;
import java.rmi.server.RemoteServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Write a description of class StatusServer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StatusServer
{
    public static void startRegistry() throws Exception
    {
        LocateRegistry.createRegistry( Registry.REGISTRY_PORT );
        RemoteServer.setLog( System.err );
    }

    
  public static void main(String [] args) throws Exception {
        RemoteServer.setLog( System.err );
        IRobotStatus robot = null;//new IRobotStatus();
        Naming.rebind("robotStatus", robot);
        IBattery battery = null;
        Naming.rebind("battery", battery);
        ILocation location = null;
        Naming.rebind("location", location);
        IJobCompleted completed = null;
        Naming.rebind("JobCompleted",completed);
        
        
    }
}
