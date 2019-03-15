/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conteotipopalabras;
// Fig. 19.20: ConteoTipoPalabras.java
 // Programa que cuenta el número de ocurrencias de cada palabra en una cadena
 import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

 public class ConteoTipoPalabras
 {
private Map< String, Integer > mapa;
private Scanner scanner;

 public ConteoTipoPalabras()
 {
 mapa = new HashMap< String, Integer >(); // crea objeto HashMap
 scanner = new Scanner( System.in ); // crea objeto scanner
 crearMap(); // crea un mapa con base en la entrada del usuario
 mostrarMap(); // muestra el contenido del mapa
 } // fin del constructor de ConteoTipoPalabras

 // crea mapa a partir de la entrada del usuario
 private void crearMap()
 {
 System.out.println( "Escriba una cadena:" ); // pide la entrada del usuario
 String entrada = scanner.nextLine();
 // crea objeto StringTokenizer para los datos de entrada
 StringTokenizer tokenizer = new StringTokenizer( entrada );

 // procesamiento del texto de entrada
 while ( tokenizer.hasMoreTokens() ) // mientras haya más entrada
 {
 String palabra = tokenizer.nextToken().toLowerCase(); // obtiene una palabra

 // si el mapa contiene la palabra
 if ( mapa.containsKey( palabra ) ) // está la palabra en el mapa?
{
 int cuenta = mapa.get( palabra ); // obtiene la cuenta actual
 mapa.put( palabra, cuenta + 1 ); // incrementa la cuenta
 } // fin de if
else
     mapa.put( palabra, 1 ); // agrega una nueva palabra con una cuenta de 1 al mapa
 } // fin de while
 } // fin del método crearMap

 // muestra el contenido del mapa
 private void mostrarMap()
 {
 Set< String > claves = mapa.keySet(); // obtiene las claves

 // ordena las claves
 TreeSet< String > clavesOrdenadas = new TreeSet< String >( claves );

 System.out.println( "El mapa contiene:\nClave\t\tValor" );

 // genera la salida para cada clave en el mapa
 for ( String clave : clavesOrdenadas )
 System.out.printf( "%-10s%10s\n", clave, mapa.get( clave ) );

 System.out.printf(
 "\nsize:%d\nisEmpty:%b\n", mapa.size(), mapa.isEmpty() );
 } // fin del método mostrarMap

 public static void main( String args[] )
 {
 new ConteoTipoPalabras();
 } // fin de main
 } // fin de la clase ConteoTipoPalabras