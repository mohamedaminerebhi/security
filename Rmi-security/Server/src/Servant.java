package tpsec;

import java.rmi.*;

public class Servant extends Thread {
    private int time;
    private String param;
    private ICallback callback;

    public Servant(int time, String param, ICallback callback) { // le constructeur // re�oit l�objet callback en
                                                                 // param�tre
        this.time = time;
        this.param = param;
        this.callback = callback;
    }

    public void run() {
        // ex�cution du servant comme thread s�par�
        try {
            Thread.sleep(1000 * time);
            // attend le d�lai fix� (time exprim� en secondes)
        } catch (InterruptedException e) {
        }
        try {
            callback.doCallback(param);
            // ex�cute l'appel en retour
        } catch (RemoteException e) {
            System.err.println("Echec appel en retour : " + e);
        }
        callback = null;
        System.gc();
    }
}