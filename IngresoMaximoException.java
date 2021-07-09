/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop10;

/**
 *
 * @author drago
 */
public class IngresoMaximoException extends Exception{

    public IngresoMaximoException() {
        super("No puedes ingresar más de $20,000");
    }
    
    
}
