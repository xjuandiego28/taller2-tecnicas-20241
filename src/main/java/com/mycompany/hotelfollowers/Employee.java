/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers;

/**
 *
 * @author saram
 */
public class Employee {
    private String name;
    private int id;
    private String location;
    private int horasTurno;
    private int inicioTurno;
    private int finTurno;
   

    public Employee(String name, int id, String location, int horasTurno, int inicioTurno, int finTurno) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.horasTurno = horasTurno;
        this.inicioTurno = inicioTurno;
        this.finTurno = finTurno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHorasTurno() {
        return horasTurno;
    }

    public void setHorasTurno(int horasTurno) {
        this.horasTurno = horasTurno;
    }

    public float getInicioTurno() {
        return inicioTurno;
    }

    public void setInicioTurno(int inicioTurno) {
        this.inicioTurno = inicioTurno;
    }

    public float getFinTurno() {
        return finTurno;
    }

    public void setFinTurno(int finTurno) {
        this.finTurno = finTurno;
    }
    
    
    
}
