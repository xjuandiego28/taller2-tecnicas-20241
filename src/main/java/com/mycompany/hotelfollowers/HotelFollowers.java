/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelfollowers;

/**
 *
 * @author saram
 */
public class HotelFollowers {
    static Lectura lec = new Lectura();
    static Manager manager;
    static String nombreManager;
    static int idManager;
    static String locationManager;
    static int cantEmpleados;
    

    public static void main(String[] args) {
        System.out.println("SISTEMA DE ASIGNACIÓN DE TURNOS");
        System.out.println("Por favor ingresa tus datos para comenzar con el proceso");
        nombreManager = lec.leerString("Nombre: ");
        idManager = lec.leeryValidarInt("ID: ");
        locationManager = lec.leerString("Ubicación: ");
        manager = new Manager(nombreManager,idManager,locationManager);
        System.out.println("Bienvenido" + nombreManager );
        cantEmpleados = lec.leeryValidarInt("¿Cuantos empleados deseas asignar?");
        
    }
}
