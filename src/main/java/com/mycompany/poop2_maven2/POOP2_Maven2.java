package com.mycompany.poop2_maven2;

/**
 *
 * @author Guadalupe Nikole Calderón Gómez
 */
import java.util.Scanner;

public class POOP2_Maven2 {
    
    public static void main(String[] args) {
        //Declaracióon de variable
        float area;
        int opcion;
        final float PI = 3.1416f;
        
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Elige una opción");
            System.out.println("1. Área del circulo");
            System.out.println("2. Área del triángulo");
            System.out.println("3. Área del cuadrado");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1: 
                    //Circulo
                    System.out.println("Seleccionó el circulo");
                    float radio = 15;
                    area = PI * radio * radio;
                    break;
                case 2: 
                    //Triángulo 
                    System.out.println("Seleccionó el triángulo");
                    float base = 8, altura = 5;
                    area = (base * altura) / 2;
                    break;
                case 3: 
                    //Cuadrado
                    System.out.println("Seleccionó el cuadrado");
                    float lado = 10;
                    area = lado * lado;
                    break;
                case 4: 
                    //Salir 
                    System.out.println("Hasta luego");
                    continue;
                default:
                    //Ninguno de los anteriores
                    System.out.println("Su elección no es correcta");
                    continue;
            }
            System.out.println("El área es: " + area);
            } while (opcion != 4);
        sc.close();

    }
}
