package tpsec;

import java.rmi.*;

public interface ICallback extends Remote {
    // interface de l�objet callback
    public void doCallback(String message) throws RemoteException;
}