package cinema;

import ui.Mapa;
import ui.Menu;

import java.util.Scanner;

public class Cinema {
    Mapa mapa;
    Menu menu;
    Opcoes opcoes;
    Scanner input;
    boolean operando;

    public Cinema(){
        this.mapa = new Mapa();
        this.menu = new Menu();
        this.opcoes = new Opcoes();
        input = new Scanner(System.in);
        operando = true;

        System.out.println("Bem vindo! Selecione a operação desejada: ");
        while(operando){

            menu.imprimeMenu();
            int escolha = input.nextInt();
            switch (escolha){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:;
                    System.out.println("Operação cancelada.");
                    operando = false;
                    break;
                default:
                    System.out.println("Escolha uma opção válida.");

            }
        }
    }
}
