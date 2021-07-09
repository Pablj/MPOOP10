/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop10;

/**
 *
 * @author bigva_001
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensajes[] = {"primeto, segundo, tercero"}; 
        try{
            for (int i = 0; i <=3; i++) {
                System.out.println(mensajes[i]);

            }
        }catch(ArrayIndexOutOfBoundsException aioob){
            System.out.println("Error tu apuntador se salio de rango");
        }
        System.out.println("#######Ej2###########");
        int a=99, b=0;
        try{
            int c = a/b;
            System.out.println("c ="+c);
        }catch(ArrayIndexOutOfBoundsException aioob){
            System.out.println("Error tu apuntador se salio de rango");    
        }catch(ArithmeticException ae){
            System.out.println("Error, no puedess dividir entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta lo de finally");
        }
        
        System.out.println("#######Ej3###########");
        try{
              int division = miMetodo(10,0);
            System.out.println("division ="+division);
        }catch(ArithmeticException ae){
            System.out.println("Excepcion aritmetica");
            }
        System.out.println("Mi programa sigue vivo");
        }
    public static int miMetodo(int a, int b) throws ArithmeticException {//Indico que se puede lanzar una exception//w
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    
}    
}