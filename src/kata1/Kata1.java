/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person a = new Person("Pepe",new GregorianCalendar(1971,11,09));
        GregorianCalendar fecha = new GregorianCalendar(2020,03,12);
        System.out.println(a.getName() + " tiene " + a.getAge(fecha) + " años");
    }
    
}
