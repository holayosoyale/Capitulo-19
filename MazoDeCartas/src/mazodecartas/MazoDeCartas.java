/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazodecartas;
// Fig. 19.12: MazoDeCartas.java
 // Uso del algoritmo shuffle.
 import java.util.List;
 import java.util.Arrays;
 import java.util.Collections;

 // clase para representar un objeto Carta en un mazo de cartas
 class Carta
 {
 public static enum Cara { As, Dos, Tres, Cuatro, Cinco, Seis,
 Siete, Ocho, Nueve, Diez, Joto, Quina, Rey };
 public static enum Palo { Bastos, Diamantes, Corazones, Espadas };

 private final Cara cara; // cara de la carta
 private final Palo palo; // palo de la carta

 // constructor con dos argumentos
 public Carta( Cara caraCarta, Palo paloCarta )
{
cara = caraCarta; // inicializa la cara de la carta
palo = paloCarta; // inicializa el palo de la carta
 } // fin del constructor de Carta con dos argumentos
// devuelve la cara de la carta
public Cara obtenerCara()
{
return cara;
} // fin del método obtenerCara

 // devuelve el palo de la Carta
 public Palo obtenerPalo()
 {
 return palo;
 } // fin del método obtenerPalo

 // devuelve la representación String de la Carta
 public String toString()
 {
 return String.format( "%s de %s", cara, palo );
 } // fin del método toString
 } // fin de la clase Carta

 // declaración de la clase MazoDeCartas
 public class MazoDeCartas
 {
 private List< Carta > lista; // declara objeto List que almacenará los objetos Carta

 // establece mazo de objetos Carta y baraja
 public MazoDeCartas()
 {
 Carta[] mazo = new Carta[ 52 ];
int cuenta = 0; // número de cartas

 // llena el mazo con objetos Carta
 for ( Carta.Palo palo : Carta.Palo.values() )
 {
 for ( Carta.Cara cara : Carta.Cara.values() )
 {
mazo[ cuenta ] = new Carta( cara, palo );
cuenta++;
} // fin de for
} // fin de for

 lista = Arrays.asList( mazo ); // obtiene objeto List
 Collections.shuffle( lista ); // baraja el mazo
 } // fin del constructor de MazoDeCartas

 // imprime el mazo
 public void imprimirCartas()
 {
 // muestra las 52 cartas en dos columnas
 for ( int i = 0; i < lista.size(); i++ )
System.out.printf( "%-20s%s", lista.get( i ),
( ( i + 1 ) % 2 == 0 ) ? "\n" : "\t" );
 } // fin del método imprimirCartas

 public static void main( String args[] )
 {
 MazoDeCartas cartas = new MazoDeCartas();
 cartas.imprimirCartas();
 } // fin de main
} // fin de la clase MazoDeCartas