/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabusquedabinaria;

// Fig. 19.14: PruebaBusquedaBinaria.java
// Uso del algoritmo binarySearch.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

 public class PruebaBusquedaBinaria
 {
 private static final String colores[] = { "rojo", "blanco",
 "azul", "negro", "amarillo", "morado", "carne", "rosa" };
 private List< String > lista; // referencia ArrayList

 // crea, ordena e imprime la lista
 public PruebaBusquedaBinaria()
 {
 lista = new ArrayList< String >( Arrays.asList( colores ) );
 Collections.sort( lista ); // ordena el objeto ArrayList
 System.out.printf( "ArrayList ordenado: %s\n", lista );
 } // fin del constructor de PruebaBusquedaBinaria

 // busca varios valores en la lista
 private void buscar()
 {
 imprimirResultadosBusqueda( colores[ 3 ] ); // primer elemento
 imprimirResultadosBusqueda( colores[ 0 ] ); // elemento medio
 imprimirResultadosBusqueda( colores[ 7 ] ); // último elemento
 imprimirResultadosBusqueda( "aqua" ); // debajo del menor
 imprimirResultadosBusqueda( "gris" ); // no existe
 imprimirResultadosBusqueda( "verdeazulado" ); // no existe
 } // fin del método buscar

 // método ayudante para realizar búsquedas
 private void imprimirResultadosBusqueda( String clave )
 {
 int resultado = 0;

 System.out.printf( "\nBuscando: %s\n", clave );
 resultado = Collections.binarySearch( lista, clave );

 if ( resultado >= 0 )
 System.out.printf( "Se encontro en el indice %d\n", resultado );
 else
 System.out.printf( "No se encontro (%d)\n",resultado );
 } // fin del método imprimirResultadosBusqueda

 public static void main( String args[] )
 {
 PruebaBusquedaBinaria pruebaBusquedaBinaria = new PruebaBusquedaBinaria();
pruebaBusquedaBinaria.buscar();
 } // fin de main
 } // fin de la clase PruebaBusquedaBinaria