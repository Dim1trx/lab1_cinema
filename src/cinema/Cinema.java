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

            opcoes.imprimeMenu();
            int escolha = input.nextInt();
            switch (escolha){
                case 1:
                    opcoes.compraIngresso();
                    break;
                case 2:
                    opcoes.cancelaIngresso();
                    break;
                case 3:
                    opcoes.imprimeMapa();
                    break;
                case 4:
                    opcoes.imprimeQuantidade();
                    break;
                case 5:;
                    System.out.println("Operação cancelada.");
                    operando = false;
                    break;
                default:
                    System.out.println("Escolha uma opção válida.");
                    continue;
            }

            do {
                System.out.print("Deseja solicitar outra operação?  S/N: ");
                char repetir = input.next().charAt(0);

                if (repetir == 'N' || repetir == 'n') {
                    operando = false;
                }
                if(repetir == 'S' || repetir == 's'){
                    break;
                }
                else {
                    System.out.println("Escolha uma opção válida (S/N).");
                }
            } while (operando);
        }
        System.out.println("Fim do programa.");
    }
}
