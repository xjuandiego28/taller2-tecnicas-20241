/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelfollowers;

/**
 *
 * @author saram
 */
public class HotelFollowers {
    static Reading lec = new Reading();
    static Manager manager;
    static String nombreManager;
    static int idManager;
    static String locationManager;
    static long phoneManager;
    
    

    public static void main(String[] args) {
        System.out.println("SISTEMA DE ASIGNACIÓN DE TURNOS");
        System.out.println("Por favor ingresa tus datos para comenzar con el proceso");
        nombreManager = lec.leerString("Nombre: ");
        idManager = lec.leeryValidarInt("ID: ");
        locationManager = lec.leerString("Ubicación: ");
        phoneManager = lec.leeryValidarLong("Número de teléfono: ");
        manager = new Manager(nombreManager,idManager,locationManager, phoneManager);
        System.out.println("Bienvenido " + nombreManager );
        manager.manageStaff();
    }
}
