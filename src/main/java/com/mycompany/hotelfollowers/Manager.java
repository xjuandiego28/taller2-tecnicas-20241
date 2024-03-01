/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers;

/**
 *
 * @author saram
 */
public class Manager {
    static Lectura lec = new Lectura();
    private String name;
    private int id;
    private String location;
    private int phoneNo;
    static int cantEmpleados;

    public Manager(String name, int id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }
    
    public static void manageStaff(){
        System.out.println("Método para el manejo de personal");
        cantEmpleados = lec.leeryValidarInt("¿Cuantos empleados deseas asignar?");
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
            
}
