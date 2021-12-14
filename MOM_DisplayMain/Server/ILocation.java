package Server;

import java.rmi.Remote;

import java.rmi.RemoteException;
/**
 * Write a description of interface ILocation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface ILocation extends Remote
{
    
    //public double distanceTo(Location that) throws RemoteException;
    public void getLocation() throws RemoteException;
    public void setLocation() throws RemoteException;
}
