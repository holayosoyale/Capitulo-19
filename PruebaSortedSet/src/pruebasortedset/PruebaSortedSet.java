/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasortedset;
// Fig. 19.19: PruebaSortedSet.java
 // Uso de TreeSet y SortedSet.
 import java.util.Arrays;
 import java.util.SortedSet;
 import java.util.TreeSet;

 public class PruebaSortedSet
 {
 private static final String nombres[] = { "amarillo", "verde",
 "negro", "carne", "gris", "blanco", "naranja", "rojo", "verde" };

 // crea un conjunto ordenado con TreeSet, y después lo manipula
 public PruebaSortedSet()
 {
 // crea objeto TreeSet
 SortedSet< String > arbol =
 new TreeSet< String >( Arrays.asList( nombres ) );

 System.out.println( "conjunto ordenado: " );
 imprimirConjunto( arbol ); // imprime el contenido del arbol

 // obtiene subconjunto mediante headSet, con base en "naranja"
 System.out.print( "\nheadSet (\"naranja\"): " );
 imprimirConjunto( arbol.headSet( "naranja" ) );

 // obtiene subconjunto mediante tailSet, con base en "naranja"
 System.out.print( "tailSet (\"naranja\"): " );
 imprimirConjunto( arbol.tailSet( "naranja" ) );

 // obtiene los elementos primero y último
 System.out.printf( "primero: %s\n", arbol.first() );
 System.out.printf( "ultimo : %s\n", arbol.last() );
 } // fin del constructor de PruebaSortedSet

 // imprime el conjunto en pantalla
 private void imprimirConjunto( SortedSet< String > conjunto )
 {
 for ( String s : conjunto )
     System.out.printf( "%s " , s );
 System.out.println();
 } // fin del método imprimirConjunto

 public static void main( String args[] )
{
 new PruebaSortedSet();
 } // fin de main
 } // fin de la clase PruebaSortedSet