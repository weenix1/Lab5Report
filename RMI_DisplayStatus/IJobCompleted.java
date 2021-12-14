import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Write a description of interface IJobCompleted here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IJobCompleted extends Remote
{
    public boolean getJobCompleted() throws RemoteException;
    //public void update() throws RemoteException;
}
