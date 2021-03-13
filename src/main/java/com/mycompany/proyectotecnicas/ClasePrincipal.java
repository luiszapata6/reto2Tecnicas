package com.mycompany.proyectotecnicas;
import java.util.Scanner;

public class ClasePrincipal {
  
    public static void main (String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       
       while(true){
           
        System.out.println("Seleccione una opción: \n");
        System.out.println("2. Calcular cuadrado de los n primeros enteros.");
        System.out.println("3. Retirar dinero. ");
           
        var x = input.nextInt();
        
       
           switch (x) {
               case 2:
                   Punto2();
                   break;
               case 3:
                   Punto3();
                   break;
               default:
                   System.out.println("Por favor seleccione una opción válida.\n");
                   break;
           }
       
}
    }
       static void Punto2(){
           
           Scanner input = new Scanner(System.in);
           System.out.println("Punto 2:\n");
           System.out.println("¿De cuántos enteros desea calcular el cuadrado?");
           var n = input.nextInt();
           var cuadrado = 0;
           int cont = 0;
       
  
           for(int i = 0; cont < n; i++){
                if(i % 2 != 0){
                    cuadrado = cuadrado + i;
                    cont++;
                    System.out.println("El cuadrado de " + cont + " es " + cuadrado + ".");
                      }
                  } System.out.println("\n");
          }
       
       static void Punto3(){
       
           Scanner input = new Scanner(System.in);
           System.out.println("Punto 3:\n");
           System.out.println("¿Cuánto dinero desea retirar?");
           
           var n = input.nextInt();
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
}



