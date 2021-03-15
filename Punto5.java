/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author lbuel
 */
public class Punto5 
{
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Realizar las combinaciones de M elementos tomados de N en N");
            System.out.println("Introduzca n:");
            
            int n = sc.nextInt();
            int factorial1 = 1;
            if(n == 0)
                {
                    factorial1 = 1;
                }
            else if (n > 0)
                {
                    for(int i = n; i>0;i--)
                    {
                    factorial1=factorial1*i;
                    }
                }                         
            else if (n < 0)
                {
                    System.out.println("No se permiten numeros negativos" + "\n");   
                }
            
            System.out.println("Introduzca m:");
            int m = sc.nextInt();
            int factorial2 = 1;
            if (m == 0)
                {
                    factorial2 = 1;
                }
            else if (m > 0)
                {
                    for (int j = m; j>0;j--)
                    {
                        factorial2=factorial2*j;
                    }
                }    
            else if (m < 0)
                {
                    System.out.println("No se permiten numeros negativos" + "\n");   
                }
            
            int nmenosm = (n-m);            
            int factorial3 = 1;          
            if(nmenosm == 0)
                {
                    factorial3 = 1;
                }
            else if (nmenosm < 0)
                {
                    System.out.println("m no puede ser mayor que n" + "\n");   
                }
            else if (nmenosm>0)
                {
                    for(int k = nmenosm; k>0;k--)
                    {
                    factorial3=factorial3*k;
                    }
                }
            int resultado = factorial1/(factorial2*factorial3);
            System.out.println("Las combinaciones de m elementos tomados de n en n estan basadas en la siguiente formula:");
            System.out.println("(n/m) = " + n + "!" + "/" + m + "!" + "(" + n + "-" + m + "!)");  
            System.out.println("cuyo resultado es " + resultado);
        }   
}
