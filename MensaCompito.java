/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensacompito;

import static java.lang.Thread.sleep;

/**
 *
 * @author informatica
 */
public class MensaCompito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Bancone bancone = new Bancone();
        int numDipendente = 10;
        
        
        System.out.println("Pausa pranzo");
        sleep((int) (Math.random() * 7000));
 
        Cuoco cuoco = new Cuoco(bancone, numDipendente);
        cuoco.start();

        for (int i = 0; i < numDipendente; i++) {
            Dipendenti C = new Dipendenti(bancone);
            C.start();
        }
        for (int i = 0; i < numDipendente; i++) {
            Dipendenti C = new Dipendenti(bancone);
            C.join();
        }
        cuoco.join();
        
        
        System.out.println("Fine pausa pranzo");
    }
}
    

