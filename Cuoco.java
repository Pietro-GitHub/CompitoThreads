/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensacompito;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Cuoco extends Thread{
    private int numPiatto = 1;
    Bancone bancone;
    int numDipendente;
    
    public Cuoco(Bancone t, int numDipendente) {
        this.bancone = t;
        this.numDipendente=numDipendente;
    }

    public void run() {
        while (numDipendente>0) {
            numPiatto = bancone.preleva();
            
            try {
                sleep((int) (Math.random() * 2000));
            } catch (InterruptedException ex) {
               
            }
            numDipendente--;
        }
    }
}
