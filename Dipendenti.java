/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensacompito;

/**
 *
 * @author informatica
 */
public class Dipendenti extends Thread{
    int numPiatto = 1;
    Bancone bancone;
    int i=0;
    int numDipendente;

    public Dipendenti(Bancone T) {  
        this.bancone = T;
    }
    
    @Override
    public void run() {
        try {
            sleep((int) (Math.random() * 3000));   
        } catch (InterruptedException ex) {

        } 
        
        bancone.deposita(numDipendente);
    }
}
