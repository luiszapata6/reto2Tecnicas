
/* Desarrollado por:
   
   Fernando José Buelvas Betancourt
   Luis Fernando Zapata Ramírez
*/


package com.mycompany.luiszapatafernandobuelvasreto2;
import java.util.Scanner;

public class Reto2 {
  
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
       
       
       while(true){
        
        
        System.out.println("\nSeleccione una opción: \n");
        System.out.println("1. Tablas de multiplicar.");
        System.out.println("2. Calcular cuadrados de los n primeros enteros.");
        System.out.println("3. Calcular cubos de los n primeros enteros.");
        System.out.println("4. Retirar dinero. ");
        System.out.println("5. Ecuación con factoriales.");
        
        
        
           
        var x = input.nextInt();
        
       
           switch (x) {
               case 1:
                   Punto1();
                   break;
               case 2:
                   Punto2();
                   break;
               case 3:
                   Punto3();
                   break;
               case 4:
                   Punto4();
                   break;
               case 5:
                   Punto5();
               default:
                   System.out.println("Por favor seleccione una opción válida.\n");
                   break;
                   }
                }       
    }
        
      
        static void Punto1(){
       
        Scanner lector = new Scanner (System.in);
        System.out.print("\nInserte el maximo numero a multiplicar:\n");
        int n = lector.nextInt();
        System.out.print("\nInserte hasta que numero se van a multiplicar:\n");
        int m = lector.nextInt();
        if (n*-1 < 0 && m*-1 < 0 )
        {        
        for (int sumador = 1; sumador <= n; sumador++)
        {
            System.out.print("Tabla del " + sumador + " hasta el: " + m + "\n");
            for (int multiplicador = 1; multiplicador <=m; multiplicador++)
            {
                int X=multiplicador*sumador;
                System.out.print(X);
                System.out.println("\n");
            }
        }
        System.out.print("Éxito.\n");
        }
        else 
        {
            System.out.print("Por favor ingrese un número positivo.");
        }       
       
       }
       
       static void Punto2(){
           
          
           
           Scanner input = new Scanner(System.in);
           System.out.println("Punto 2:\n");
           System.out.println("¿De cuántos enteros desea calcular el cuadrado?");
           int n = input.nextInt();
           calculoCuadrado(n);
       }
           
           
        static int calculoCuadrado(int numero2){
           
                
           int cuadrado = 0;
           int cont = 0;
           int i;         
           if(numero2 >= 0){
           for(i = 1; cont < numero2; i = i+2){
                
                    cuadrado = cuadrado + i;
                    cont++;
                    System.out.println("El cuadrado de " + cont + " es = " + cuadrado + ".");
                      
           }} else{System.out.println("\nPor favor ingrese un entero positivo.");
           }
           System.out.println("\n");
           return cuadrado;
          }

       
       static void Punto3(){
           
           Scanner sc = new Scanner(System.in);
           System.out.println("Punto 3:");
           System.out.println("Inserte el numero de cubos a calcular:");
           int x = sc.nextInt();
           calculoCubo(x);
       }
           
           
       static int calculoCubo(int numero3){
           
           int impar = -1;
           int suma = 0;
           
            if (numero3 > 0){
        for (int i = 1; i <= numero3; i++) 
        {
            impar = impar + 2;
            suma = impar;
            for (int j = 2; j <= i; j++) 
            {
                impar = impar + 2;
                suma = suma + impar;
            }
        System.out.println("El cubo de " + i + " es = " + suma + ".");
        }
        }
    else 
    {
        System.out.println("\nPor favor inserte un numero entero positivo.");
    }return suma;
       }
           
       
       static void Punto4(){
       
           Scanner input = new Scanner(System.in);
           System.out.println("Punto 4:\n");
           System.out.println("¿Cuánto dinero desea retirar?");
           var n = input.nextInt();
           retiroCajero(n);
       }
           
           static int retiroCajero(int n){
               
               
           if(n>= 0){
           int cienmil = 0;
           int cincuenta = 0;
           int veinte = 0;
           int diez = 0;
           int cinco = 0;
           int dos = 0;
           int mil = 0;
           int quini = 0;
           int cien = 0;
           
           System.out.println("Por favor espere...\n");
           System.out.println("Usted ha retirado el valor de: " + n + " pesos.\n");
           System.out.println("El cajero ha entregado:\n");
           
           while(n >= 100000){
               n = n - 100000;
               cienmil++;
           } while(n >= 50000){
               n = n - 50000;
               cincuenta++;
           } while(n >= 20000){
               n = n - 20000;
               veinte++;
           } while(n >= 10000){
               n = n - 10000;
               diez++;
           } while(n >= 5000){
               n = n - 5000;
               cinco++;
           } while(n >= 2000){
               n = n - 2000;
               dos++;
           } while(n >= 1000){
               n = n - 1000;
               mil++;
           } while(n >= 500){
               n = n - 500;
               quini++;
           } while(n >= 100){
               n = n - 100;
               cien++;
           }
           
           if(cienmil == 1){
           System.out.println(cienmil + " billete de 100.000 pesos.");
           } else if(cienmil > 1){
               System.out.println(cienmil + " billetes de 100.000 pesos.");
           }
           if(cincuenta == 1){
           System.out.println(cincuenta + " billete de 50.000 pesos.");
           } else if(cincuenta > 1){
               System.out.println(cienmil + " billetes de 50.000 pesos.");
           }
           if(veinte == 1){
           System.out.println(veinte + " billete de 20.000 pesos.");
           } else if(veinte > 1){
               System.out.println(veinte + " billetes de 20.000 pesos.");
           }
           if(diez == 1){
           System.out.println(diez + " billete de 10.000 pesos.");
           } else if(diez > 1){
               System.out.println(diez + " billetes de 10.000 pesos.");
           } 
           if(cinco == 1){
           System.out.println(cinco + " billete de 5.000 pesos.");
           } else if(cinco > 1){
               System.out.println(cinco + " billetes de 5.000 pesos.");
           }
           if(dos == 1){
           System.out.println(dos + " billete de 2.000 pesos.");
           } else if(dos > 1){
               System.out.println(dos + " billetes de 2.000 pesos.");
           }
           if(mil == 1){
           System.out.println(mil + " billete de 1.000 pesos.");
           } else if(mil > 1){
               System.out.println(mil + " billetes de 1.000 pesos.");
           }
           if(quini == 1){
           System.out.println(quini + " moneda de 500 pesos.");
           } else if(quini > 1){
               System.out.println(quini + " monedas de 500 pesos.");
           }
           if(cien == 1){
           System.out.println(cien + " moneda de 100 pesos.");
           } else if(cien > 1){
                System.out.println(cien + " monedas de 100 pesos.");
           }
           }
           
          return n;
       } 
          
       
       static void Punto5(){
           
        Scanner input = new Scanner(System.in);
        System.out.println("Realizar las combinaciones de M elementos tomados de N en N.");
        System.out.println("Ingrese un número n: ");
        double n = input.nextDouble();
        System.out.println("Ingrese un número m:");
        double m = input.nextInt();
        double f1 = calculoFactorial(n);
        double f2 = calculoFactorial(m);
        double f3 = calculoFactorial(n-m);
        double resultado = f1/(f2*f3);
        System.out.println("Las combinaciones de m elementos tomados de n en n estan basadas en la siguiente formula:");
        System.out.println("(n/m) = " + n + "!" + "/" + m + "!" + "(" + n + "-" + m + ")!\n");  
        System.out.println("Cuyo resultado es " + resultado + "\n");
       }
           
            
        static double calculoFactorial(double n){
            
            double factorial = 1;
        
         if(n == 0)
                {
                    factorial = 1;
                }
            else if (n > 0)
                {
                    for(double i = n; i>0; i--)
                    {
                    factorial = factorial*i;
                    }
                }                         
            else if (n < 0)
                {
                    System.out.println("No se permiten numeros negativos" + "\n");   
                } 
            return factorial;
            
           
       }
 }