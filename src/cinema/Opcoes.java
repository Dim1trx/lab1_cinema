package cinema;

import ui.Mapa;
import ui.Menu;

import java.util.Scanner;

public class Opcoes {
    Scanner input = new Scanner(System.in);
    private Menu menu;
    private Mapa mapa;
    private char[][] assentos;
    private static final char ASSSENTO_LIVRE = 'O';
    private static final char ASSSENTO_OCUPADO = 'X';

    public Opcoes() {
        this.menu = new Menu();
        this.mapa = new Mapa();
        this.assentos = mapa.getAssentos();
    }

    public void imprimeMenu() {
        menu.imprimeMenu();
    }

    public void exibirMapa() {
        mapa.imprimeAssentos();
    }

    public boolean compraIngresso() {
        if(mapa.getQuantLivres() <= 0 ){
            System.out.println("Não possuímos mais assentos.");
            return false;
        }

        exibirMapa();
        System.out.println("Esses são os assentos disponíveis. Escolha seu assento: ");

        String escolha = input.next();

        return this.verificaECompraAssento(escolha);
    }
    public boolean cancelaIngresso() {
        if(mapa.getQuantOcupados() <= 0 ){
            System.out.println("Nenhum assento foi ocupado ainda.");
            return false;
        }
        exibirMapa();
        System.out.println("Esses são os assentos ocupados. Escolha o assento a ser cancelado: ");

        String escolha = input.next();
        return this.verificaECancelaIngresso(escolha);
    }

    public void imprimeQuantidade() {
        mapa.imprimeQuantidade();
    }
    private int converteFileira(char fileira) {
        return switch (fileira) {
            case 'A' -> 0;
            case 'B' -> 1;
            case 'C' -> 2;
            case 'D' -> 3;
            case 'E' -> 4;
            case 'F' -> 5;
            case 'G' -> 6;
            case 'H' -> 7;
            case 'I' -> 8;
            case 'J' -> 9;
            case 'K' -> 10;
            case 'L' -> 11;
            default -> -1;
        };
    }
    private int converteColuna(char fileira) {
        return switch (fileira) {
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            default -> -1;
        };
    }

    private boolean verificaECompraAssento(String escolha){
        int fileira = converteFileira(Character.toUpperCase(escolha.charAt(0)));
        boolean retorno = false;
        int coluna = 0;

        if(escolha.length() > 2){
            if(escolha.charAt(1) == '1' && escolha.charAt(2) == '0'){
                coluna = 9;
                if (mapa.verificaAssento(fileira,coluna) && assentos[fileira][coluna] == ASSSENTO_LIVRE) {
                    assentos[fileira][coluna] = ASSSENTO_OCUPADO;
                    mapa.atualizaQuantidade(1);
                    retorno = true;
                }
            }
            else {
                coluna =  10 + (converteColuna(escolha.charAt(2)) - 1);
                if (mapa.verificaAssento(fileira,coluna) && assentos[fileira][coluna] == ASSSENTO_LIVRE) {
                    assentos[fileira][coluna] = ASSSENTO_OCUPADO;
                    mapa.atualizaQuantidade(1);
                    retorno = true;
                }
            }
        }
        else{
            coluna = converteColuna(escolha.charAt(1)) - 1;
            if (mapa.verificaAssento(fileira, coluna) && assentos[fileira][coluna] == ASSSENTO_LIVRE){
                assentos[fileira][coluna] = ASSSENTO_OCUPADO;
                mapa.atualizaQuantidade(1);
                retorno = true;
            }
        }
        return retorno;
    }

    private boolean verificaECancelaIngresso(String escolha){
        int fileira = converteFileira(Character.toUpperCase(escolha.charAt(0)));
        boolean retorno = false;
        int coluna = 0;

        if(escolha.length() > 2){
            if(escolha.charAt(1) == '1' && escolha.charAt(2) == '0'){
                coluna = 9;
                if (mapa.verificaAssento(fileira,coluna) && assentos[fileira][coluna] == ASSSENTO_OCUPADO) {
                    assentos[fileira][coluna] = ASSSENTO_LIVRE;
                    mapa.atualizaQuantidade(0);
                    retorno = true;
                }
            }
            else {
                coluna =  10 + (converteColuna(escolha.charAt(2)) - 1);
                if (mapa.verificaAssento(fileira,coluna) && assentos[fileira][coluna] == ASSSENTO_OCUPADO) {
                    assentos[fileira][coluna] = ASSSENTO_LIVRE;
                    mapa.atualizaQuantidade(0);
                    retorno = true;
                }
            }
        }
        else{
            coluna = converteColuna(escolha.charAt(1)) - 1;
            if (mapa.verificaAssento(fileira, coluna) && assentos[fileira][coluna] == ASSSENTO_OCUPADO){
                assentos[fileira][coluna] = ASSSENTO_LIVRE;
                mapa.atualizaQuantidade(0);
                retorno = true;
            }
        }
        return retorno;
    }
}

