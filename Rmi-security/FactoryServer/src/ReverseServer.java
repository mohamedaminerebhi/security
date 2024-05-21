import java.rmi.*;
import java.rmi.registry.*;

public class ReverseServer {
    public static void main(String[] args) {
    	if(System.getSecurityManager() == null) System.setSecurityManager(new
    			RMISecurityManager());
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Serveur : Construction de l'implémentation");
            FabReverseImpl fab = new FabReverseImpl();
            System.out.println("Objet Fabrique lié dans le RMIregistry");
            registry.rebind("Fabrique", fab);
            System.out.println("Serveur prêt.");
            System.out.println("Attente des invocations des clients...");
        } catch (Exception e) {
            System.out.println("Erreur de liaison de l'objet Fabrique");
            System.out.println(e.toString());
        }
    }
}
