/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maast
 */
public class operaciones {
 
     public  int  suma( int a,  int b){
        return a+b;
    }

    public  int  resta( int a,  int b){
        return a-b;
    }
    
    public  int  multiplicacion( int a,  int b){
        return a*b;
    }
    
    public  int  division( int a,  int b){
        return a/b;
    } 
    
    
    public int exponencial(int base, int exponente){
        
     int resultado = (int) Math.pow(base, exponente);  
    return resultado;
    }
    
    public double raiz(int a){
     double result=Math.sqrt(a);   
    return result;
    }
    
    public double porcentaje(double porcentaje, double numero){
        double resultado=numero*(porcentaje/100);
        return resultado;
    }
    
    
    
}
