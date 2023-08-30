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

        while(operando){
            menu.imprimeMenu();
            int escolha = input.nextInt();
            switch (escolha){
                case 1:;
                case 2:;
                case 3:;
                case 4:;
                case 5:;
                    System.out.println("Operação cancelada.");
                    operando = false;
                    continue;
                default:
                    System.out.println("Escolha uma opção válida.");

            }
        }
    }
}
