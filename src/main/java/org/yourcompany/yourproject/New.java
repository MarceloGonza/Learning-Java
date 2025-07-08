/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.util.Scanner;
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

/*
    int uno = 10;
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
*/

  //CONDICIONAL SWITCH

/*
  int dia = 2;
  String nombreDia;

  switch (dia) {
    case 1: nombreDia = "Lunes";
    break;
    case 2: nombreDia = "Martes";
    break;
    case 3: nombreDia = "Miercoles";
    break;
    case 4: nombreDia = "Jueves";
    break;
    case 5: nombreDia = "Viernes";
    break;
    case 6: nombreDia = "Sabado";
    break;
    case 7: nombreDia = "Domingo";
    break;
    default: nombreDia = "Numero de dia invalido";
  }
  System.out.println("El dia de la semana seleccionado es: " + nombreDia);
}
*/

//EJERCICIO CONDICIONALES
/*
Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de los mismos 
pueden tener 3 categorías: 1-repositor, 2-cajero, 3-supervisor.
.Los repositores cobran $15.890 + bono 10%
.Los cajeros cobran $25.630,89 fijos
.Los supervisores cobran $35.520,20 en bruto al cual se les descuenta un 11% de jubilacion
Se necesita un programa que, dependiendo del tipo de empleado del que se trate calcule
y muestre en pantalla el correspondiente sueldo


String Puesto = "Super";
String Repo = "Repo";
String Caje = "Caje";
String Super = "Super";
double repositor = 15890;
double porcRepo = 10.0;
double totalRepo = repositor + (repositor * (porcRepo / 100));

double cajero = 25630.89;

double supervisor = 35520.20;
double porcSuper = 0.11;
double totalSuper = supervisor - (supervisor * porcSuper);

if (Puesto.equals(Repo)){
  System.out.println("El sueldo del repositor es de: " + totalRepo);
} else if (Puesto.equals(Caje)) {
  System.out.println("El sueldo del cajero es de: " + cajero);
} else if (Puesto.equals(Super)){
  System.out.println("El sueldo del supervisor es de: " + totalSuper);
}
*/
 /*
double sueldo = 0;
int categoria;

System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
Scanner teclado = new Scanner (System.in);//permite ingresar datos por teclado

categoria = teclado.nextInt();//lee enteros por teclados, el proximo entero que ingrese se le asignara a categoria

if (categoria == 1) {
  sueldo = 15890 + (15890 * 0.10);
} else if(categoria == 2) {
  sueldo = 25630.89;
} else if(categoria == 3){
  sueldo = 35560.20 - (35560.20 * 0.11);
} else {
  System.out.println("El numero ingresado no es valido");
}

if(categoria == 1 || categoria == 2 || categoria == 3){
System.out.println("El total del sueldo para la categoria seleccionada " +  categoria + " es igual a: $" + sueldo);
}
*/


  //Operador ternario

  double promedio;
  String condicionFinal;

  Scanner teclado = new Scanner(System.in);
  
  System.out.println("Ingrese el promedio general del alumno en TodoCode");
  promedio = teclado.nextDouble();

  condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
  System.out.println("La condicion final del alumno es: " + condicionFinal);
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