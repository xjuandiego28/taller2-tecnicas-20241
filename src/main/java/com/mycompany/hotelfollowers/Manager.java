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

    static Reading lec = new Reading();
    static Employee empleado;
    private String name;
    private int id;
    private String location;
    private int phoneNo;
    static int cantEmpleados;

    public Manager(String name, int id, String location, int phoneNo) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.phoneNo = phoneNo;
    }
    
    public static void manageStaff(){
        System.out.println("Método para el manejo de personal");
        cantEmpleados = lec.leeryValidarInt("¿Cuantos empleados deseas asignar?");
        String nombreEmpleado;
        int id;
        String locationEmpleado;
        int horasTurno;
        int inicioTurno;
        int finTurno;
        
        //Variables de la clase
        int rolEmpleado;
        
        for (int x=1; x <= cantEmpleados; x++){
            System.out.println("Empleado #"+(x));
            nombreEmpleado = lec.leerString("Nombre: ");
            id = lec.leeryValidarInt("ID: ");
            locationEmpleado = lec.leerString("Ubicación: ");
            
            rolEmpleado = lec.leerIntRestricciones("Selecciona el cargo que deseas asignar:\n1) Chef\n2)Recepcionista\n3)Aseo", 0, 4, "Revisa bien las opciones de cargos");
            switch (rolEmpleado){
                case 1: System.out.println("Chef");
                case 2: System.out.println("Recepcionista");
                case 3: System.out.println("Aseo");
            } 
            
            horasTurno = lec.leerIntRestricciones("¿Cuantas horas durará su turno?", 0, 10, "El turno debe durar minimo una hora"
                    + " y hay un límite de 10 horas");
            inicioTurno = lec.leerIntRestricciones("Hora de inicio: ", -1, 24, "Porfavor inidica la hora usando tiempo militar,"
                    + " y los turnos comienzan y empiezan en horas en punto.");
            finTurno = lec.leerIntRestricciones("Fin del turno: ", -1, 24, "Porfavor inidica la hora usando tiempo militar,"
                    + " y los turnos comienzan y empiezan en horas en punto.");
            empleado = new Employee(nombreEmpleado, id, locationEmpleado, horasTurno, inicioTurno, finTurno);
            System.out.println("Acabas de asignar un turno para "+ nombreEmpleado + " en la ubicación " + locationEmpleado + 
                    ", la duración de su turno es de " + horasTurno + " horas. Inicia a las " + inicioTurno + 
                     " y termina a las " + finTurno);
        }
        
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

    public static Reading getLec() {
        return lec;
    }

    public static void setLec(Reading lec) {
        Manager.lec = lec;
    }

    public static Employee getEmpleado() {
        return empleado;
    }

    public static void setEmpleado(Employee empleado) {
        Manager.empleado = empleado;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public static int getCantEmpleados() {
        return cantEmpleados;
    }

    public static void setCantEmpleados(int cantEmpleados) {
        Manager.cantEmpleados = cantEmpleados;
    }
    
    
    
            
}
