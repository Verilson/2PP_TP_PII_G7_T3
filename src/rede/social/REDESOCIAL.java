/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rede.social;

/**
 *
 * @author guga
 */
public class REDESOCIAL {

    public static void main(String[] args) {
        int opcao;

        do {
            Menu.mostrarMenuPrincipal();
            opcao = Menu.lerOpcao();

            switch (opcao) {

                case 1 -> Menu.criarConta();
                case 2 -> Menu.iniciarSessao();
                case 3 ->  System.out.println("Programa encerrado.");
                default-> System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
    }
}
