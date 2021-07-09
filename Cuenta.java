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
public class Cuenta {
    private double saldo;
    private int contador;

    public Cuenta() {
        this.saldo = 0;
    }
    
    public void depositar(double monto) throws IngresoMaximoException{
        System.out.println("Tratando de depositar:"+monto);
        if (monto>20000) {
            throw new IngresoMaximoException();
        }
        saldo+=monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException, RetirosPermitidosException{
        System.out.println("Tratando de retirar "+monto);
        if(contador>=3){
            throw new RetirosPermitidosException();
        }else if(saldo < monto){
            throw new SaldoInsuficienteException();
        }
        saldo-=monto;
        contador ++;
    }

    public double getSaldo() {
        System.out.println("Saldo="+saldo);
        return  saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }


}