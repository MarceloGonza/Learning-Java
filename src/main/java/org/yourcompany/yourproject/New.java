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
   //import java.util.Scanner;
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

/*
  double promedio;
  String condicionFinal;

  Scanner teclado = new Scanner(System.in);
  
  System.out.println("Ingrese el promedio general del alumno en TodoCode");
  promedio = teclado.nextDouble();

  condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
  System.out.println("La condicion final del alumno es: " + condicionFinal);

*/



//ESTRUCTURAS REPETITIVAS
  //WHILE

/*
  int cont = 0;

  while (cont <= 10){
    System.out.println("Estoy en la vuelta " + cont);
    cont = cont + 1 ;
    }
  */



 //BUCLES INFINITOS:
  /*
  CUANDO EL PROGRAMA NO TIENE UNA CONDION O NO ESTA CORRECTAMENTE ESTABLECIDA, EJ:
  int cont = 0;

  while (cont <= 10){
    System.out.println("Estoy en la vuelta " + cont);
    }

    //BUCLE INFINITO CONTROLADO POR CENTINELA:
    boolean centinela = true;

    while (centinela == true) {
    System.out.println("El valor de la bandera es "+ centinela);
    }
  */



  //ESTRUCTURAS REPETITIVAS: FOR
  //CONTROLADA POR CONTADOR
  //COMPUESTA POR INICIALIZACION DE VARIABLE, CONDICION DE FIN DE CICLO Y MODIFICACION DE VARIABLE

  
  //for (int cont = 0; cont <= 10; cont ++) {
    //System.out.println("Estoy en la vuelta " + cont);
  //}





  //EJERCICIO DE ESTRUCTURAS REPETITIVAS
  //Realizar un programa que dado por teclado un límite numérico por teclado, 
  //muestre en pantalla todos los números hasta ese límite (empezando por 1)
/*
  int numero;
  Scanner teclado = new Scanner(System.in);
  System.out.println("ingrese un numero para detener el bucle");

  numero = teclado.nextInt();

  for(int cont = 1; cont <= numero; cont ++){
    System.out.println("Numero: " + cont);
  }
*/



/*Realizar un programa que muestre por pantalla los numeros del 200 al 250 
saltando de 2 en 2

  for (int i = 200; i <= 250; i+=2) {
    System.out.println("Numero: " + i);
  }
*/



/*Realizar un programa que muestre en pantalla palabras que sean ingresadas
por teclado hasta que se ingrese la palabra "salir"

String palabra;
Scanner teclado = new Scanner(System.in);

System.out.println("Ingrese cualquier palabra. Para terminar el bucle escriba salir");
palabra = teclado.nextLine();

while(!palabra.equalsIgnoreCase("salir")){ //ignora si es mayuscula o minuscula
  System.out.println("Ha ingresado la palabra: " + palabra);
  System.out.println("Ingrese otra palabra, o escriba 'salir' para terminar: ");
  palabra = teclado.nextLine();
}

System.out.println("Programa finalizado. ");
teclado.close();
*/



/*
En una ciudad de Obera, Misiones, se realiza año a año la "Maratón del Inmigrante"
en el marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones
el dia anterior de la carrera, por lo que se desconoce la cantidad exacta de inscriptos que pueden 
llegar a haber. Desde la Federacion de Colectividades (Organismo que organiza), manifestaron que 
se solicitan los siguientes datos para la inscripcion de cada participante: dni, nombre y edad.
En cuanto a las categorias posibles para una inscripcion, se manejan las siguientes:

Menores A (6 a 10 años)
Menores B (de 11 a 17 años)
Juveniles (18 a 30 años)
Adultos (de 31 a 50 años)
Adultos mayores (mayores de 50 años)

Se necesita un programa que, a partir del ingreso de los datos y edad de cada 
participante, se muestre por pantalla a que categoria debe ser inscripto. 
Cabe destacar que, al finalizar el dia, para dar fin a las inscripciones, 
se debe ingresar un dni con el valor 0, y un nombre con la palabra "fin"

int edad;
Scanner teclado = new Scanner(System.in);

System.out.println("Ingrese su DNI: ");
int dni = teclado.nextInt();
teclado.nextLine();


System.out.println("Ingrese su Nombre Completo: ");
String nombre = teclado.nextLine();



if(dni == 0 && nombre.equals("fin")){
  System.out.println("Fin de inscripciones");
  teclado.close();
} else{
  Scanner ingreso = new Scanner(System.in);
  System.out.println("Ingrese su edad: ");
  edad = ingreso.nextInt();
if(edad >=6 && edad <=10){
  System.out.println("Usted debe inscribirse en la Categoria Menores A");
} else if (edad >=11 && edad <=17) {
    System.out.println("Usted debe inscribitse en la categoria Menores B");
} else if (edad >= 18 && edad <= 30) {
    System.out.println("Usted debe inscribise en la Categoria Juveniles");
} else if (edad >= 31 && edad <= 50) {
    System.out.println("Usted debe inscribirse en la categoria Adultos");
} else {
  System.out.println("Usted debe inscribirse en la categoria Adultos Mayores");
}
}
*/



//EJERCICIO ARBOL DE NAVIDAD
//IMPRIMIR POR CONSOLA UN ARBOLITO DE NAVIADAD

//declarar altura de arbol
/*
int altura = 10;

//bucle para recorrer todas las filas (altura)
for (int fila = 0; fila < altura; fila++){
  //bucle para los espacios
  for (int espacio = 0; espacio<(altura-fila-1);espacio ++){
    //                             4   - 0  - 1 = 3
    //                             4   - 1  - 1 = 2
    //                             4   - 2  - 1 = 1
    //                             4   - 3  - 1 = 0
    System.out.print(" ");
  }
  //buble para recorrer los asteriscos
  for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco ++){
    //                                   0  * 2  + 1 = 1
    //                                   1  * 2  + 1 = 3
    //                                   2  * 2  + 1 = 5
    //                                   3  * 2  + 1 = 7
    System.out.print("*");
  }
  System.out.println(""); //necessario para ir a la fila de abajo, si no coloca todo junto
}

//tronco
int largoTronco = 2;
for (int base = 0; base < largoTronco; base++){

//segun los espacios
  for(int espacio=0; espacio < (altura-2); espacio++){
    System.out.print(" ");
  }
  //barras tronco
  for(int tronco = 0; tronco < 3; tronco++){
    System.out.print("|");
  }
  System.out.println("");
}
*/ 






//VECTORES
//UNIDIMENSIONALES
/*
//Declaracion
int vector [] = new int [4]; // 0 1 2 3


//Asignacion (manual)
//vector [0] = 2;
//vector [1] = 35;
//vector [2] = 23;
//vector [3]= 56;


//Asignacion por teclado
Scanner teclado = new Scanner (System.in);
  for(int i = 0; i<vector.length; i++){
    System.out.println("Ingrese el valor para el indice " + i);
    vector[i] = teclado.nextInt();
  }

//recorrido
for(int i = 0; i<vector.length; i++){
  System.out.println("Estoy en el indice: " + i);
  System.out.println("Tengo guardado un " + vector[i]);
  System.out.println("-------------------");
}
*/





//MATRICES

//Declaracion
/* 
int matriz [][] = new int [3][3];

//Asignacion manual 

matriz [0][0] = 5;
matriz [0][1] = 13;
matriz [0] [2] = 96;
matriz [1] [0] = 35;
matriz [1] [1] = 33;
matriz [1] [2] = 71;
matriz [2] [0] = 446;
matriz [2] [1] = 228;
matriz [2][2] = 24;

// Recorrido

//ASIGNACION POR TECLADO
Scanner teclado = new Scanner (System.in);
for(int f = 0; f < 3; f++){ //f de fila
  for(int c = 0; c < 3; c ++){ //c de columna
    System.out.println("Ingrese el valor de la posicion f: " + f + " c: " + c);
    matriz[f][c] = teclado.nextInt();
  }
}
  

for(int f = 0; f < 3; f++){ //f de fila
  for(int c = 0; c < 3; c ++){ //c de columna
    System.out.println("El valor de la posicion f: " + f + "c: " + c);
    System.out.println("es de: "+ matriz [f] [c]);
  }
}
*/





//EJERCICIO 1
//REALIZAR UN PROGRAMA QUE PERMITA CARGAR 15 NUMEROS EN UN VECTOR.
//UNA VEZ CARGADOS, SE NECESITA QUE EL PROGRAMA CUENTE E INFORME POR
//PANTALLA CUANTAS VECES SE CARGÓ EL NUMERO 3 
/*

int vector [] = new int [15];
Scanner teclado = new Scanner (System.in);

//CARGA
for (int i = 0; i < vector.length; i++) {
    System.out.println("Ingrese un valor para el indice " + i);
    vector [i]= teclado.nextInt();
}

//LECTURA Y CONTAR LOS 3
int cont = 0;
for(int i = 0; i < vector.length; i++){ //lenght o 15 directamente
  if(vector[i] == 3){
    cont = cont +1;
  }
}
System.out.println("La cantidad de numeros 3 que hay en el vector es de: " + cont);
*/




/*
EJERCICIO 2:
En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.
cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa
que permita a un profesor cargar, en las posiciones (columnas) de cada fila, las notas al
alumnp y que en la ultima columna se calculen los promedios. Una vez realizados los calculos,
se desea mostrar las 3 notas de cada alumno y el promedio correspondiente recorriendo
la matriz

Double matriz[][] = new Double [4][4]; 

Scanner teclado = new Scanner(System.in);
Double suma = 0.0;

//Asignacion
for (int f = 0; f < 4; f++){
  for(int c = 0; c < 3; c ++){
    System.out.println("Ingrese la calificacion del alumno numero: " + f );
    matriz[f][c] = teclado.nextDouble();
    suma = suma + matriz[f][c];
  }
  matriz [f][3] = suma / 3;
  suma = 0.0;
}
//RECORRER
for (int f = 0; f < 4; f++){
  System.out.println("Las notas del alumno numero " + f + "son: ");
  for(int c = 0; c < 3; c ++){
    System.out.println("Nota numero " + c + " = " + matriz[f][c]);
    }
  System.out.println("El promedio de las notas es : " + matriz[f][3]);
  }
*/




/*
EJERCICIO 3
Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra,
Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa, y Ludmila. Realizar un recorrido
del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.


String vector [] = new String [8]; //indicar la cantidad de elementos, no confundir con posicion (no incluir 0)

vector [0] = "Alejandra";
vector [1] = "Leonardo";
vector [2] = "Rosa";
vector [3] = "Guillermo";
vector [4] = "Gabriel";
vector [5] = "Daniel";
vector [6] = "Luisa";
vector [7] = "Ludmila";

for(String variable : vector){ //for mejorado para iterar sobre arrays y colecciones
  System.out.println("Los nombres almacenados son: " + variable);
}
*/







/*
En tres vectores duferentes se guardan los nombres, temperaturas mínimas y máximas
de 5 ciudades de la provincia de Misiones. En el primer vector se guardan los nombres
de las ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero
las temperaturas máximas alcanzadas en la última semana. Se necesita un programa
que permita la carga de las ciudades, sus temperaturas mínimas y máximas; además,
deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja
y cuál con la temperatura más alta (dando a conocer la cantidad de grados).  
*/

//Ciudades
String ciudades [] = new String [5]; 
//Temp mínimas
Double minimas [] = new Double [5];
//Temp máximas
Double maximas [] = new Double[5];

//Scaner para cargar por teclado los nombres
Scanner teclado = new Scanner(System.in);
//Scanner paracargar los Doubles
Scanner teclado2 = new Scanner(System.in);

for(int i = 0; i < ciudades.length; i++){
  System.out.println("Ingrese el nombre de la ciudad: " + i);
  ciudades[i] = teclado.nextLine();

  System.out.println("Ingrese la minima de la ciudad " + i);
  minimas[i] = teclado2.nextDouble();

  System.out.println("Ingrese la maxima de la ciudad " + i);
  maximas[i] = teclado2.nextDouble();
  }

//variable auxiliar
Double minima = 9999999.00;
//variable posicion
int posMin = -1;
  //determinamos la minima
  for(int i = 0; i < minimas.length; i++){
    if(minimas[i] < minima){
      minima = minimas[i];
      posMin = i;
    }
  }
  //variable auxiliar para maximas
  Double maxima = -9999999.00;
  int posMax = -1;
  //determinamos la maxima
  for(int i = 0; i < maximas.length; i++){
    if(maximas[i] > maxima){
      maxima = maximas[i];
      posMax = i;
    }
  }
  System.out.println("La temperatura minima es de: " + minima);
  System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
  System.out.println("La temperatura maxima es de: " + maxima);
  System.out.println("Y se registro en la ciudad de: " + ciudades[posMax]);
}
}


//primero compilar con: javac src/main/java/org/yourcompany/yourproject/New.java
//luego ejecutar con: java -cp src/main/java org.yourcompany.yourproject.New
//si no ejecuta por muchos argumentos, usar comillas dobles
//import java.util.Scanner para usar el scanner
//PASOS CON LOS QUE EJECUTE: 
//cd "/d/Mis cosas/Programacion/Java/New"
//javac src/main/java/org/yourcompany/yourproject/New.java
//java -cp src/main/java org.yourcompany.yourproject.New
// VOLVER A COMPILAR LA CLASE ANTES DE EJECUTAR PARAR QUE SE GUARDEN LOS CAMBIOS