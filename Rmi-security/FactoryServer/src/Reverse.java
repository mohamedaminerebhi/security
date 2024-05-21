import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Reverse extends UnicastRemoteObject implements ReverseInterface {
    public Reverse() throws RemoteException {
        super();
    }

    public String reverseString(String str) throws RemoteException {
        return new StringBuilder(str).reverse().toString();
    }
}
