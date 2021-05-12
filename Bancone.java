/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensacompito;

import java.util.concurrent.Semaphore;

/**
 *
 * @author informatica
 */
public class Bancone {
    Semaphore vuoto = new Semaphore(1);
    Semaphore pieno = new Semaphore(0);
    int numPiatto;
    int numDipendente;

    public void deposita(int numDipendente) {
        try {
            vuoto.acquire();
        } catch (InterruptedException ex) {

        }
        this.numDipendente = numDipendente;
        this.numPiatto++;
        System.out.println("Il piatto n° " + this.numPiatto + " pronto\n");
            pieno.release();

    }
    

    public int preleva() {
        try {
            pieno.acquire();
        } catch (InterruptedException ex) {

        }
        System.out.println("Consumo: " + this.numPiatto);
        vuoto.release();
        return this.numDipendente;
    }
}
