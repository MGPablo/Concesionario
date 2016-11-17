/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Pablo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Coche c1 = new Coche(Coche.OK, "4309 - BKG", 0);
        System.out.println(c1);
        Coche c2 = new Coche(23, "4309 - BKG", 0); //este lanza excepcion

        System.out.println(c1);
        // TODO code application logic here
    }

}
