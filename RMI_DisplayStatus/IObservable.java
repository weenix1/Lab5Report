import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Write a description of class IObservable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface IObservable extends Remote
{
    public void addObserver(Observer o) throws RemoteException;

    public void deleteObserver(Observer o) throws RemoteException;

    public void deleteObservers() throws RemoteException;

    public void notifyObservers() throws RemoteException;

    public void notifyObservers(Object o) throws RemoteException;
    
    public boolean hasChanged() throws RemoteException;
    
    public int countObservers() throws RemoteException;

}
