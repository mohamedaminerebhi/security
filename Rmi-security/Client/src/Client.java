package tpsec;

import java.rmi.*;
import java.rmi.registry.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Callback callback = new Callback();
        // cr�ation de l'objet callback
        Registry reg = LocateRegistry.getRegistry("localhost", 1099);
        IServer serveur = (IServer) reg.lookup("Server");
        System.out.println("demarrage de l'appel");
        serveur.callMeBack(5,
                "coucou", callback);
        // demande de rappel
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("fin du main");
    }
}