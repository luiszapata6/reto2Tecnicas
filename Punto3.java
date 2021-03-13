
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lbuel
 */
public class Punto3
        
{
    public static void main (String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int impar = -1;
    System.out.println("Punto 3:");
    System.out.println("Inserte el numero de cubos a calcular");
    int x = sc.nextInt();
    if (x > 0)
        {
    
        for (int i = 1; i <= x; i++) 
        {
            impar = impar + 2;
            int suma = impar;
            for (int j = 2; j <= i; j++) 
            {
                impar = impar + 2;
                suma = suma + impar;
            }
        System.out.println("El cubo de " + i + " es = " + suma);
        }
        }
    else 
    {
        System.out.println("Inserte un numero entero positivo");
    }
    }
}
    
