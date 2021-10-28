/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maast
 */
public class calculator {
    
    public static void main(String[] args) {
        
    operaciones operacion1=new operaciones();
        System.out.println("la suma es:"+operacion1.suma(3, 2));
        System.out.println("la resta es:"+operacion1.resta(3, 2));
        System.out.println("la multiplicacion es:"+operacion1.multiplicacion(3, 2));
        System.out.println("la division  es:"+operacion1.division(6, 2));
    }
    
    
    
}
