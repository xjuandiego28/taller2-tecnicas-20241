/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers;

/**
 *
 * @author saram
 */
import java.util.Scanner;

public class Reading {
    
     Scanner sc = new Scanner(System.in);
     
    public int leerInt(String mensaje){
        System.out.print(mensaje);
        int dato = sc.nextInt();
        return dato;
    }
    public String leerString(String mensaje){
        System.out.print(mensaje);
        String dato = sc.next();
        dato += sc.nextLine(); //garantizar lectura de la palabra completa
        return dato;
    }
    public Float leerFloat(String mensaje){
        System.out.print(mensaje);
        Float dato = sc.nextFloat();
        return dato;
    }
    
    public Float leerFloatRestricciones(String mensaje, int min, int max){
        Float dato;
        do{
            System.out.print(mensaje);
            dato = sc.nextFloat();
            if (dato<min || dato>max){
                System.out.println("Ingresa un número valido, dentro del rango " + min + " - " + max);
            }
        }while(dato<min || dato>max);
        return dato;
    }
    
    public Double leerDouble(String mensaje){
        System.out.print(mensaje);
        Double dato = sc.nextDouble();
        return dato;
    }
    
    public Double leerDoubleRestricciones(String mensaje, int min, int max){
        Double dato;
        do{
            System.out.print(mensaje);
            dato = sc.nextDouble();
            if (dato<min || dato>max){
                System.out.println("Ingresa un número valido, dentro del rango " + min + " - " + max);
            }
        }while(dato<min || dato>max);
        return dato;
    }

    public int leeryValidarInt(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.println("Debe ser número entero positivo");
            }
            dato = sc.nextInt();
            if(dato <= 0){
                System.out.println("El número debe ser positivo");
            }
        } while (dato <= 0);
        return dato;
    }
    
    public int leerIntRestricciones(String mensaje, int min, int max, String mensajeError){
        int dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("Debe ser número entero positivo");
            }
            dato = sc.nextInt();
            if(dato <= 0){
                System.out.println("El número debe ser positivo");
                System.out.println(mensajeError);
            }
            if (min>dato || dato>max){
                System.out.println(mensajeError);
            }
        }while (min>dato || dato>max || dato<=0);
        return dato;
    }
        public long leeryValidarLong(String mensaje) {
        long dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextLong()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("Debe ser número entero positivo");
            }
            dato = sc.nextLong();
            if(dato <= 0){
                System.out.println("El número debe ser positivo");
            }
        } while (dato <= 0);
        return dato;
    }
    
    public long leerLongRestricciones(String mensaje, long min, long max, String mensajeError){
        long dato;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextLong()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("Debe ser número entero positivo");
            }
            dato = sc.nextLong();
            if(dato <= 0){
                System.out.println("El número debe ser positivo");
                System.out.println(mensajeError);
            }
            if (min>dato || dato>max){
                System.out.println(mensajeError);
            }
        }while (min>dato || dato>max || dato<=0);
        return dato;
    }
    
    
}
