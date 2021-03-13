
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
public class punto1 
{
    public static void main (String[] args)
    {
      
        Scanner lector = new Scanner (System.in);
        System.out.print("\nInserte el maximo numero a multiplicar\n");
        int n = lector.nextInt();
        System.out.print("\nInserte hasta que numero se van a multiplicar\n");
        int m = lector.nextInt();
        if (n*-1 < 0 && m*-1 < 0 )
        {        
        for (int sumador = 1; sumador <= n; sumador++)
        {
            System.out.print("Tabla del " + sumador + " hasta el " + m + "\n");
            for (int multiplicador = 1; multiplicador <=m; multiplicador++)
            {
                int X=multiplicador*sumador;
                System.out.print(X);
                System.out.println("\n");
            }
        }
        System.out.print("Exito\n");
        }
        else 
        {
            System.out.print("Ningun numero incresado debe ser negativo");
        }       
    }
}
