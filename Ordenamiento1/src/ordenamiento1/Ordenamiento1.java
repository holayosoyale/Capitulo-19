/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento1;
// Fig. 19.8: Ordenamiento1.java
// Uso del algoritmo sort.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

 public class Ordenamiento1
 {
 private static final String palos[] =
 { "Corazones", "Diamantes", "Bastos", "Espadas" };

 // muestra los elementos del arreglo
 public void imprimirElementos()
 {
List< String > lista = Arrays.asList( palos ); // crea objeto List
// imprime lista
System.out.printf( "Elementos del arreglo desordenados:\n%s\n", lista );

 Collections.sort( lista ); // ordena ArrayList

 // imprime lista
 System.out.printf( "Elementos del arreglo ordenados:\n%s\n", lista );
 } // fin del método imprimirElementos

 public static void main( String args[] )
 {
 Ordenamiento1 orden1 = new Ordenamiento1();
 orden1.imprimirElementos();
 } // fin de main
} // fin de la clase Ordenamiento1