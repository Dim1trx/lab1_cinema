package cinema;

import ui.Mapa;
import ui.Menu;

import java.util.Map;
import java.util.Scanner;

public class Opcoes {
    Scanner input = new Scanner(System.in);
    Menu menu;
    Mapa mapa;

    public Opcoes() {
        this.menu = new Menu();
        this.mapa = new Mapa();
    }

    public void imprimeMenu() {
        menu.imprimeMenu();
    }

    public void imprimeMapa() {
        mapa.imprimeAssentos();
    }

    public String compraIngresso() {
        imprimeMapa();
        System.out.println();
        System.out.println("Selecione o seu assento: ");
        String assento = input.next();
        return converte(assento);

    }

    public boolean cancelaIngresso() {
        return false;
    }

    public void imprimeQuantidade() {
        mapa.imprimeQuantidade();
    }

    public boolean pergunta() {
        boolean operando = true;
        do {
            System.out.print("Deseja visualizar o mapa antes de escolher o assento? S/N ");
            char repetir = input.next().charAt(0);

            if (repetir == 'N' || repetir == 'n') {
                return false;
            }
            if (repetir == 'S' || repetir == 's') {
                return true;
            } else {
                System.out.println("Escolha uma opção válida (S/N).");
            }
        } while (true) ;
    }

    public String converte(String string){
        String retorno = primeiroDigito(string.charAt(0));

        int coluna = (int) string.charAt(1);
        //retorno += String.valueOf(coluna);

        return String.valueOf(coluna);
    }

    public String primeiroDigito(char fileira){
        return switch (fileira) {
            case 'A' -> "0";
            case 'B' -> "1";
            case 'C' -> "2";
            case 'D' -> "3";
            case 'E' -> "4";
            case 'F' -> "5";
            case 'G' -> "6";
            case 'H' -> "7";
            case 'I' -> "8";
            case 'J' -> "9";
            case 'K' -> "10";
            case 'L' -> "11";
            default -> null;
        };
    }
}

