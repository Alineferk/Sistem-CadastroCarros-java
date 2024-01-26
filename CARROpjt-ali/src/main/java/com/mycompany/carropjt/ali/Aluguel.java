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

public class Aluguel {
    private int id;
    private Carro carro;
    private Cliente cliente;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;

    public void iniciarLocacao() {
        cliente = new Cliente();
        carro = new Carro();

        qtdDias = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dias:"));
        kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Km Inicial:"));
    }

    public void fecharLocacao() {
        kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Km Final:"));

        double valorPorKm = carro.getValorPorKm();
        double valor = qtdDias * valorPorKm * (kmFinal - kmInicial);

        if (qtdDias > 10) {
            valor -= valor * 0.1; // desconto de 10% se mais de 10 dias
        }
        if (qtdDias > 20) {
            valor -= valor * 0.2; // desconto de 20% se mais de 20 dias
        }

        valorTotalAluguel = valor;
    }

    public String mostrarResumoLocacao() {
        String resumo = "Resumo Aluguel\n";
        resumo += "Cliente\n" + cliente.mostrarDadosUsuario() + "\n";
        resumo += "Carro\n" + carro.mostrarDadosCarro() + "\n";
        resumo += "Aluguel\n";
        resumo += "Quantidade de dias: " + qtdDias + "\n";
        resumo += "Km Inicial: " + kmInicial + "\n";
        resumo += "Km Final: " + kmFinal + "\n";
        resumo += "Valor Total: R$" + valorTotalAluguel + "\n";

        return resumo;
    }

    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        aluguel.iniciarLocacao();
        aluguel.fecharLocacao();
        String resumo = aluguel.mostrarResumoLocacao();
        JOptionPane.showMessageDialog(null, resumo);
    }
}
