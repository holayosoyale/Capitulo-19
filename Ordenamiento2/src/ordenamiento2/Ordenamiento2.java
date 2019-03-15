/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento2;
// Fig. 19.9: Ordenamiento2.java
 // Uso de un objeto Comparator con el algoritmo sort.
 import java.util.List;
 import java.util.Arrays;
 import java.util.Collections;

 public class Ordenamiento2
 {
 private static final String palos[] =
 { "Corazones", "Diamantes", "Bastos", "Espadas" };

 // imprime los elementos del objeto List
 public void imprimirElementos()
 {
 List< String > lista = Arrays.asList( palos ); // crea objeto List

 // imprime los elementos del objeto List
 System.out.printf( "Elementos del arreglo desordenados:\n%s\n", lista );

 // ordena en forma descendente, utilizando un comparador
 Collections.sort( lista, Collections.reverseOrder() );

 // imprime los elementos del objeto List
System.out.printf( "Elementos de lista ordenados:\n%s\n", lista );
 } // fin del método imprimirElementos

 public static void main( String args[] )
 {
 Ordenamiento2 ordenamiento = new Ordenamiento2();
 ordenamiento.imprimirElementos();
 } // fin de main
} // fin de la clase Ordenamiento2