/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carropjt.ali;

/**
 *
 * @author ALI FERK
 */

import javax.swing.JOptionPane;

public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private double valorPorKm;

    public Carro() {
        cadastrarCarro();
    }

    public void cadastrarCarro() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID do Carro:"));
        modelo = JOptionPane.showInputDialog("Modelo do Carro:");
        marca = JOptionPane.showInputDialog("Marca do Carro:");
        valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Valor por Km do Carro:"));
    }

    public String mostrarDadosCarro() {
        return "Modelo: " + modelo + "\n" +
               "Marca: " + marca + "\n" +
               "Valor por Km: " + valorPorKm + "\n";
        }
 

          public double getValorPorKm() {
        return valorPorKm;
    }
}