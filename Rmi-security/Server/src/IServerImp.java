package tpsec;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class IServerImp extends UnicastRemoteObject implements IServer {
    public IServerImp() throws RemoteException {
        super();
    }

    public void callMeBack(int time, String param, ICallback callback)
            throws RemoteException {
        Servant servant = new Servant(time, param, callback);
        // cr�ation du servant
        servant.start();
        // d�marrage du servant
    }
}