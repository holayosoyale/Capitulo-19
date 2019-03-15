/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos1;

// Fig. 19.13: Algoritmos1.java
 // Uso de los algoritmos reverse, fill, copy, min y max.
 import java.util.List;
 import java.util.Arrays;
 import java.util.Collections;

 public class Algoritmos1
 {
 private Character[] letras = { 'P', 'C', 'M' };
 private Character[] copiaLetras;
 private List< Character > lista;
 private List< Character > copiaLista;

 // crea un objeto List y lo manipula con los métodos de Collections
 public Algoritmos1()
 {
 lista = Arrays.asList( letras ); // obtiene el objeto List
copiaLetras = new Character[ 3 ];
 copiaLista = Arrays.asList( copiaLetras ); // vista List de copiaLetras

 System.out.println( "Lista inicial: " );
imprimir( lista );

 Collections.reverse( lista ); // invierte el orden
 System.out.println( "\nDespues de llamar a reverse: " );
 imprimir( lista );

 Collections.copy( copiaLista, lista ); // copia el objeto List
 System.out.println( "\nDespues de copy: " );
 imprimir( copiaLista );

 Collections.fill( lista, 'R' ); // llena la lista con Rs
System.out.println( "\nDespues de llamar a fill: " );
 imprimir( lista );
 } // fin del constructor de Algoritmos1

 // imprime la información del objeto List
 private void imprimir( List< Character > refLista )
 {
 System.out.print( "La lista es: " );

 for ( Character elemento : refLista )
 System.out.printf( "%s ", elemento );

 System.out.printf( "\nMax: %s", Collections.max( refLista ) );
 System.out.printf( " Min: %s\n", Collections.min( refLista ) );
 } // fin del método imprimir

 public static void main( String args[] )
 {
 new Algoritmos1();
 } // fin de main
 } // fin de la clase Algoritmos1