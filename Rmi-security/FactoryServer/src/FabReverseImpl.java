package tpsec;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FabReverseImpl extends UnicastRemoteObject implements FabReverseInterface {
    public FabReverseImpl() throws RemoteException {
    }

    public ReverseInterface newReverse() throws RemoteException {
        return new Reverse();
    }
}
