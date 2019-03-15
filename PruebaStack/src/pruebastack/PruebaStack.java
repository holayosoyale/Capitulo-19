/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebastack;
// Fig. 19.16: PruebaStack.java
 // Programa para probar la clase java.util.Stack.
 import java.util.Stack;
 import java.util.EmptyStackException;

 public class PruebaStack
 {
 public PruebaStack()
 {
 Stack< Number > pila = new Stack<  >();

 // crea números para almacenarlos en la pila
 Long numeroLong = 12L;
 Integer numeroInt = 34567;
 Float numeroFloat = 1.0F;
 Double numeroDouble = 1234.5678;

 // usa el método push
 pila.push( numeroLong ); // mete un long
 imprimirPila( pila );
 pila.push( numeroInt ); // mete un int
 imprimirPila( pila );
 pila.push( numeroFloat ); // mete un float
 imprimirPila( pila );
 pila.push( numeroDouble ); // mete un double
 imprimirPila( pila );

 // elimina los elementos de la pila
try
{
    Number objetoEliminado = null;

 // saca elementos de la pila
 while ( true )
 {
     objetoEliminado = pila.pop(); // usa el método pop
 System.out.printf( "%s se saco\n", objetoEliminado );
 imprimirPila( pila );
 } // fin de while
 } // fin de try
catch ( EmptyStackException emptyStackException )
 {
    emptyStackException.printStackTrace();
 } // fin de catch
 } // fin del constructor de PruebaStack

 private void imprimirPila( Stack< Number > pila )
 {
 if ( pila.isEmpty() )
 System.out.print( "la pila esta vacia\n\n" ); // la pila está vacía
 else // la pila no está vacía
{
 System.out.print( "la pila contiene: " );

 // itera a través de los elementos
 for ( Number numero : pila )
 System.out.printf( "%s ", numero );
    System.out.println("(superior) \\n\\n");// indica la parte superior de la pila
 
 } // fin de else
 } // fin del método imprimirPila

 public static void main( String args[] )
 {
    new PruebaStack();
 } // fin de main
 } // fin de la clase PruebaStack