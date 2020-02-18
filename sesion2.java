/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import reloj.Reloj;

/**
 *
 * @author usuario
 */
public class sesion2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Reloj wacho= new Reloj(12, 18, 15);
        wacho.incrementarSegundo();
        wacho.incrementarMinuto();
        wacho.mostrarHora();
    }
    
}

