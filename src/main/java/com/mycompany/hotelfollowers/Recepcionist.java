/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers;

/**
 *
 * @author juand
 */
public class Recepcionist extends Employee{
    
    private int phoneNo;

    public Recepcionist(int phoneNo, String name, int id, String location, int horasTurno, int inicioTurno, int finTurno) {
        super(name, id, location, horasTurno, inicioTurno, finTurno);
        this.phoneNo = phoneNo;
    }
    
    
    
}
