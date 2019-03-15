/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaproperties;
// Fig. 19.21: PruebaProperties.java
 // Demuestra la clase Properties del paquete java.util.
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

 public class PruebaProperties
 {
 private Properties tabla;

 // establece la GUI para probar la tabla Properties
 public PruebaProperties()
 {
 tabla = new Properties(); // crea la tabla Properties

 // establece las propiedades
 tabla.setProperty( "color", "azul" );
 tabla.setProperty( "anchura", "200" );

 System.out.println( "Despues de establecer propiedades" );
 listarPropiedades(); // muestra los valores de las propiedades

 // reemplaza el valor de una propiedad
 tabla.setProperty( "color", "rojo" );

 System.out.println( "Despues de reemplazar propiedades" );
 listarPropiedades(); // muestra los valores de las propiedades

 guardarPropiedades(); // guarda las propiedades

 tabla.clear(); // vacia la tabla

System.out.println( "Despues de borrar propiedades" );
listarPropiedades(); // muestra los valores de las propiedades

cargarPropiedades(); // carga las propiedades

 // obtiene el valor de la propiedad color
 Object valor = tabla.getProperty( "color" );

 // comprueba si el valor está en la tabla
 if ( valor != null )
 System.out.printf( "El valor de la propiedad color es %s\n", valor );
 else
 System.out.println( "La propiedad color no está en la tabla" );
} // fin del constructor de PruebaProperties

 // guarda las propiedades en un archivo
 public void guardarPropiedades()
 {
 // guarda el contenido de la tabla
 try
 {
 FileOutputStream salida = new FileOutputStream( "props.dat" );
 tabla.store( salida, "Propiedades de ejemplo" ); // guarda las propiedades
 salida.close();
System.out.println( "Despues de guardar las propiedades" );
 listarPropiedades(); // muestra los valores de las propiedades
 } // fin de try
 catch ( IOException ioException )
 {
 ioException.printStackTrace();
 } // fin de catch
 } // fin del método guardarPropiedades

 // carga las propiedades de un archivo
 public void cargarPropiedades()
 {
 // carga el contenido de la tabla
 try
{
FileInputStream entrada = new FileInputStream( "props.dat" );
tabla.load( entrada ); // carga las propiedades
 entrada.close();
 System.out.println( "Después de cargar las propiedades" );
 listarPropiedades(); // muestra los valores de las propiedades
 } // fin de try
 catch ( IOException ioException )
 {
 ioException.printStackTrace();
 } // fin de catch
 } // fin del método cargarPropiedades

 // imprime los valores de las propiedades
 public void listarPropiedades()
 {
 Set< Object > claves = tabla.keySet(); // obtiene los nombres de las propiedades

 // imprime los pares nombre/valor
 for ( Object clave : claves )
 {
 System.out.printf(
 "%s\t%s\n", clave, tabla.getProperty( ( String ) clave ) );
 } // fin de for

 System.out.println();
 } // fin del método listarPropiedades

 public static void main( String args[] )
 {
 new PruebaProperties();
} // fin de main
} // fin de la clase PruebaProperties