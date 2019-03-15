/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaset;
// Fig. 19.18: PruebaSet.java
// Uso de un objeto HashSet para eliminar duplicados.
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

 public class PruebaSet
 {
 private static final String colores[] = { "rojo", "blanco", "azul",
 "verde", "gris", "naranja", "carne", "blanco", "cyan",
 "durazno", "gris", "naranja" };

 // crea e imprime un objeto ArrayList
 public PruebaSet()
 {
 List< String > lista = Arrays.asList( colores );
 System.out.printf( "ArrayList: %s\n", lista );
 imprimirSinDuplicados( lista );
 } // fin del constructor de PruebaSet

 // crea conjunto a partir del arreglo para eliminar duplicados
 private void imprimirSinDuplicados( Collection< String > coleccion )
 {
 // crea un objeto HashSet
 Set< String > conjunto = new HashSet< String >( coleccion );

 System.out.println( "\nLos valores sin duplicados son: " );

 for ( String s : conjunto )
 System.out.printf( "%s ", s );

 System.out.println();
 } // fin del método imprimirSinDuplicados

 public static void main( String args[] )
 {
 new PruebaSet();
 } // fin de main
 } // fin de la clase PruebaSet
