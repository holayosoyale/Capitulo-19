/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos2;
// Fig. 19.15: Algoritmos2.java
 // Uso de los algoritmos addAll, frequency y disjoint.
import java.util.List;
import java.util.Vector;
import java.util.Arrays;
import java.util.Collections;

 public class Algoritmos2
 {
 private String[] colores = { "rojo", "blanco", "amarillo", "azul" };
 private List< String > lista;
 private Vector< String > vector = new Vector< String >();

 // crea objetos List y Vector
 // y los manipula con métodos de Collections
 public Algoritmos2()
 {
 // inicializa lista y vector
 lista = Arrays.asList( colores );
 vector.add( "negro" );
 vector.add( "rojo" );
 vector.add( "verde" );

 System.out.println( "Antes de addAll, el vector contiene: " );

 // muestra los elementos en el vector
 for ( String s : vector )
 System.out.printf( "%s ", s );

 // agrega los elementos en colores a lista
 Collections.addAll( vector, colores );

 System.out.println( "\n\nDespues de addAll, el vector contiene: " );

 // muestra los elementos en el vector
 for ( String s : vector )
 System.out.printf( "%s ", s );

 // obtiene la frecuencia de "rojo"
 int frecuencia = Collections.frequency( vector, "rojo" );
 System.out.printf(
 "\n\nFrecuencia de rojo en el vector: %d\n", frecuencia );

 // comprueba si lista y vector tienen elementos en común
 boolean desunion = Collections.disjoint( lista, vector );

 System.out.printf( "\nlista y vector %s elementos en comun\n",
 ( desunion ? "no tienen" : "tienen" ) );
 } // fin del constructor de Algoritmos2

 public static void main( String args[] )
 {
 new Algoritmos2();
 } // fin de main
} // fin de la clase Algoritmos2