/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author Marcelo
 */
public class New {

    public static void main(String[] args) {
    //System.out.println("Hello World!");
   
    //public static void main(String[] args) {
      //Tipos de variables
        //int numero = 10;
        //String nombre = "Gregoria";
        //char letra = 'B';
        //double temperatura = 2.1;
        //boolean siONo = false;
        //long largo = 123456789L;
        //int num1, num2, resultado;
        //num1 = 4;
        //num2 = 2;

        //resultado = num1 * num2;
        //System.out.println("El resultado de la multiplicacion es de: " + resultado);
    

    //EJERCICIO:
    /*
    Realizar un programa que permita el intercambio de valores entre dos variables. 
    Por ejemplo: Si una variable número vale 35, y una variable número2 vale 20, 
    realizar las acciones necesarias para que el número pase a valer 20 y númweo2 
    pase a valer 35. Una vez realizado el cambio mostrar el resultado por pantalla.
    


  int num1, num2, aux;

  num1 = 35;
  num2 = 20;

  System.out.println("----Antes----");
  System.out.println("Num1 = " + num1);
  System.out.println("Num2 = " + num2);


  aux = num2;//aux pasa a valer 20
  num2 = num1;//num2 pasa a valer 35
  num1 = aux;//num1 pasa a valer aux(20)

  System.out.println("----Despues----");
  System.out.println("Num1 = " + num1);
  System.out.println("Num2 = " + num2);
  */


  //CONDICIONALES IF, ELSE

/*
    int uno = 5;
    int dos = 10;

    if (dos > uno) {
      System.out.println("La variable dos es mayor a la primera");
    } else {
      System.out.println("La variable mas grande es la primera");
    }
*/


    //CONDICIONAL SIMPLE (ANIDADOS)
    //IF|ELSE + IF|ELSE

    int uno = 20;
    int dos = 15;

    if (dos > uno) {
      System.out.println("La variable dos es mayor a la primera");
    } else {
      if( uno == dos){
        System.out.println("Ambas variables tienen el mismo valor");
      }else{
        System.out.println("La variable mayor es la primera");
      }
    }
}
}

//primero compilar con: javac src/main/java/org/yourcompany/yourproject/New.java
//luego ejecutar con: java -cp src/main/java org.yourcompany.yourproject.New
//si no ejecuta por muchos argumentos, usar comillas dobles
//PASOS CON LOS QUE EJECUTE: 
//cd "/d/Mis cosas/Programacion/Java/New"
//javac src/main/java/org/yourcompany/yourproject/New.java
//java -cp src/main/java org.yourcompany.yourproject.New
// VOLVER A COMPILAR LA CLASE ANTES DE EJECUTAR PARAR QUE SE GUARDEN LOS CAMBIOS