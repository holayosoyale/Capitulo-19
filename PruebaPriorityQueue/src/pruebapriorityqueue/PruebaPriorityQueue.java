/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapriorityqueue;

// Fig. 19.17: PruebaPriorityQueue.java
 // Programa de prueba de la clase PriorityQueue de la biblioteca estándar.
 import java.util.PriorityQueue;

 public class PruebaPriorityQueue
 {
 public static void main( String args[] )
 {
 // cola con capacidad de 11
 PriorityQueue< Double > cola = new PriorityQueue< Double >();

// inserta elementos en la cola
cola.offer( 3.2 );
 cola.offer( 9.8 );
 cola.offer( 5.4 );

 System.out.print( "Sondeando de cola: " );

 // muestra los elementos en la cola
 while ( cola.size() > 0 )
 {
 System.out.printf( "%.1f ", cola.peek() ); // ve el elemento superior
 cola.poll(); // elimina el elemento superior
 } // fin de while
 } // fin de main
 } // fin de la clase PruebaPriorityQueue
