/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author amati.mattia
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t = new Thread(new NewClass1("1"));
        Thread tt = new Thread(new NewClass1("2"));
        t.start();
        tt.start();
    }

}
