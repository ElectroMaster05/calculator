/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maast
 */
public class calculatorTest {
   
    operaciones operacion1=new operaciones();
    
 @Test
 public void testSuma1(){
     assertEquals(5,operacion1.suma(3, 2));
 }
 
  @Test
 public void testSuma2(){
     assertEquals(-3,operacion1.suma(-1, -2));
 }
 
   @Test
 public void testResta1(){
     assertEquals(3,operacion1.resta(5, 2));
 }
 
    @Test
 public void testMultiplicacion1(){
     assertEquals(10,operacion1.multiplicacion(5, 2));
 }
 
    @Test
 public void testMultiplicacion2(){
     assertEquals(24,operacion1.multiplicacion(4, 6));
 }
 
    @Test
 public void testDivicion1(){
     assertEquals(3,operacion1.division(6, 2));
 }
 
     @Test
 public void testDivicion2(){
     assertEquals(5,operacion1.division(10, 2));
 }
 
   @Test
 public void testExponencial1(){
     assertEquals(8,operacion1.exponencial(2, 3));
 }
 
    @Test
 public void testExponencial2(){
     assertEquals(125,operacion1.exponencial(5, 3));
 }
 
 
    @Test
 public void testRaiz1(){
     assertEquals(5,operacion1.raiz(25));
 }
 
 
   @Test
 public void testRaiz2(){
     assertEquals(3,operacion1.raiz(9));
 }
 
   @Test
 public void testPorcentaje1(){
     assertEquals(25,operacion1.porcentaje(25,100));
 }
 
  @Test
 public void testPorcentaje2(){
     assertEquals(100,operacion1.porcentaje(50,200));
 }
 
 
 
    public calculatorTest() {
        
        
        
        
    }
    
    
    
}
