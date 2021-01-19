/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amati.mattia
 */
public class NewClass1 implements Runnable {
    String scelta;
    long tempo, dsf;
    boolean tf;

    public NewClass1(String scelta) {
        this.scelta = scelta;
        tf = true;
        tempo = 0;
        dsf = 0;
    }
    

    @Override
    public void run() {
        while(tf){
            if(scelta == "2"){
                tempo = 10;
                for (int i = 9; i != 0; i--) {
                    dsf = tempo;
                    tempo = i * tempo;
                    System.out.println(i + " * " + dsf + " = " + tempo);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
            }else if(scelta == "1"){
                tempo = 20;
                for(int i = 19; i != 0; i--){
                    dsf = tempo;
                    tempo = i * tempo;
                    System.out.println("                " + i + " * " + tempo + " = " + dsf);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            ferma();
        }
    }
    
    public void ferma(){
        tf = false;
    }

}
