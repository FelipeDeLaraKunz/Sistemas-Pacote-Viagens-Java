/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1.modelo;

/**
 *
 * @author felip
 */
public class Opcionais {
    private String nomeOpcional;
    private double precoOpcional;

    public Opcionais(String nomeOpcional, double precoOpcional) {
        this.nomeOpcional = nomeOpcional;
        this.precoOpcional = precoOpcional;
    }

    public String getNomeOpcional() {
        return this.nomeOpcional;
    }

    public double getPrecoOpcional() {
        return this.precoOpcional;
    }

    @Override
    public String toString() {
        return nomeOpcional + ", preço= " + precoOpcional;
    }
    
    
}
