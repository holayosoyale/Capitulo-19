/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaamiento3;

import java.util.Comparator;

/**
 *
 * @author Alejandra
 */

    // Fig. 19.10: ComparadorTiempo.java
 // Clase Comparator personalizada que compara dos objetos Tiempo2.
 

 public class ComparadorTiempo implements Comparator< Tiempo2 >
 {
 public int compare( Tiempo2 tiempo1, Tiempo2 tiempo2 )
 {
 int compararHora = tiempo1.obtenerHora() - tiempo2.obtenerHora(); // compara la hora

 // evalúa la hora primero
 if ( compararHora != 0 )
 return compararHora;

 int comparaMinuto =
 tiempo1.obtenerMinuto() - tiempo2.obtenerMinuto(); // compara el minuto

 // después evalúa el minuto
 if ( comparaMinuto != 0 )
 return comparaMinuto;

 int compararSegundo =
 tiempo1.obtenerSegundo() - tiempo2.obtenerSegundo(); // compara el segundo

 return compararSegundo; // devuelve el resultado de comparar los segundos
 } // fin del método compare
 } // fin de la clase ComparadorTiempo


