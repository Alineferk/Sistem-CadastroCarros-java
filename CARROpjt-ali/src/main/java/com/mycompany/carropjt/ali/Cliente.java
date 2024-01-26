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

public class Cliente {
    private static int contadorIds = 1; // Contador estático para gerar IDs únicos
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente() {
        id = contadorIds++; // Atribui um ID único ao cliente e incrementa o contador
        cadastrarUsuario();
    }

    public void cadastrarUsuario() {
        nome = JOptionPane.showInputDialog("Nome do cliente:");
        cpf = JOptionPane.showInputDialog("CPF do cliente:");
        telefone = JOptionPane.showInputDialog("Telefone do cliente:");
    }

    public String mostrarDadosUsuario() {
        String dados = "Nome: " + nome + "\n" +
                       "CPF: " + cpf + "\n" +
                       "Telefone: " + telefone + "\n";
        return dados;
    }
}
