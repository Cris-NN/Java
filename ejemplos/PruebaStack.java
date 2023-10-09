package ejemplos;

// Fig. 19.16: PruebaStack.java
// Programa para probar la clase java.util.Stack.
import java.util.Stack;
import java.util.EmptyStackException;

public class PruebaStack 
{
   public PruebaStack()
   {
      Stack< Number > pila = new Stack< Number >();  

      // crea n�meros para almacenarlos en la pila
      Long numeroLong = 12L;
      Integer numeroInt = 34567;
      Float numeroFloat = 1.0F;
      Double numeroDouble = 1234.5678;

      // usa el m�todo push
      pila.push( numeroLong ); // mete un long
      imprimirPila( pila );
      pila.push( numeroInt ); // mete un int
      imprimirPila( pila );
      pila.push( numeroFloat ); // mete un float
      imprimirPila( pila );
      pila.push( numeroDouble ); // mete un double
      imprimirPila( pila );

      // elimina los elementos de la pila
      try 
      {
         Number objetoEliminado = null;

         // saca elementos de la pila
         while ( !pila.isEmpty() ) 
         {
            objetoEliminado = pila.pop(); // usa el m�todo pop
            System.out.printf( "%s se saco\n", objetoEliminado );
            imprimirPila( pila );
         } // fin de while
      } // fin de try
      catch ( EmptyStackException emptyStackException ) 
      {
         emptyStackException.printStackTrace();
      } // fin de catch
   } // fin del constructor de PruebaStack
   
   private void imprimirPila( Stack< Number > pila )
   {
      if ( pila.isEmpty() )
         System.out.print( "la pila esta vacia\n\n" ); // la pila est� vac�a
      else  // la pila no est� vac�a
      {
         System.out.print( "la pila contiene: " );      
         
         // itera a trav�s de los elementos
         for ( Number numero : pila )
            System.out.printf( "%s ", numero );
      
         System.out.print( "(superior) \n\n" ); // indica la parte superior de la pila
      } // fin de else
   } // fin del m�todo imprimirPila
   
   public static void main( String args[] )
   {
      new PruebaStack();
   } // fin de main
} // fin de la clase PruebaStack


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/