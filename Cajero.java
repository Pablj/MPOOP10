/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop10;

import java.util.logging.Level;
import java.util.logging.Logger;

/** 3 retirto/20 000 retiro
 *
 * @author drago
 */
public class Cajero {
    
    public static void main(String[] args) {
        try {
            Cuenta cuenta = new Cuenta();
            cuenta.getSaldo();
            cuenta.depositar(1000);
            cuenta.getSaldo();
            cuenta.retirar(500);
            cuenta.getSaldo();
            cuenta.retirar(200);
            cuenta.getSaldo();
            cuenta.retirar(10);
            cuenta.getSaldo();
            cuenta.retirar(10);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("No cuentas con el saldo suficiente");
            Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IngresoMaximoException ex) {
            System.out.println("No se puede depositar más de $20,000.00");
            Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RetirosPermitidosException ex) {
            System.out.println("No se puede retirar más de 3 veces por día");
            Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
