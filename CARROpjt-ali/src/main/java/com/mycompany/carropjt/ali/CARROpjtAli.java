/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.carropjt.ali;

/**
 *
 * @author ALI FERK
 * import javax.swing.JOptionPane;

 */
public class CARROpjtAli {
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();

        aluguel.iniciarLocacao();
        aluguel.fecharLocacao();

        String resumo = aluguel.mostrarResumoLocacao();
        System.out.println(resumo);
    }
}




