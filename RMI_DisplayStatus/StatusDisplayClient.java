import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
// import java.rmi.RMISecurityManager;
/**
 * Write a description of class StatusDisplayClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
   public class StatusDisplayClient
   {
     public static void main(String[] args) throws Exception
    { 
      IRobotStatus server = (IRobotStatus)
              Naming.lookup("rmi://127.0.0.1/RobotStatus");
       
       IRobotStatus robotStatus = server;
       System.out.println("Client side RobotStatus" + robotStatus);
       ILocation loc = null;
       System.out.println("Client side loc" + loc);
       IBattery battery = null;
       System.out.println("Client side battery" + battery);
       IJobCompleted jobCompleted = null;
       System.out.println("Client side completed" + jobCompleted);
    }
}
